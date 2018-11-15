/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.service.custom.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.rmi.cab.buisness.BOFactory;
import lk.ijse.rmi.cab.buisness.custom.ReservationBO;
import lk.ijse.rmi.cab.dto.ReservationDTO;
import lk.ijse.rmi.cab.observer.Observer;
import lk.ijse.rmi.cab.observer.Subject;
import lk.ijse.rmi.cab.reservation.impl.ReservationImpl;
import lk.ijse.rmi.cab.service.custom.ReservationService;

/**
 *
 * @author user
 */
public class ReservationServiceImpl extends UnicastRemoteObject implements ReservationService,Subject{
    private ReservationBO reservationBO;
    private static ReservationImpl<ReservationService> reservationResBook=new ReservationImpl<>();
    private static List<Observer>observers=new ArrayList<>();

    public ReservationServiceImpl() throws RemoteException {
        this.reservationBO=(ReservationBO) BOFactory.getInstance().getType(BOFactory.BOType.RESERVATION);
    }
    
    

    @Override
    public boolean addReservation(ReservationDTO reservationDTO) throws Exception {
        boolean result=false;
        result=reservationBO.addReservation(reservationDTO);
        if(result!=false){
            notifyAllObservers(reservationDTO.getReseveId() + "Add New Reservation");
        }
        return result;
          //return reservationBO.addReservation(reservationDTO);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateReservation(ReservationDTO reservationDTO) throws Exception {
        boolean result=false;
        result= reservationBO.updateReservation(reservationDTO);
        if(result!=false){
            notifyAllObservers(reservationDTO.getReseveId() + " This Reservation Is Update");
        }
        return result;
    }

    @Override
    public boolean deleteReservation(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ReservationDTO findReservation(String id) throws Exception {
        return reservationBO.findReservation(id);
    }

    @Override
    public List<ReservationDTO> findAllReservation() throws Exception {
        return reservationBO.findAllReservation();
    }

    @Override
    public List<ReservationDTO> getAllAvailableVehicle(String startDate, String EndDate) throws Exception {
        return reservationBO.gatAllAvailableVehicles(startDate, EndDate);
    }

    @Override
    public boolean vehicleReservatonOfNewCustomer(ReservationDTO reservationDTO) throws Exception {
        return reservationBO.vehicleReservatonOfNewCustomer(reservationDTO);
    }

    @Override
    public ReservationDTO getLastId() throws Exception {
        return reservationBO.getLastId();
    }

    @Override
    public boolean reserve(Object id) throws Exception {
        return reservationResBook.reserve(id, this, true);
    }

    @Override
    public boolean release(Object id) throws Exception {
       return reservationResBook.release(id);
    }

    @Override
    public void registerObserver(Observer observer) throws Exception {
        observers.add(observer);
    }

    @Override
    public void unRegisterObserver(Observer observer) throws Exception {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObservers(String message) throws Exception {
        new Thread(() ->{
            for(Observer observer:observers){
                
                try {
                    observer.update(message);
                } catch (Exception ex) {
                    Logger.getLogger(ReservationServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                    
                }
            }).start();
        }

    @Override
    public List<ReservationDTO> serchReserveIdForModifyReservation(String nic) throws Exception {
        return reservationBO.serchReserveIdForModifyReservation(nic);
    }

    
    
}
