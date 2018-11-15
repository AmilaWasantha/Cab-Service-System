/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.repository.custom;

import java.util.List;
import lk.ijse.rmi.cab.entity.Vehicle;
import lk.ijse.rmi.cab.repository.SuperRepository;

/**
 *
 * @author user
 */
public interface VehicleRepository extends SuperRepository<Vehicle,Integer>{
    
    public List<Vehicle>getAllAvailableVehicles(String startDate,String endDate)throws Exception;
    public Vehicle getVehicleDetailsForModify(String regNo)throws Exception;

   

    
}
