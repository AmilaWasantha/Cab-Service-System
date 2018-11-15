/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.service.custom.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import lk.ijse.rmi.cab.buisness.BOFactory;
import lk.ijse.rmi.cab.buisness.custom.CustomerBO;
import lk.ijse.rmi.cab.dto.CustomerDTO;
import lk.ijse.rmi.cab.observer.Observer;
import lk.ijse.rmi.cab.observer.Subject;
import lk.ijse.rmi.cab.reservation.impl.ReservationImpl;
import lk.ijse.rmi.cab.service.custom.CustomerService;

/**
 *
 * @author user
 */
public class CustomerServiceImpl extends UnicastRemoteObject implements CustomerService,Subject{
    private CustomerBO customerBO;
    private static ReservationImpl<CustomerService>customerResBook=new ReservationImpl<>();
    private static List<Observer> observers=new ArrayList<>();
   
    public CustomerServiceImpl() throws RemoteException {
        this.customerBO=(CustomerBO) BOFactory.getInstance().getType(BOFactory.BOType.CUSTOMER);
    }
    
    

    @Override
    public boolean addCustomer(CustomerDTO customerDTO) throws Exception {
        boolean result=false;
        result=customerBO.addCustomer(customerDTO);
        if(result!=false){
            notifyAllObservers(customerDTO.getCustId() + " New Customer Is Added Successfully");
        }
        return result;
        
    }

    @Override
    public boolean updateCustomer(CustomerDTO customerDTO) throws Exception {
        
       boolean result = false;
        if (customerResBook.reserve(customerDTO.getCustId(), this, true)) {
            result = customerBO.updateCustomer(customerDTO);
            notifyAllObservers(customerDTO.getCustId()  + " This Customer Is Updated");
            if (customerResBook.isReservedInternally(customerDTO.getCustId())){
                customerResBook.release(customerDTO.getCustId());
            }
        }
        return result;

    }

    @Override
    public boolean deleteCustomer(int id) throws Exception {
       
       boolean result = false;
        if (customerResBook.reserve(id, this, true)) {
            result = customerBO.deleteCustomer(id);
            notifyAllObservers(id + "This Customer Is Deleted");
            if (customerResBook.isReservedInternally(id)){
                customerResBook.release(id);
            }
        }
        return result;
    }

    @Override
    public CustomerDTO findCustomer(int id) throws Exception {
       return customerBO.findCustomer(id);
      
    }

    @Override
    public List<CustomerDTO> findAllCustomers() throws Exception {
       return customerBO.findAllCustomers();
    }

    @Override
    public CustomerDTO findBYNicNumber(String nic) throws Exception {
      CustomerDTO reseult=null;
      if(customerResBook.reserve(nic, this, true)){
          reseult=customerBO.findByNicNumber(nic);
          if(customerResBook.isReservedInternally(nic)){
              customerResBook.release(nic);
          }
      }
      return reseult;
     
        //return customerBO.findByNicNumber(nic);
    }

    @Override
    public boolean reserve(Object id) throws Exception {
        return customerResBook.reserve(id, this, true);
    }

    @Override
    public boolean release(Object id) throws Exception {
        return customerResBook.release(id);
    }

    @Override
    public void registerObserver(Observer observer) throws Exception {
        observers.add(observer);
    }

    @Override
    public void unRegisterObserver(Observer observer) throws Exception {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObservers(String message) throws Exception {
        new Thread(() -> {
            for (Observer observer : observers) {
                
                try {
                    observer.update(message);
                } catch (Exception ex) {
                    Logger.getLogger(CustomerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
               
            }
        }).start();
    }
    
}
