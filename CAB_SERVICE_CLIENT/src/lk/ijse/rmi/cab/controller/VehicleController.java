/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.controller;

import java.util.List;

import lk.ijse.rmi.cab.dto.VehicleDTO;
import lk.ijse.rmi.cab.observer.Observer;
import lk.ijse.rmi.cab.observer.Subject;
import lk.ijse.rmi.cab.proxy.ProxyHandler;
import lk.ijse.rmi.cab.service.ServiceFactory;
import lk.ijse.rmi.cab.service.custom.VehicleService;

/**
 *
 * @author user
 */
public class VehicleController {
    
    public static boolean addVehicle(VehicleDTO vehicleDTO)throws Exception{
        VehicleService vehicleServic=(VehicleService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.VEHICLE);
        return vehicleServic.addVehicle(vehicleDTO);
    }
    
    public static boolean updateVehicle(VehicleDTO vehicleDTO)throws Exception{
        VehicleService vehicleService=(VehicleService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.VEHICLE);
        return vehicleService.updateVehicle(vehicleDTO);
    }
    
    public static boolean deleteVehicle(int id)throws Exception{
        VehicleService vehicleService=(VehicleService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.VEHICLE);
        return vehicleService.deleteVehicle(id);
    }
    
    public static VehicleDTO findVehicle(int id)throws Exception{
        VehicleService vehicleService=(VehicleService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.VEHICLE);
        return vehicleService.findVehicle(id);
    }
    
    public static List<VehicleDTO> findAllVehicles()throws Exception{
        VehicleService vehicleService=(VehicleService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.VEHICLE);
        return vehicleService.findAllVehicle();
    }
    public static List<VehicleDTO>getAllAvailableVehicle(String startDate,String endDate)throws Exception{
        VehicleService vehicleService=(VehicleService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.VEHICLE);
        return vehicleService.getAllAvailableVehicle(startDate, endDate);
    }
    public static VehicleDTO getVehicleDetailsForModify(String regNo)throws Exception{
        VehicleService vehicleService=(VehicleService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.VEHICLE);
        return vehicleService.getVehicleDetailsForModify(regNo);
    }
    
    public static void registerObserver(Observer observer)throws Exception{
        Subject vehicleService=(Subject) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.VEHICLE);
        vehicleService.registerObserver(observer);
    }
    public static boolean reserve(String regNo)throws Exception{
        VehicleService vehicleService=(VehicleService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.VEHICLE);
        return vehicleService.reserve(regNo);
    }
    public static boolean release(String regNo)throws Exception{
        VehicleService vehicleService=(VehicleService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.VEHICLE);
        return vehicleService.release(regNo);
    }
}
