/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.controller;

import java.util.List;
import lk.ijse.rmi.cab.dto.UserDTO;
import lk.ijse.rmi.cab.proxy.ProxyHandler;
import lk.ijse.rmi.cab.service.ServiceFactory;
import lk.ijse.rmi.cab.service.custom.UserService;

/**
 *
 * @author user
 */
public class LoginController {
    
    public static boolean addUser(UserDTO userDTO)throws Exception{
        UserService userService=(UserService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.User);
        return userService.addUser(userDTO);
    }
    
    public static List<UserDTO>getAllUsers()throws Exception{
        UserService userService=(UserService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.User);
        return userService.getAllUser();
    }
    
    public static UserDTO findUser(String id)throws Exception{
        UserService userService=(UserService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.User);
        return userService.findUser(id);
    }
    
    
}
