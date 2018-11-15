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
import lk.ijse.rmi.cab.buisness.BOFactory;
import lk.ijse.rmi.cab.buisness.custom.UserBO;
import lk.ijse.rmi.cab.dto.UserDTO;
import lk.ijse.rmi.cab.observer.Observer;
import lk.ijse.rmi.cab.observer.Subject;
import lk.ijse.rmi.cab.reservation.impl.ReservationImpl;
import lk.ijse.rmi.cab.service.custom.UserService;

/**
 *
 * @author user
 */
public class UserServiceImpl extends UnicastRemoteObject implements UserService,Subject{
    
    private UserBO userBO;
    private static ReservationImpl<UserService> userResBook=new ReservationImpl<>();

    public UserServiceImpl()throws RemoteException{
       this.userBO=(UserBO) BOFactory.getInstance().getType(BOFactory.BOType.USER);
    }
    
    
    

    @Override
    public boolean addUser(UserDTO userDTO) throws Exception {
       return userBO.addUser(userDTO);
    }

    @Override
    public List<UserDTO> getAllUser() throws Exception {
       List<UserDTO> u=new ArrayList();
        for (UserDTO userDTO : u) {
            System.out.println("3333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333");
            System.out.println(userDTO.getPassword());
            System.out.println(userDTO.getType());
            System.out.println(userDTO.getUserName());
            
        }
        
        return userBO.getAllUsers();
    }

    @Override
    public boolean updateUser(UserDTO userDTO) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteUser(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UserDTO findUser(String id) throws Exception {
        return userBO.findUser(id);
    }

    @Override
    public boolean reserve(Object id) throws Exception {
        return userResBook.reserve(id, this, true);
    }

    @Override
    public boolean release(Object id) throws Exception {
        return userResBook.release(id);
    }

    @Override
    public void registerObserver(Observer observer) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void unRegisterObserver(Observer observer) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void notifyAllObservers(String message) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
