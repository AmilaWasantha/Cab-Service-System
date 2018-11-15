/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.buisness.custom.impl;

import java.util.ArrayList;
import java.util.List;
import lk.ijse.rmi.cab.buisness.custom.CustomerBO;
import lk.ijse.rmi.cab.dto.CustomerDTO;
import lk.ijse.rmi.cab.entity.Customer;
import lk.ijse.rmi.cab.repository.RepositoryFactory;
import lk.ijse.rmi.cab.repository.custom.CustomerRepository;
import lk.ijse.rmi.cab.resource.HibernateUtil;
import org.hibernate.Hibernate;
import org.hibernate.Session;

/**
 *
 * @author user
 */
public class CustomerBOImpl implements CustomerBO{
    private CustomerRepository customerRepository;

    public CustomerBOImpl() {
        this.customerRepository=(CustomerRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryType.CUSTOMER);
    }
    
    

    @Override
    public boolean addCustomer(CustomerDTO customerDTO) throws Exception {
        try(Session session=HibernateUtil.getSessionFactory().openSession()){
        customerRepository.setSesstion(session);
        session.beginTransaction();
        
        Customer customer=new Customer(customerDTO.getCustName(),customerDTO.getCustNic(),customerDTO.getCustLicenseId(),customerDTO.getCustTelNumber(),
        customerDTO.getCustDob());
        boolean isAdded=customerRepository.save(customer);
        session.getTransaction().commit();
        return isAdded;
        }
        
    }
    

    @Override
    public boolean updateCustomer(CustomerDTO customerDTO) throws Exception {
        Session session=HibernateUtil.getSessionFactory().openSession();
        customerRepository.setSesstion(session);
        session.beginTransaction();
        
        Customer customer=new Customer();
        customer.setCustId(customerDTO.getCustId());
        customer.setCustName(customerDTO.getCustName());
        customer.setCustNic(customerDTO.getCustNic());
        customer.setCustLicenseId(customerDTO.getCustLicenseId());
        customer.setCustTelNumber(customerDTO.getCustTelNumber());
        customer.setCustDob(customerDTO.getCustDob());
        
        customerRepository.update(customer);
        session.getTransaction().commit();
        return true;
    }

    @Override
    public boolean deleteCustomer(int id) throws Exception {
        Session session=HibernateUtil.getSessionFactory().openSession();
        customerRepository.setSesstion(session);
        session.beginTransaction();
        
        Customer customer=customerRepository.findBYId(id);
        if(customer!=null){
        customerRepository.delete(customer);
        session.getTransaction().commit();
        return true;
       }else{
            return false;
        }
    }

    @Override
    public CustomerDTO findCustomer(int id) throws Exception {
        Session session=HibernateUtil.getSessionFactory().openSession();
        customerRepository.setSesstion(session);
        session.beginTransaction();
        
        Customer customer=customerRepository.findBYId(id);
        session.getTransaction().commit();
        if(customer!=null){
            CustomerDTO customerDTO=new CustomerDTO();
            customerDTO.setCustId(customer.getCustId());
            customerDTO.setCustName(customer.getCustName());
            customerDTO.setCustNic(customer.getCustNic());
            customerDTO.setCustLicenseId(customer.getCustLicenseId());
            customerDTO.setCustTelNumber(customer.getCustTelNumber());
            customerDTO.setCustDob(customer.getCustDob());
            return customerDTO;
        }else{
            return null;
        }
    }

    @Override
    public List<CustomerDTO> findAllCustomers() throws Exception {
        try(Session session=HibernateUtil.getSessionFactory().openSession()){
        customerRepository.setSesstion(session);
        session.beginTransaction();
        
        List<Customer>customers=customerRepository.findAll();
        session.getTransaction().commit();
        List<CustomerDTO>customerDTOs=new ArrayList<>();
        for (Customer customer : customers) {
            CustomerDTO customerDTO=new CustomerDTO();
            customerDTO.setCustId(customer.getCustId());
            customerDTO.setCustName(customer.getCustName());
            customerDTO.setCustNic(customer.getCustNic());
            customerDTO.setCustLicenseId(customer.getCustLicenseId());
            customerDTO.setCustTelNumber(customer.getCustTelNumber());
            customerDTO.setCustDob(customer.getCustDob());
            customerDTOs.add(customerDTO);
        }
        return customerDTOs;
        }
    }

    @Override
    public CustomerDTO findByNicNumber(String nic) throws Exception {
       try( Session session=HibernateUtil.getSessionFactory().openSession()){
        customerRepository.setSesstion(session);
        session.beginTransaction();
        
        Customer customer=customerRepository.findByNicNumber(nic);
        session.getTransaction().commit();
        if(customer!=null){
            CustomerDTO customerDTO=new CustomerDTO();
            customerDTO.setCustId(customer.getCustId());
            customerDTO.setCustName(customer.getCustName());
            customerDTO.setCustNic(customer.getCustNic());
            customerDTO.setCustLicenseId(customer.getCustLicenseId());
            customerDTO.setCustTelNumber(customer.getCustTelNumber());
            customerDTO.setCustDob(customer.getCustDob());
            return customerDTO;
        }else{
            return null;
        }
       }
        
    }
    
}
