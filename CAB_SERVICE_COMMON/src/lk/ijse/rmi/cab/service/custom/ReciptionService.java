/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.service.custom;

import java.util.List;
import lk.ijse.rmi.cab.dto.ReciptionDTO;
import lk.ijse.rmi.cab.service.SuperService;

/**
 *
 * @author user
 */
public interface ReciptionService extends SuperService{
    public boolean addReciption(ReciptionDTO reciptionDTO)throws Exception;
    public boolean updateReciption(ReciptionDTO reciptionDTO)throws Exception;
    public boolean deleteReciption(int id)throws Exception;
    public ReciptionDTO findReciption(int id)throws Exception;
    public List<ReciptionDTO>findAllReciption()throws Exception;
}
