/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.buisness.custom.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.rmi.cab.buisness.custom.VehicleBo;
import lk.ijse.rmi.cab.dto.InsuaranceCompanyDTO;
import lk.ijse.rmi.cab.dto.VehicleDTO;
import lk.ijse.rmi.cab.entity.InsuaranceCompany;
import lk.ijse.rmi.cab.entity.Vehicle;
import lk.ijse.rmi.cab.repository.RepositoryFactory;
import lk.ijse.rmi.cab.repository.custom.VehicleRepository;
import lk.ijse.rmi.cab.resource.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author user
 */
public class VehicleBOImpl implements VehicleBo{
    private VehicleRepository vehicleRepository;

    public VehicleBOImpl() {
        this.vehicleRepository=(VehicleRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryType.VEHICLE);
    }
    
    

    @Override
    public boolean addVehicle(VehicleDTO vehicleDTO)   {
        boolean result=false;
       try (Session session=HibernateUtil.getSessionFactory().openSession()){
        vehicleRepository.setSesstion(session);
        session.beginTransaction();
        
        
        
            InsuaranceCompany insuaranceCompany=new InsuaranceCompany(vehicleDTO.getInsuaranceCompanyDTO().getInsuaranceCompanyId());
            insuaranceCompany.setInsuaranceCompanyId(vehicleDTO.getInsuaranceCompanyDTO().getInsuaranceCompanyId());
            insuaranceCompany.setCompanyName(vehicleDTO.getInsuaranceCompanyDTO().getCompanyName());
            insuaranceCompany.setInsuaranceType(vehicleDTO.getInsuaranceCompanyDTO().getInsuaranceType());
            Vehicle vehicle=new Vehicle(vehicleDTO.getVehicleBrand(),vehicleDTO.getVehicleInsuaranceId(),
                vehicleDTO.getRegNo(),vehicleDTO.getColour(),vehicleDTO.getSeatingCapacity(),
                vehicleDTO.getFuelType(),vehicleDTO.getStatus(),vehicleDTO.getPrice(),insuaranceCompany);
                  // InsuaranceCompany insarance= new InsuaranceCompany(/*vehicleDTO.getInsuaranceCompanyDTO().getInsuaranceCompanyId())*/); 
            
              result=vehicleRepository.save(vehicle);
             session.getTransaction().commit();
             
        
       
//                new InsuaranceCompany(vehicleDTO.getInsuaranceCompanyDTO().getCompanyName(),
//                vehicleDTO.getInsuaranceCompanyDTO().getInsuaranceType()));
        
       
        
      
       } catch (Exception ex) {
            Logger.getLogger(VehicleBOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
       return result;
        
    }

    @Override
    public boolean updateVehicle(VehicleDTO vehicleDTO) throws Exception {
        Session session=HibernateUtil.getSessionFactory().openSession();
        vehicleRepository.setSesstion(session);
        session.beginTransaction();
        
        Vehicle vehicle=new Vehicle();
        vehicle.setVehicleId(vehicleDTO.getVehicleId());
        vehicle.setVehicleBrand(vehicleDTO.getVehicleBrand());
        vehicle.setVehicleInsuaranceId(vehicleDTO.getVehicleInsuaranceId());
        vehicle.setRegNo(vehicleDTO.getRegNo());
        vehicle.setColour(vehicleDTO.getColour());
        vehicle.setSeatingCapacity(vehicleDTO.getSeatingCapacity());
        vehicle.setFuelType(vehicleDTO.getFuelType());
        vehicle.setStatus(vehicleDTO.getStatus());
        vehicle.setPrice(vehicleDTO.getPrice());
        
        InsuaranceCompany insuaranceCompany=new InsuaranceCompany();
        insuaranceCompany.setInsuaranceCompanyId(vehicleDTO.getInsuaranceCompanyDTO().getInsuaranceCompanyId());
        insuaranceCompany.setCompanyName(vehicleDTO.getInsuaranceCompanyDTO().getCompanyName());
        insuaranceCompany.setInsuaranceType(vehicleDTO.getInsuaranceCompanyDTO().getInsuaranceType());
        vehicle.setInsuaranceCompany(insuaranceCompany);
        
        vehicleRepository.update(vehicle);
        session.getTransaction().commit();
        return true;
    }

    @Override
    public boolean deleteVehicle(int id) throws Exception {
        Session session=HibernateUtil.getSessionFactory().openSession();
        vehicleRepository.setSesstion(session);
        session.beginTransaction();
        
        Vehicle vehicle=vehicleRepository.findBYId(id);
        if(vehicle!=null){
            vehicleRepository.delete(vehicle);
            session.getTransaction().commit();
            return true;
        }else{
            return false;
        }
          
        
        
        
    }

    @Override
    public VehicleDTO findVehicle(int id) throws Exception {
        try(Session session=HibernateUtil.getSessionFactory().openSession()){
        vehicleRepository.setSesstion(session);
        session.beginTransaction();
        
        Vehicle vehicle=vehicleRepository.findBYId(id);
        session.getTransaction().commit();
        if(vehicle!=null){
            VehicleDTO vehicleDTO=new VehicleDTO(vehicle.getVehicleId(),vehicle.getVehicleBrand(),
            vehicle.getVehicleInsuaranceId(),vehicle.getRegNo(),vehicle.getColour(),vehicle.getSeatingCapacity(),
            vehicle.getFuelType(),vehicle.getStatus(),vehicle.getPrice(),
            new InsuaranceCompanyDTO(vehicle.getInsuaranceCompany().getInsuaranceCompanyId()));
            return vehicleDTO;
        }else{
            return null;
        }
        }
    }

    @Override
    public List<VehicleDTO> findAllVehicle() throws Exception {
       try(Session session=HibernateUtil.getSessionFactory().openSession()){
       vehicleRepository.setSesstion(session);
       session.beginTransaction();
       
       List<Vehicle>vehicles=vehicleRepository.findAll();
       session.getTransaction().commit();
       if(vehicles!=null){
           List<VehicleDTO>vehicleDTOs=new ArrayList<>();
           
           for (Vehicle vehicle : vehicles) {
               VehicleDTO vehicleDTO=new VehicleDTO();
               vehicleDTO.setVehicleId(vehicle.getVehicleId());
               vehicleDTO.setVehicleBrand(vehicle.getVehicleBrand());
               vehicleDTO.setVehicleInsuaranceId(vehicle.getVehicleInsuaranceId());
               vehicleDTO.setRegNo(vehicle.getRegNo());
               vehicleDTO.setColour(vehicle.getColour());
               vehicleDTO.setSeatingCapacity(vehicle.getSeatingCapacity());
               vehicleDTO.setFuelType(vehicle.getFuelType());
               vehicleDTO.setStatus(vehicle.getStatus());
               vehicleDTO.setPrice(vehicle.getPrice());
               InsuaranceCompanyDTO insuaranceCompanyDTO=new InsuaranceCompanyDTO();
               insuaranceCompanyDTO.setInsuaranceCompanyId(vehicle.getInsuaranceCompany().getInsuaranceCompanyId());
               vehicleDTO.setInsuaranceCompanyDTO(insuaranceCompanyDTO);
               vehicleDTOs.add(vehicleDTO);
           }
           return vehicleDTOs;
       }else{
           return null;
       }
       }
    }

    @Override
    public List<VehicleDTO> gatAllAvailableVehicles(String startDate, String EndDate) throws Exception {
        Session session=HibernateUtil.getSessionFactory().openSession();
        vehicleRepository.setSesstion(session);
        session.beginTransaction();
        
        List<Vehicle> vehicles=vehicleRepository.getAllAvailableVehicles(startDate, EndDate);
        List<VehicleDTO> v=new ArrayList<>();
        if(vehicles!=null){
            for (Vehicle vehicle : vehicles) {
                VehicleDTO vehicleDTO=new VehicleDTO(vehicle.getVehicleId(),vehicle.getVehicleBrand(),vehicle.getVehicleInsuaranceId(),
                vehicle.getRegNo(),vehicle.getColour(),vehicle.getSeatingCapacity(),vehicle.getFuelType(),vehicle.getStatus(),
                vehicle.getPrice(),new InsuaranceCompanyDTO(vehicle.getInsuaranceCompany().getInsuaranceCompanyId()));
                v.add(vehicleDTO);
            }
            return v;
        }else{
            return null;
        }
    }

    @Override
    public VehicleDTO getVehicleDetailsForModify(String regNo) throws Exception {
        Session session=HibernateUtil.getSessionFactory().openSession();
        vehicleRepository.setSesstion(session);
        session.beginTransaction();
        
        Vehicle vehicle=vehicleRepository.getVehicleDetailsForModify(regNo);
        session.getTransaction().commit();
        
        if(vehicle!=null){
            InsuaranceCompanyDTO insuaranceCompanyDTO=new InsuaranceCompanyDTO();
            insuaranceCompanyDTO.setInsuaranceCompanyId(vehicle.getInsuaranceCompany().getInsuaranceCompanyId());
            insuaranceCompanyDTO.setCompanyName(vehicle.getInsuaranceCompany().getCompanyName());
            insuaranceCompanyDTO.setInsuaranceType(vehicle.getInsuaranceCompany().getInsuaranceType());
            
            VehicleDTO vehicleDTO=new VehicleDTO();
            vehicleDTO.setVehicleId(vehicle.getVehicleId());
            vehicleDTO.setVehicleBrand(vehicle.getVehicleBrand());
            vehicleDTO.setVehicleInsuaranceId(vehicle.getVehicleInsuaranceId());
            vehicleDTO.setRegNo(vehicle.getRegNo());
            vehicleDTO.setColour(vehicle.getColour());
            vehicleDTO.setSeatingCapacity(vehicle.getSeatingCapacity());
            vehicleDTO.setFuelType(vehicle.getFuelType());
            vehicleDTO.setStatus(vehicle.getStatus());
            vehicleDTO.setPrice(vehicle.getPrice());
            vehicleDTO.setInsuaranceCompanyDTO(insuaranceCompanyDTO);
            
            return vehicleDTO;
        }else{
            return null;
        }
        
        
    }
    
}
