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
import lk.ijse.rmi.cab.buisness.custom.InsuaranceCompanyBO;
import lk.ijse.rmi.cab.dto.InsuaranceCompanyDTO;
import lk.ijse.rmi.cab.observer.Observer;
import lk.ijse.rmi.cab.observer.Subject;
import lk.ijse.rmi.cab.reservation.impl.ReservationImpl;
import lk.ijse.rmi.cab.service.custom.InsuaranceCompanyService;

/**
 *
 * @author user
 */
public class InsuaranceCompanyServiceImpl extends UnicastRemoteObject implements InsuaranceCompanyService,Subject{
    
    private InsuaranceCompanyBO insuaranceCompanyBO;
    private static ReservationImpl<InsuaranceCompanyService>insuaranceCompanyResBook=new ReservationImpl<>();
    
    public InsuaranceCompanyServiceImpl() throws RemoteException {
        this.insuaranceCompanyBO=(InsuaranceCompanyBO) BOFactory.getInstance().getType(BOFactory.BOType.INSUARANCECOMPANY);
    }
    
    

    @Override
    public boolean addInsuaranceCompany(InsuaranceCompanyDTO insuaranceCompanyDTO) throws Exception {
        return insuaranceCompanyBO.addInsuaranceCompany(insuaranceCompanyDTO);
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
//    public InsuaranceCompanyDTO findInsuaranceCompany(int InsuaranceCompanyName) throws Exception {
//        return insuaranceCompanyBO.findInsuranceCompany(InsuaranceCompanyName);
//    }

    @Override
    public List<InsuaranceCompanyDTO> findAllInsuaranceCompany() throws Exception {
        return insuaranceCompanyBO.findAllInsuaranceCompany();
    }

    @Override
    public InsuaranceCompanyDTO getFindByCompanyName(String CompanyName) throws Exception {
        return insuaranceCompanyBO.getFindByCompanyName(CompanyName);
    }

    @Override
    public InsuaranceCompanyDTO serchById(String id) throws Exception {
        return insuaranceCompanyBO.serchBYId(id);
    }

    @Override
    public boolean reserve(Object id) throws Exception {
        return insuaranceCompanyResBook.reserve(id, this, true);
    }

    @Override
    public boolean release(Object id) throws Exception {
        return insuaranceCompanyResBook.release(id);
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
