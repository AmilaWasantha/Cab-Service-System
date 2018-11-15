/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.repository.custom;

import java.util.List;
import lk.ijse.rmi.cab.dto.CustomerDTO;
import lk.ijse.rmi.cab.entity.Customer;
import lk.ijse.rmi.cab.entity.Reservation;
import lk.ijse.rmi.cab.repository.SuperRepository;

/**
 *
 * @author user
 */
public interface CustomerRepository extends SuperRepository<Customer, Integer>{
    
    public Customer findByNicNumber(String NicNumber)throws Exception;
    
   
}
