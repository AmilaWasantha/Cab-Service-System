/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.buisness.custom;

import java.util.List;
import lk.ijse.rmi.cab.buisness.SuperBO;
import lk.ijse.rmi.cab.dto.CustomerDTO;

/**
 *
 * @author user
 */
public interface CustomerBO extends SuperBO{
    
    public boolean addCustomer(CustomerDTO customerDTO)throws Exception;
    public boolean updateCustomer(CustomerDTO customerDTO)throws Exception;
    public CustomerDTO findCustomer(int id)throws Exception;
    public List<CustomerDTO>findAllCustomers()throws Exception;
    public CustomerDTO findByNicNumber(String nic)throws Exception;
    public boolean deleteCustomer(int id)throws Exception;
    
}
