/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.buisness.custom.impl;

import java.util.ArrayList;
import java.util.List;
import lk.ijse.rmi.cab.buisness.SuperBO;
import lk.ijse.rmi.cab.buisness.custom.UserBO;
import lk.ijse.rmi.cab.dto.UserDTO;
import lk.ijse.rmi.cab.entity.Reciption;
import lk.ijse.rmi.cab.entity.User;
import lk.ijse.rmi.cab.repository.RepositoryFactory;
import lk.ijse.rmi.cab.repository.custom.ReciptionRepository;
import lk.ijse.rmi.cab.repository.custom.UserRepository;
import lk.ijse.rmi.cab.resource.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author user
 */
public class UserBOImpl implements UserBO{
    
    private UserRepository userRepository;
    private ReciptionRepository reciptionRepository;

    public UserBOImpl() {
        this.userRepository=(UserRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryType.USER);
        this.reciptionRepository=(ReciptionRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryType.RECIPTION);
    }

    @Override
    public boolean addUser(UserDTO userDTO) throws Exception {
        
           try( Session session=HibernateUtil.getSessionFactory().openSession()){
            userRepository.setSesstion(session);
            reciptionRepository.setSesstion(session);
            session.beginTransaction();
            
            User user=new User(userDTO.getUserName(),userDTO.getPassword(),userDTO.getType());
            boolean result=userRepository.save(user);
            
            
                Reciption user1=new Reciption(userDTO.getUserName());
                reciptionRepository.save(user1);
                
                session.getTransaction().commit();
                
            
            
            return result;
           }
       
        
            
           
            
        
    }

    @Override
    public boolean updateUser(UserDTO userDTO) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteUser(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UserDTO findUser(String id) throws Exception {
       try( Session session=HibernateUtil.getSessionFactory().openSession()){
        userRepository.setSesstion(session);
        session.beginTransaction();
        
        User user=userRepository.findBYId(id);
        session.getTransaction().commit();
        if(user!=null){
            UserDTO userDTO=new UserDTO(user.getUserName(),user.getPassword(),user.getType());
            return userDTO;
        }else{
            return null;
        }
       }
    }

    @Override
    public List<UserDTO> getAllUsers() throws Exception {
          try(Session session=HibernateUtil.getSessionFactory().openSession()){
        userRepository.setSesstion(session);
        session.beginTransaction();
        List<User> user=userRepository.findAll();
        session.getTransaction().commit();
        if(user!=null){
            List<UserDTO> userDTO=new ArrayList<>();
            
            for (User user1 : user) {
                UserDTO u=new UserDTO(user1.getUserName(),user1.getPassword(),user1.getType());
            System.out.println(u.getUserName());
                System.out.println(u.getPassword());
                System.out.println(u.getType());
                 userDTO.add(u);
                 
                 
            }
             return userDTO;
                    
        }else{
            return null;
        }         
            
           
            
        
       
          }
    }
    

  
    
    
    
    
    
}
