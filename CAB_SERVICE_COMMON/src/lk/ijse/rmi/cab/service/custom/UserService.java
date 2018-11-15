/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.service.custom;

import java.util.List;
import lk.ijse.rmi.cab.dto.UserDTO;
import lk.ijse.rmi.cab.service.SuperService;

/**
 *
 * @author user
 */
public interface UserService extends SuperService{
    public boolean addUser(UserDTO userDTO)throws Exception;
    public boolean updateUser(UserDTO userDTO)throws Exception;
    public boolean deleteUser(String id)throws Exception;
    public UserDTO findUser(String id)throws Exception;
    public List<UserDTO>getAllUser()throws Exception;
    
}
