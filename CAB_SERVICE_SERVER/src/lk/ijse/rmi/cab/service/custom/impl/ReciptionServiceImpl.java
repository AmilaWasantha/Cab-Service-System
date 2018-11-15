/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.service.custom.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import lk.ijse.rmi.cab.buisness.BOFactory;
import lk.ijse.rmi.cab.buisness.custom.ReciptionBO;
import lk.ijse.rmi.cab.dto.ReciptionDTO;
import lk.ijse.rmi.cab.observer.Observer;
import lk.ijse.rmi.cab.observer.Subject;
import lk.ijse.rmi.cab.reservation.impl.ReservationImpl;
import lk.ijse.rmi.cab.service.custom.ReciptionService;

/**
 *
 * @author user
 */
public class ReciptionServiceImpl extends UnicastRemoteObject implements ReciptionService,Subject{
    private ReciptionBO reciptionBO;
    private static ReservationImpl<ReciptionService> reciptionResBook=new ReservationImpl<>();

    public ReciptionServiceImpl() throws RemoteException {
        this.reciptionBO=(ReciptionBO) BOFactory.getInstance().getType(BOFactory.BOType.RECIPTION);
    }
    
    

    @Override
    public boolean addReciption(ReciptionDTO reciptionDTO) throws Exception {
        return reciptionBO.addReciption(reciptionDTO);
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
    public List<ReciptionDTO> findAllReciption() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean reserve(Object id) throws Exception {
        return reciptionResBook.reserve(id, this, true);
    }

    @Override
    public boolean release(Object id) throws Exception {
        return reciptionResBook.release(id);
    }

    @Override
    public void registerObserver(Observer observer) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void unRegisterObserver(Observer observer) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void notifyAllObservers(String message) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
