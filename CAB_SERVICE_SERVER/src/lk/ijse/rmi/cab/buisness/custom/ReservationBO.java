/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.buisness.custom;

import java.util.List;
import lk.ijse.rmi.cab.buisness.SuperBO;
import lk.ijse.rmi.cab.dto.ReservationDTO;
import org.hibernate.Session;

/**
 *
 * @author user
 */
public interface ReservationBO extends SuperBO{
    
    public boolean addReservation(ReservationDTO reservationDTO)throws Exception;
    public boolean updateReservation(ReservationDTO reservationDTO)throws Exception;
    public boolean deleteReservation(int id)throws Exception;
    public ReservationDTO findReservation(String id)throws Exception;
    public List<ReservationDTO>findAllReservation()throws Exception;
    
    public List<ReservationDTO>gatAllAvailableVehicles(String startDate,String EndDate)throws Exception;
    public boolean vehicleReservatonOfNewCustomer(ReservationDTO reservationDTO)throws Exception;
    
    public ReservationDTO getLastId()throws Exception;
    
    public List<ReservationDTO>serchReserveIdForModifyReservation(String nic)throws Exception;
    
}
