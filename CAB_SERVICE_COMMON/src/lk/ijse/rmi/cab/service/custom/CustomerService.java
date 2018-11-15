/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.service.custom;

import java.util.List;
import lk.ijse.rmi.cab.dto.CustomerDTO;
import lk.ijse.rmi.cab.service.SuperService;

/**
 *
 * @author user
 */
public interface CustomerService extends SuperService{
    public boolean addCustomer(CustomerDTO customerDTO)throws Exception;
    public boolean updateCustomer(CustomerDTO customerDTO)throws Exception;
    public boolean deleteCustomer(int id)throws Exception;
    public CustomerDTO findCustomer(int id)throws Exception;
    public List<CustomerDTO>findAllCustomers()throws Exception;
    public CustomerDTO findBYNicNumber(String nic)throws Exception;
    
}
