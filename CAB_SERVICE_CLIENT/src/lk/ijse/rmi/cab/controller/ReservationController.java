/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.controller;

import java.util.List;
import lk.ijse.rmi.cab.dto.ReservationDTO;
import lk.ijse.rmi.cab.observer.Observer;
import lk.ijse.rmi.cab.observer.Subject;
import lk.ijse.rmi.cab.proxy.ProxyHandler;
import lk.ijse.rmi.cab.service.ServiceFactory;
import lk.ijse.rmi.cab.service.custom.ReservationService;
import lk.ijse.rmi.cab.view.VehicleReserveForm;

/**
 *
 * @author user
 */
public class ReservationController {
    
    public static boolean addReservation(ReservationDTO reservationDTO)throws Exception{
        ReservationService reservationService=(ReservationService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.RESERVATION);
        return reservationService.addReservation(reservationDTO);
    }
    
    public static boolean updateReservation(ReservationDTO reservationDTO)throws Exception{
        ReservationService reservationService=(ReservationService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.RESERVATION);
        return reservationService.updateReservation(reservationDTO);
    }
    
    public static boolean deleteReservation(int id)throws Exception{
        ReservationService reservationService=(ReservationService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.RESERVATION);
        return reservationService.deleteReservation(id);
    }
    
    public static ReservationDTO findResrvation(String id)throws Exception{
        ReservationService reservationService=(ReservationService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.RESERVATION);
        return reservationService.findReservation(id);
    }
    
    public static List<ReservationDTO>findAllReservations()throws Exception{
        ReservationService reservationService=(ReservationService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.RESERVATION);
        return reservationService.findAllReservation();
    }
    
    public static List<ReservationDTO>getAllAvailableVehicle(String startDate,String endDate)throws Exception{
        ReservationService reservationService= (ReservationService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.RESERVATION);
        return reservationService.getAllAvailableVehicle(startDate, endDate);
    }
   
    public static boolean vehicleReservatonOfNewCustomer(ReservationDTO reservationDTO)throws Exception{
        ReservationService reservationService=(ReservationService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.RESERVATION);
        return reservationService.vehicleReservatonOfNewCustomer(reservationDTO);
    }
    
    public static ReservationDTO getLastId()throws Exception{
        ReservationService reservationService=(ReservationService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.RESERVATION);
        return reservationService.getLastId();
    }

    public static void registerObserver(Observer observer)throws Exception{
        Subject reservationService=(Subject) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.RESERVATION);
        reservationService.registerObserver(observer);
    
    }
    
     public static boolean reserveReservation(int vehicleId) throws Exception{
        ReservationService reservationService=(ReservationService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.RESERVATION);
        return reservationService.reserve(vehicleId);
    }
     public static boolean reserveReservationInString (String rid) throws Exception{
        ReservationService reservationService=(ReservationService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.RESERVATION);
        return reservationService.reserve(rid);
    }
    
    public static boolean releaseReservation(int vehicleID) throws Exception{
        ReservationService reservationService=(ReservationService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.RESERVATION);
        return reservationService.release(vehicleID);
    }
      public static boolean releaseReservationInString (String rid) throws Exception{
        ReservationService reservationService=(ReservationService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.RESERVATION);
        return reservationService.release(rid);
    }
    
    public static List<ReservationDTO>serchReserveIdForModifyReservation(String nic)throws Exception{
        ReservationService reservationService=(ReservationService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.RESERVATION);
        return reservationService.serchReserveIdForModifyReservation(nic);
        
    }
}
