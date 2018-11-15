/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.repository.custom.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import lk.ijse.rmi.cab.entity.InsuaranceCompany;
import lk.ijse.rmi.cab.repository.SuperRepositoryImpl;
import lk.ijse.rmi.cab.repository.custom.InsuaranceCompanyRepository;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;


/**
 *
 * @author user
 */
public class InsuaranceCompanyRepositoryImpl implements InsuaranceCompanyRepository{
    
    private Session session;
    
    
   
    @Override
    public InsuaranceCompany getFindByCompanyName(String CompanyName) throws Exception {
      Criteria add=session.createCriteria(InsuaranceCompany.class).add(Restrictions.eq("companyName", CompanyName));
       List<InsuaranceCompany> insuaranceCompanys=add.list();
       InsuaranceCompany list=null;
        for (InsuaranceCompany insuaranceCompany : insuaranceCompanys) {
             list=new InsuaranceCompany();
             list.setInsuaranceCompanyId(insuaranceCompany.getInsuaranceCompanyId());
             list.setCompanyName(insuaranceCompany.getCompanyName());
             list.setInsuaranceType(insuaranceCompany.getInsuaranceType());
            
            
        }
        return list;
     
    }


    @Override
    public void setSesstion(Session session) {
        this.session=session;
        System.out.println("dfjslfjdskf"+session);
    }

    @Override
    public boolean save(InsuaranceCompany t) throws Exception {
         Serializable saveInsuarancCompany=session.save(t);
            if(saveInsuarancCompany!=null){
                return true;

            }else{
                return false;
            }
    }

    @Override
    public void update(InsuaranceCompany t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(InsuaranceCompany t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public InsuaranceCompany findBYId(String Id) throws Exception {
         throw new UnsupportedOperationException("Not supported yet.");
      
    }

    @Override
    public List<InsuaranceCompany> findAll() throws Exception {
       return  session.createQuery("from InsuaranceCompany").list();
    }

    @Override
    public InsuaranceCompany searchBYId(String id)throws Exception{
          Criteria add=session.createCriteria(InsuaranceCompany.class).add(Restrictions.eq("insuaranceCompanyId", id));
       List<InsuaranceCompany> insuaranceCompanys=add.list();
       InsuaranceCompany list=null;
        for (InsuaranceCompany insuaranceCompany : insuaranceCompanys) {
             list=new InsuaranceCompany();
             list.setInsuaranceCompanyId(insuaranceCompany.getInsuaranceCompanyId());
             list.setCompanyName(insuaranceCompany.getCompanyName());
             list.setInsuaranceType(insuaranceCompany.getInsuaranceType());
            
            
        }
        return list;
        //To change body of generated methods, choose Tools | Templates.
    }

   

  
}
