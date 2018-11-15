/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.buisness.custom.impl;

import java.util.ArrayList;
import java.util.List;
import lk.ijse.rmi.cab.buisness.custom.ReservationBO;
import lk.ijse.rmi.cab.dto.CustomerDTO;
import lk.ijse.rmi.cab.dto.ReservationDTO;
import lk.ijse.rmi.cab.dto.VehicleDTO;
import lk.ijse.rmi.cab.entity.Customer;
import lk.ijse.rmi.cab.entity.InsuaranceCompany;
import lk.ijse.rmi.cab.entity.Reservation;
import lk.ijse.rmi.cab.entity.Vehicle;
import lk.ijse.rmi.cab.repository.RepositoryFactory;
import lk.ijse.rmi.cab.repository.custom.CustomerRepository;
import lk.ijse.rmi.cab.repository.custom.ReservationRepository;
import lk.ijse.rmi.cab.resource.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author user
 */
public class ReservationBOImpl implements ReservationBO{
    private Session session;
    private ReservationRepository reservationRepository;
    private CustomerRepository customerRepository;

    public ReservationBOImpl() {
     this.reservationRepository=(ReservationRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryType.RESERVATION);
     this.customerRepository=(CustomerRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryType.CUSTOMER);

    }
    
    

    @Override
    public boolean addReservation(ReservationDTO reservationDTO) throws Exception {
        boolean result=false;
       try( Session session=HibernateUtil.getSessionFactory().openSession()){
        reservationRepository.setSesstion(session);
        session.beginTransaction();
        
        Customer customer=new Customer();
        customer.setCustId(reservationDTO.getCustomerDTO().getCustId());
        customer.setCustName(reservationDTO.getCustomerDTO().getCustName());
        customer.setCustNic(reservationDTO.getCustomerDTO().getCustNic());
        customer.setCustLicenseId(reservationDTO.getCustomerDTO().getCustLicenseId());
        customer.setCustTelNumber(reservationDTO.getCustomerDTO().getCustTelNumber());
        customer.setCustDob(reservationDTO.getCustomerDTO().getCustDob());
//        
        Vehicle vehicle=new Vehicle();
        vehicle.setVehicleId(reservationDTO.getVehicleDTO().getVehicleId());
        vehicle.setVehicleBrand(reservationDTO.getVehicleDTO().getVehicleBrand());
        vehicle.setVehicleInsuaranceId(reservationDTO.getVehicleDTO().getVehicleInsuaranceId());
        vehicle.setRegNo(reservationDTO.getVehicleDTO().getRegNo());
        vehicle.setColour(reservationDTO.getVehicleDTO().getColour());
        vehicle.setSeatingCapacity(reservationDTO.getVehicleDTO().getSeatingCapacity());
        vehicle.setFuelType(reservationDTO.getVehicleDTO().getFuelType());
        vehicle.setStatus(reservationDTO.getVehicleDTO().getStatus());
        vehicle.setPrice(reservationDTO.getVehicleDTO().getPrice());
        
        InsuaranceCompany insuaranceCompany=new InsuaranceCompany();
        insuaranceCompany.setInsuaranceCompanyId(reservationDTO.getVehicleDTO().getInsuaranceCompanyDTO().getInsuaranceCompanyId());
        insuaranceCompany.setCompanyName(reservationDTO.getVehicleDTO().getInsuaranceCompanyDTO().getCompanyName());
        insuaranceCompany.setInsuaranceType(reservationDTO.getVehicleDTO().getInsuaranceCompanyDTO().getInsuaranceType());
        vehicle.setInsuaranceCompany(insuaranceCompany);
        
       
//        
        Reservation reservation=new Reservation(reservationDTO.getReseveId(),reservationDTO.getStartDate(),reservationDTO.getEndDate(),reservationDTO.getPrice(),customer,vehicle);
        result=reservationRepository.save(reservation);
        session.getTransaction().commit();
        return result;
       } 
        
    }

    @Override
    public boolean updateReservation(ReservationDTO reservationDTO) throws Exception {
          
        try( Session session=HibernateUtil.getSessionFactory().openSession()){
        reservationRepository.setSesstion(session);
        session.beginTransaction();
        
        Customer customer=new Customer();
        customer.setCustId(reservationDTO.getCustomerDTO().getCustId());
        customer.setCustName(reservationDTO.getCustomerDTO().getCustName());
        customer.setCustNic(reservationDTO.getCustomerDTO().getCustNic());
        customer.setCustLicenseId(reservationDTO.getCustomerDTO().getCustLicenseId());
        customer.setCustTelNumber(reservationDTO.getCustomerDTO().getCustTelNumber());
        customer.setCustDob(reservationDTO.getCustomerDTO().getCustDob());
//        
        Vehicle vehicle=new Vehicle();
        vehicle.setVehicleId(reservationDTO.getVehicleDTO().getVehicleId());
        vehicle.setVehicleBrand(reservationDTO.getVehicleDTO().getVehicleBrand());
        vehicle.setVehicleInsuaranceId(reservationDTO.getVehicleDTO().getVehicleInsuaranceId());
        vehicle.setRegNo(reservationDTO.getVehicleDTO().getRegNo());
        vehicle.setColour(reservationDTO.getVehicleDTO().getColour());
        vehicle.setSeatingCapacity(reservationDTO.getVehicleDTO().getSeatingCapacity());
        vehicle.setFuelType(reservationDTO.getVehicleDTO().getFuelType());
        vehicle.setStatus(reservationDTO.getVehicleDTO().getStatus());
        vehicle.setPrice(reservationDTO.getVehicleDTO().getPrice());
        
        InsuaranceCompany insuaranceCompany=new InsuaranceCompany();
        insuaranceCompany.setInsuaranceCompanyId(reservationDTO.getVehicleDTO().getInsuaranceCompanyDTO().getInsuaranceCompanyId());
        insuaranceCompany.setCompanyName(reservationDTO.getVehicleDTO().getInsuaranceCompanyDTO().getCompanyName());
        insuaranceCompany.setInsuaranceType(reservationDTO.getVehicleDTO().getInsuaranceCompanyDTO().getInsuaranceType());
        vehicle.setInsuaranceCompany(insuaranceCompany);
        
       
//        
        Reservation reservation=new Reservation(reservationDTO.getReseveId(),reservationDTO.getStartDate(),reservationDTO.getEndDate(),reservationDTO.getPrice(),customer,vehicle);
        reservationRepository.update(reservation);
        session.getTransaction().commit();
        return true;
       } 
    }

    @Override
    public boolean deleteReservation(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ReservationDTO findReservation(String id) throws Exception {
        Session session=HibernateUtil.getSessionFactory().openSession();
        reservationRepository.setSesstion(session);
        session.beginTransaction();
        
        Reservation reservation=reservationRepository.findBYId(id);
        session.getTransaction().commit();
        ReservationDTO reservationDTO=null;
        if(reservation!=null){
            reservationDTO=new ReservationDTO();
            reservationDTO.setReseveId(reservation.getReseveId());
            reservationDTO.setStartDate(reservation.getStartDate());
            reservationDTO.setEndDate(reservation.getEndDate());
            reservationDTO.setCustomerDTO(new CustomerDTO(reservation.getCustomer().getCustId()));
            reservationDTO.setVehicleDTO(new VehicleDTO(reservation.getVehicle().getVehicleId()));
        }
        return reservationDTO;
    }

    @Override
    public List<ReservationDTO> findAllReservation() throws Exception {
        Session session=HibernateUtil.getSessionFactory().openSession();
        reservationRepository.setSesstion(session);
        session.beginTransaction();
        
        List<Reservation>reservations=reservationRepository.findAll();
        session.getTransaction().commit();
        
        if(reservations!=null){
            List<ReservationDTO>reservationDTOs=new ArrayList<>();
            
            for (Reservation reservation : reservations) {
                ReservationDTO reservationDTO=new ReservationDTO();
                reservationDTO.setReseveId(reservation.getReseveId());
                reservationDTO.setStartDate(reservation.getStartDate());
                reservationDTO.setEndDate(reservation.getEndDate());
                reservationDTO.setPrice(reservation.getPrice());
                
                VehicleDTO vehicleDTO=new VehicleDTO();
                vehicleDTO.setVehicleId(reservation.getVehicle().getVehicleId());
                
                CustomerDTO customerDTO=new CustomerDTO();
                customerDTO.setCustId(reservation.getCustomer().getCustId());
                
                reservationDTO.setCustomerDTO(customerDTO);
                reservationDTO.setVehicleDTO(vehicleDTO);
                
                reservationDTOs.add(reservationDTO);
                
            }
            return reservationDTOs;
        }else{
            return null;
        }
    }

    @Override
    public List<ReservationDTO> gatAllAvailableVehicles(String startDate, String EndDate) throws Exception {
        Session session=HibernateUtil.getSessionFactory().openSession();
        reservationRepository.setSesstion(session);
        session.beginTransaction();
        
        List<Reservation> reserve=reservationRepository.getAllAvailableVehicles(startDate, EndDate);
        List<ReservationDTO> v=new ArrayList<>();
        if(reserve!=null){
            for (Reservation reservation : reserve) {
                ReservationDTO reservationDTO=new ReservationDTO(new VehicleDTO(reservation.getVehicle().getVehicleId()));
                v.add(reservationDTO);
//                ReservationDTO reservationDTO=new ReservationDTO(reservation.getStartDate(),reservation.getEndDate(),
//                reservation.getPrice(),new CustomerDTO(reservation.getCustomer().getCustId()),new VehicleDTO(reservation.getVehicle().getVehicleId()));
//                v.add(reservationDTO);
            }
              return v;  
            }else{
            return null;
        }
            
        }
//            for (Reservation reservation: reserve) {
//                ReservationDTO r=new ReservationDTO(vehicle.getVehicleId(),vehicle.getVehicleBrand(),vehicle.getVehicleInsuaranceId(),
//                vehicle.getRegNo(),vehicle.getColour(),vehicle.getSeatingCapacity(),vehicle.getFuelType(),vehicle.getStatus(),
//                vehicle.getPrice(),new InsuaranceCompanyDTO(vehicle.getInsuaranceCompany().getInsuaranceCompanyId()));
//                v.add(vehicleDTO);
//            }
//            return v;
//        }else{
//            return null;
//        }

    @Override
    public boolean vehicleReservatonOfNewCustomer(ReservationDTO reservationDTO) throws Exception {
        Session session=HibernateUtil.getSessionFactory().openSession();
        customerRepository.setSesstion(session);
        reservationRepository.setSesstion(session);
        
        session.beginTransaction();
        
        Vehicle vehicle=new Vehicle();
        vehicle.setVehicleId(reservationDTO.getVehicleDTO().getVehicleId());
        vehicle.setVehicleBrand(reservationDTO.getVehicleDTO().getVehicleBrand());
        vehicle.setVehicleInsuaranceId(reservationDTO.getVehicleDTO().getVehicleInsuaranceId());
        vehicle.setRegNo(reservationDTO.getVehicleDTO().getRegNo());
        vehicle.setColour(reservationDTO.getVehicleDTO().getColour());
        vehicle.setSeatingCapacity(reservationDTO.getVehicleDTO().getSeatingCapacity());
        vehicle.setFuelType(reservationDTO.getVehicleDTO().getFuelType());
        vehicle.setStatus(reservationDTO.getVehicleDTO().getStatus());
        vehicle.setPrice(reservationDTO.getVehicleDTO().getPrice());
        
        InsuaranceCompany insuaranceCompany=new InsuaranceCompany();
        insuaranceCompany.setInsuaranceCompanyId(reservationDTO.getVehicleDTO().getInsuaranceCompanyDTO().getInsuaranceCompanyId());
        insuaranceCompany.setCompanyName(reservationDTO.getVehicleDTO().getInsuaranceCompanyDTO().getCompanyName());
        insuaranceCompany.setInsuaranceType(reservationDTO.getVehicleDTO().getInsuaranceCompanyDTO().getInsuaranceType());
        vehicle.setInsuaranceCompany(insuaranceCompany);
        
        Customer customer=new Customer();
        customer.setCustName(reservationDTO.getCustomerDTO().getCustName());
        customer.setCustNic(reservationDTO.getCustomerDTO().getCustNic());
        customer.setCustLicenseId(reservationDTO.getCustomerDTO().getCustLicenseId());
        customer.setCustTelNumber(reservationDTO.getCustomerDTO().getCustTelNumber());
        customer.setCustDob(reservationDTO.getCustomerDTO().getCustDob());
        
        
        
        boolean result=customerRepository.save(customer);
        if(result !=false){
            customer.setCustId(customer.getCustId());
            
            Reservation reservation=new Reservation(reservationDTO.getReseveId(),reservationDTO.getStartDate(),reservationDTO.getEndDate(),reservationDTO.getPrice(),customer,vehicle);
            reservationRepository.save(reservation);
            session.getTransaction().commit();
            return result;
        }else{
            return false;
        }
                
        
        
    }

    @Override
    public ReservationDTO getLastId() throws Exception {
//        ReservationDTO r=null;
//        Session session=HibernateUtil.getSessionFactory().openSession();
//        this.setSession(session);
//        session.beginTransaction();
//        try {
//            int fid=(int) session.createQuery("select max(reseveId) form reservation").uniqueResult();
//            r=session.get(ReservationDTO.class, fid);
//            session.getTransaction().commit();   
//        } catch (Exception e) {
//                
//		session.getTransaction().rollback();
//        }
//        
//       
//         return r;
        throw new UnsupportedOperationException("Not supported yet.");
        
    }

    @Override
    public List<ReservationDTO> serchReserveIdForModifyReservation(String nic) throws Exception {
        Session session=HibernateUtil.getSessionFactory().openSession();
        reservationRepository.setSesstion(session);
        session.beginTransaction();
        
        List<Reservation>reservations=reservationRepository.serchReserveIdForModifyReservation(nic);
        session.getTransaction().commit();
        List<ReservationDTO>reservationDTOs=new ArrayList<>();
        if(reservations!=null){
            
            for (Reservation reservation : reservations) {
               ReservationDTO reservationDTO=new ReservationDTO();
               reservationDTO.setReseveId(reservation.getReseveId());
               reservationDTOs.add(reservationDTO);
               
           
            }
            return reservationDTOs;
        }else{
            return null;
        }
        
    }

   
    
    
}
