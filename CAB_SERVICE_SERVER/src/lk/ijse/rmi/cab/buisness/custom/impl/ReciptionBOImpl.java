/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.buisness.custom.impl;

import java.util.List;
import lk.ijse.rmi.cab.buisness.custom.ReciptionBO;
import lk.ijse.rmi.cab.dto.ReciptionDTO;
import lk.ijse.rmi.cab.repository.RepositoryFactory;
import lk.ijse.rmi.cab.repository.custom.CustomerRepository;
import lk.ijse.rmi.cab.repository.custom.ReciptionRepository;

/**
 *
 * @author user
 */
public class ReciptionBOImpl implements ReciptionBO{
    private ReciptionRepository reciptionRepository;
    

    public ReciptionBOImpl() {
        this.reciptionRepository=(ReciptionRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryType.RECIPTION);
                        
    }
    
    

    @Override
    public boolean addReciption(ReciptionDTO reciptionDTO) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateReciption(ReciptionDTO reciptionDTO) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteReciption(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ReciptionDTO findReciption(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ReciptionDTO> getAllReciption() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
