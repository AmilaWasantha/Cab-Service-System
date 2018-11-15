/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.repository.custom;

import lk.ijse.rmi.cab.entity.User;
import lk.ijse.rmi.cab.repository.SuperRepository;
import org.hibernate.Session;

/**
 *
 * @author user
 */
public interface UserRepository extends SuperRepository<User, String>{
   
    
}
