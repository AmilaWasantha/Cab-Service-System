/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.repository.custom.impl;

import java.io.Serializable;
import java.util.List;
import lk.ijse.rmi.cab.entity.Customer;
import lk.ijse.rmi.cab.repository.custom.CustomerRepository;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author user
 */
public class CustomerRepositoryImpl implements CustomerRepository{

    private Session session;

    @Override
    public void setSesstion(Session session) {
       this.session=session;
    }

    @Override
    public boolean save(Customer customer) throws Exception {
        Serializable addCustomer=session.save(customer);
        if(addCustomer!=null){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void update(Customer t) throws Exception {
        session.update(t);
    }

    

    @Override
    public Customer findBYId(Integer id) throws Exception {
        Customer customer=session.get(Customer.class, id);
         return customer;
    }

    @Override
    public List<Customer> findAll() throws Exception {
       return session.createCriteria(Customer.class).list();
    }

    @Override
    public Customer findByNicNumber(String NicNumber) throws Exception {
        Criteria add=session.createCriteria(Customer.class).add(Restrictions.eq("custNic", NicNumber));
        List<Customer>customers=add.list();
        Customer customer=null;
        for (Customer customer1 : customers) {
            customer=new Customer();
            customer.setCustId(customer1.getCustId());
            customer.setCustName(customer1.getCustName());
            customer.setCustNic(customer1.getCustNic());
            customer.setCustLicenseId(customer1.getCustLicenseId());
            customer.setCustTelNumber(customer1.getCustTelNumber());
            customer.setCustDob(customer1.getCustDob());
            
        }
        return customer;
    }

    @Override
    public void delete(Customer t) throws Exception {
        session.delete(t);
    }

   

   

    


    
   
   
    
}
