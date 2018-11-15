/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.service.custom;

import java.util.List;
import lk.ijse.rmi.cab.dto.ReservationDTO;
import lk.ijse.rmi.cab.service.SuperService;

/**
 *
 * @author user
 */
public interface ReservationService extends SuperService{
    public boolean addReservation(ReservationDTO reservationDTO)throws Exception;
    public boolean updateReservation(ReservationDTO reservationDTO)throws Exception;
    public boolean deleteReservation(int id)throws Exception;
    public ReservationDTO findReservation(String id)throws Exception;
    public List<ReservationDTO>findAllReservation()throws Exception;
    
    public List<ReservationDTO>getAllAvailableVehicle(String startDate, String EndDate)throws Exception;
    public boolean vehicleReservatonOfNewCustomer(ReservationDTO reservationDTO)throws Exception;
    public ReservationDTO getLastId()throws Exception;
    public List<ReservationDTO>serchReserveIdForModifyReservation(String nic)throws Exception;
    
}
