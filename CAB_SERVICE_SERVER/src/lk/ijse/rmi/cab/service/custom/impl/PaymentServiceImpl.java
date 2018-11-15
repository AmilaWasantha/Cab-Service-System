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
import lk.ijse.rmi.cab.buisness.custom.PaymentBO;
import lk.ijse.rmi.cab.dto.PaymentDTO;
import lk.ijse.rmi.cab.observer.Observer;
import lk.ijse.rmi.cab.observer.Subject;
import lk.ijse.rmi.cab.reservation.impl.ReservationImpl;
import lk.ijse.rmi.cab.service.custom.PaymentService;

/**
 *
 * @author user
 */
public class PaymentServiceImpl extends UnicastRemoteObject implements PaymentService,Subject{
    private PaymentBO paymentBO;
    private static ReservationImpl<PaymentService>paymentResBook=new ReservationImpl<>();

    public PaymentServiceImpl() throws RemoteException {
        this.paymentBO=(PaymentBO) BOFactory.getInstance().getType(BOFactory.BOType.PAYMENT);
    }
    
    

    @Override
    public boolean addPayment(PaymentDTO paymentDTO) throws Exception {
        return paymentBO.addPayment(paymentDTO);
    }

    @Override
    public boolean updatePayment(PaymentDTO paymentDTO) throws Exception {
        return paymentBO.updatePayment(paymentDTO);
    }

    @Override
    public boolean deletePayment(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PaymentDTO findPayment(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PaymentDTO> findAllPayment() throws Exception {
        return paymentBO.findAllPayment();
    }

    @Override
    public PaymentDTO findDetailsforFullPayment(int id) throws Exception {
        return paymentBO.findDetailsforFullPayment(id);
    }

    @Override
    public boolean reserve(Object id) throws Exception {
        return paymentResBook.reserve(id, this, true);
    }

    @Override
    public boolean release(Object id) throws Exception {
        return paymentResBook.release(id);
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

    @Override
    public List<PaymentDTO> serchDetailsForModifyReservation(String rid) throws Exception {
        return paymentBO.serchDetailsForModifyReservation(rid);
    }
    
}
