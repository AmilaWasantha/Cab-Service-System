/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.repository.custom;

import java.util.List;
import lk.ijse.rmi.cab.entity.Reservation;
import lk.ijse.rmi.cab.repository.SuperRepository;

/**
 *
 * @author user
 */
public interface ReservationRepository extends SuperRepository<Reservation,String>{
    
    public List<Reservation>getAllAvailableVehicles(String startDate,String endDate)throws Exception;
    
    public boolean vehicleReservatonOfNewCustomer(Reservation reservation)throws Exception;
    
    public Reservation getLastId()throws Exception;
    
    public List<Reservation>serchReserveIdForModifyReservation(String nic)throws Exception;
    
}
