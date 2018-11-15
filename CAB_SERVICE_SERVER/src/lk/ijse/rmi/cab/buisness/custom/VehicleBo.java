/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.buisness.custom;

import java.util.List;
import lk.ijse.rmi.cab.buisness.SuperBO;
import lk.ijse.rmi.cab.dto.VehicleDTO;
import lk.ijse.rmi.cab.entity.Vehicle;

/**
 *
 * @author user
 */
public interface VehicleBo extends SuperBO{
    
    public boolean addVehicle(VehicleDTO vehicleDTO)throws Exception;
    public boolean updateVehicle(VehicleDTO vehicleDTO)throws Exception;
    public boolean deleteVehicle(int id)throws Exception;
    public VehicleDTO findVehicle(int id)throws Exception;
    public List<VehicleDTO>findAllVehicle()throws Exception;
    public List<VehicleDTO>gatAllAvailableVehicles(String startDate,String EndDate)throws Exception;
    public VehicleDTO getVehicleDetailsForModify(String regNo)throws Exception;
    
}
