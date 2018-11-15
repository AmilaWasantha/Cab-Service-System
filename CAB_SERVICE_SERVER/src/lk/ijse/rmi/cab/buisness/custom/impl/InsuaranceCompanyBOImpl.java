/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.buisness.custom.impl;

import java.util.ArrayList;
import java.util.List;
import lk.ijse.rmi.cab.buisness.custom.InsuaranceCompanyBO;
import lk.ijse.rmi.cab.dto.InsuaranceCompanyDTO;
import lk.ijse.rmi.cab.entity.InsuaranceCompany;
import lk.ijse.rmi.cab.repository.RepositoryFactory;
import lk.ijse.rmi.cab.repository.custom.InsuaranceCompanyRepository;
import lk.ijse.rmi.cab.resource.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author user
 */
public class InsuaranceCompanyBOImpl implements InsuaranceCompanyBO{
    
    private InsuaranceCompanyRepository insuaranceCompanyRepository;

    public InsuaranceCompanyBOImpl() {
        this.insuaranceCompanyRepository=(InsuaranceCompanyRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryType.INSUARANCECOMPANY);
    
    }
    
    

    @Override
    public boolean addInsuaranceCompany(InsuaranceCompanyDTO insuaranceCompanyDTO) throws Exception {
       try( Session session=HibernateUtil.getSessionFactory().openSession()){
        insuaranceCompanyRepository.setSesstion(session);
        session.beginTransaction();
        
        InsuaranceCompany insuaranceCompany=new InsuaranceCompany();
        insuaranceCompany.setInsuaranceCompanyId(insuaranceCompanyDTO.getInsuaranceCompanyId());
        insuaranceCompany.setCompanyName(insuaranceCompanyDTO.getCompanyName());
        insuaranceCompany.setInsuaranceType(insuaranceCompanyDTO.getInsuaranceType());
        boolean result=insuaranceCompanyRepository.save(insuaranceCompany);
        session.getTransaction().commit();
        return result;
    }
       
    }

    @Override
    public boolean updateInsuaranceCompany(InsuaranceCompanyDTO insuaranceCompanyDTO) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteInsuaranceCompany(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//    @Override
//    public InsuaranceCompanyDTO findInsuranceCompany(int InsuaranceCompanyName) throws Exception {
//       try( Session session=HibernateUtil.getSessionFactory().openSession()){
//        insuaranceCompanyRepository.setSesstion(session);
//        session.beginTransaction();
//        
//        InsuaranceCompany insuaranceCompany=insuaranceCompanyRepository.findBYId(InsuaranceCompanyName);
//        session.getTransaction().commit();
//        if(insuaranceCompany!=null){
//            InsuaranceCompanyDTO insuaranceCompanyDTO=new InsuaranceCompanyDTO(insuaranceCompany.getInsuaranceCompanyId(),insuaranceCompany.getCompanyName(),insuaranceCompany.getInsuaranceType());
//            return insuaranceCompanyDTO;
//        }else{
//            return null;
//        }
//       }
    //}

    @Override
    public List<InsuaranceCompanyDTO> findAllInsuaranceCompany() throws Exception {
        try(Session session=HibernateUtil.getSessionFactory().openSession()){
        insuaranceCompanyRepository.setSesstion(session);
        session.beginTransaction();
        
        List<InsuaranceCompany>insuaranceCompanys=insuaranceCompanyRepository.findAll();
        session.getTransaction().commit();
        
        if(insuaranceCompanys!=null){
            List<InsuaranceCompanyDTO> insuaranceCompanyDTOs=new ArrayList<>();
            
            for (InsuaranceCompany insuaranceCompany : insuaranceCompanys) {
                InsuaranceCompanyDTO insuaranceCompanyDTO=new InsuaranceCompanyDTO();
                insuaranceCompanyDTO.setInsuaranceCompanyId(insuaranceCompany.getInsuaranceCompanyId());
                insuaranceCompanyDTO.setCompanyName(insuaranceCompany.getCompanyName());
                insuaranceCompanyDTO.setInsuaranceType(insuaranceCompany.getInsuaranceType());
                insuaranceCompanyDTOs.add(insuaranceCompanyDTO);
                
            }
            return insuaranceCompanyDTOs;
        }else{
            return null;
        }
        }
    }

    @Override
    public InsuaranceCompanyDTO getFindByCompanyName(String companyName) throws Exception {
        try(Session session=HibernateUtil.getSessionFactory().openSession()){
        insuaranceCompanyRepository.setSesstion(session);
            System.out.println("fdsfufufufufu"+session);
        
        session.beginTransaction();
        
        InsuaranceCompany insuaranceCompany=insuaranceCompanyRepository.getFindByCompanyName(companyName);
        session.getTransaction().commit();
        if(insuaranceCompany!=null){
            InsuaranceCompanyDTO insuaranceCompanyDTO=new InsuaranceCompanyDTO();
            insuaranceCompanyDTO.setInsuaranceCompanyId(insuaranceCompany.getInsuaranceCompanyId());
            insuaranceCompanyDTO.setCompanyName(insuaranceCompany.getCompanyName());
            insuaranceCompanyDTO.setInsuaranceType(insuaranceCompany.getInsuaranceType());
            return insuaranceCompanyDTO;
        }else{
            return null;
        }
       }
    }

    @Override
    public InsuaranceCompanyDTO serchBYId(String id) throws Exception {
         try(Session session=HibernateUtil.getSessionFactory().openSession()){
        insuaranceCompanyRepository.setSesstion(session);
            System.out.println("fdsfufufufufu"+session);
        
        session.beginTransaction();
        
        InsuaranceCompany insuaranceCompany=insuaranceCompanyRepository.searchBYId(id);
        session.getTransaction().commit();
        if(insuaranceCompany!=null){
            InsuaranceCompanyDTO insuaranceCompanyDTO=new InsuaranceCompanyDTO();
            insuaranceCompanyDTO.setInsuaranceCompanyId(insuaranceCompany.getInsuaranceCompanyId());
            insuaranceCompanyDTO.setCompanyName(insuaranceCompany.getCompanyName());
            insuaranceCompanyDTO.setInsuaranceType(insuaranceCompany.getInsuaranceType());
            return insuaranceCompanyDTO;
        }else{
            return null;
        }
       }
    }

   
}
