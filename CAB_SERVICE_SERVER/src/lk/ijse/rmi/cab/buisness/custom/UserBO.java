/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.buisness.custom;

import java.util.List;
import lk.ijse.rmi.cab.buisness.SuperBO;
import lk.ijse.rmi.cab.dto.UserDTO;

/**
 *
 * @author user
 */
public interface UserBO extends SuperBO{
    
    public boolean addUser(UserDTO userDTO)throws Exception;
    public boolean updateUser(UserDTO userDTO)throws Exception;
    public boolean deleteUser(String id)throws Exception;
    public UserDTO findUser(String id)throws Exception;
    public List<UserDTO>getAllUsers()throws Exception;
    
}
