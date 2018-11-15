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
import lk.ijse.rmi.cab.buisness.custom.VehicleBo;
import lk.ijse.rmi.cab.dto.VehicleDTO;
import lk.ijse.rmi.cab.observer.Observer;
import lk.ijse.rmi.cab.observer.Subject;
import lk.ijse.rmi.cab.reservation.impl.ReservationImpl;
import lk.ijse.rmi.cab.service.custom.VehicleService;

/**
 *
 * @author user
 */
public class VehicleServiceImpl extends UnicastRemoteObject implements VehicleService,Subject{
    private VehicleBo vehicleBo;
    private static ReservationImpl<VehicleService> vehicleResBook=new ReservationImpl<>();
    private static List<Observer>observers=new ArrayList<>();
    
    public VehicleServiceImpl() throws RemoteException {
        this.vehicleBo=(VehicleBo) BOFactory.getInstance().getType(BOFactory.BOType.VEHICLE);
    }
    
    

    @Override
    public boolean addVehicle(VehicleDTO vehicleDTO) throws Exception{
       boolean result=false;
       result =vehicleBo.addVehicle(vehicleDTO);
       if(result!=false){
           notifyAllObservers(vehicleDTO.getVehicleId() + "this vehicle is Added");
       }
       return result;
            //return vehicleBo.addVehicle(vehicleDTO);
       
    }

    @Override
    public boolean updateVehicle(VehicleDTO vehicleDTO) throws Exception {
       boolean result=false;
       if(vehicleResBook.reserve(vehicleDTO.getVehicleId(), this, true)){
            result=vehicleBo.updateVehicle(vehicleDTO);
            notifyAllObservers(vehicleDTO.getVehicleId() + " This vehicle is has been update");
            if(vehicleResBook.isReservedInternally(vehicleDTO.getVehicleId())){
                vehicleResBook.release(vehicleDTO.getVehicleId());
            }
       }
       return result;
    }

    @Override
    public boolean deleteVehicle(int id) throws Exception {
        boolean result=false;
        if(vehicleResBook.reserve(id, this, true)){
            result=vehicleBo.deleteVehicle(id);
            notifyAllObservers( id + "This Vehicle Is Deleted");
            if(vehicleResBook.isReservedInternally(id)){
                vehicleResBook.release(id);
            }
        }
        return result;
    }

    @Override
    public VehicleDTO findVehicle(int id) throws Exception {
        return vehicleBo.findVehicle(id);
    }

    @Override
    public List<VehicleDTO> findAllVehicle() throws Exception {
        return vehicleBo.findAllVehicle();
    }

    @Override
    public List<VehicleDTO> getAllAvailableVehicle(String startDate, String EndDate) throws Exception {
        return vehicleBo.gatAllAvailableVehicles(startDate, EndDate);
    }

    @Override
    public VehicleDTO getVehicleDetailsForModify(String regNo) throws Exception {
        return vehicleBo.getVehicleDetailsForModify(regNo);
    }

    @Override
    public boolean reserve(Object id) throws Exception {
        return vehicleResBook.reserve(id, this, true);
    }

    @Override
    public boolean release(Object id) throws Exception {
        return vehicleResBook.release(id);
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
               new Thread(() -> {
            for (Observer observer : observers) {
               
                try {
                    observer.update(message);
                } catch (Exception ex) {
                    Logger.getLogger(VehicleServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
                }
                
               
            }
        }).start();
    }
    
}
