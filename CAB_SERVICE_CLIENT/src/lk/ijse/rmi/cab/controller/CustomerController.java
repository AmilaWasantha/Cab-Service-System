/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.controller;

import java.util.List;
import lk.ijse.rmi.cab.dto.CustomerDTO;
import lk.ijse.rmi.cab.observer.Observer;
import lk.ijse.rmi.cab.observer.Subject;
import lk.ijse.rmi.cab.proxy.ProxyHandler;
import lk.ijse.rmi.cab.service.ServiceFactory;
import lk.ijse.rmi.cab.service.custom.CustomerService;
import lk.ijse.rmi.cab.view.VehicleReserveForm;

/**
 *
 * @author user
 */
public class CustomerController {
    
    public static boolean addCustomer(CustomerDTO customerDTO)throws Exception{
        CustomerService customerService=(CustomerService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.CUSTOMER);
        return customerService.addCustomer(customerDTO);
    }
    
    public static boolean updateCustomer(CustomerDTO customerDTO)throws Exception{
        CustomerService customerService=(CustomerService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.CUSTOMER);
        return customerService.updateCustomer(customerDTO);
    }
    
    public static boolean deleteCustomer(int id)throws Exception{
        CustomerService customerService=(CustomerService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.CUSTOMER);
        return customerService.deleteCustomer(id);
    }
    
    public static CustomerDTO findCustomer(int id)throws Exception{
        CustomerService customerService=(CustomerService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.CUSTOMER);
        return customerService.findCustomer(id);
    }
    
    public static List<CustomerDTO>findAllCustomers()throws Exception{
        CustomerService customerService=(CustomerService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.CUSTOMER);
        return customerService.findAllCustomers();
    }
    
    public static CustomerDTO findBYNicNumber(String nic)throws Exception{
        CustomerService customerService=(CustomerService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.CUSTOMER);
        return customerService.findBYNicNumber(nic);
    }

    public static void registerObserver(Observer observer)throws Exception{
        Subject customerService=(Subject) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.CUSTOMER);
        customerService.registerObserver(observer);
    }
    public static boolean customerReseveByNicNumber(String nic)throws Exception{
        CustomerService customerService=(CustomerService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.CUSTOMER);
        return customerService.reserve(nic);
    }
    public static boolean customerReleaseByNicNumber(String nic)throws Exception{
        CustomerService customerService=(CustomerService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.CUSTOMER);
        return customerService.release(nic);
    }
}
