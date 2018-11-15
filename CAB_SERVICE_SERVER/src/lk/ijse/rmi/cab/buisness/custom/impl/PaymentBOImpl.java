/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.buisness.custom.impl;

import java.util.ArrayList;
import java.util.List;
import lk.ijse.rmi.cab.buisness.custom.PaymentBO;
import lk.ijse.rmi.cab.dto.CustomerDTO;
import lk.ijse.rmi.cab.dto.PaymentDTO;
import lk.ijse.rmi.cab.dto.ReservationDTO;
import lk.ijse.rmi.cab.dto.VehicleDTO;
import lk.ijse.rmi.cab.entity.Customer;
import lk.ijse.rmi.cab.entity.InsuaranceCompany;
import lk.ijse.rmi.cab.entity.Payment;
import lk.ijse.rmi.cab.entity.Reservation;
import lk.ijse.rmi.cab.entity.Vehicle;
import lk.ijse.rmi.cab.repository.RepositoryFactory;
import lk.ijse.rmi.cab.repository.custom.PaymentRepository;
import lk.ijse.rmi.cab.resource.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author user
 */
public class PaymentBOImpl implements PaymentBO{
    private PaymentRepository paymentRepository;

    public PaymentBOImpl() {
        this.paymentRepository=(PaymentRepository) RepositoryFactory.getInstance().getRepository(RepositoryFactory.RepositoryType.PAYMENT);
    }
    
    

    @Override
    public boolean addPayment(PaymentDTO paymentDTO) throws Exception {
       try( Session session=HibernateUtil.getSessionFactory().openSession()){
        paymentRepository.setSesstion(session);
        session.beginTransaction();

            Payment payment=new Payment();
            payment.setDate(paymentDTO.getDate());
            payment.setTime(paymentDTO.getTime());
            payment.setAmmountPaid(paymentDTO.getAmmountPaid());
            payment.setAdvance(paymentDTO.getAdvance());

            Reservation reservation=new Reservation();
            reservation.setReseveId(paymentDTO.getReservationDTO().getReseveId());
            reservation.setStartDate(paymentDTO.getReservationDTO().getStartDate());
            reservation.setEndDate(paymentDTO.getReservationDTO().getEndDate());
            reservation.setPrice(paymentDTO.getReservationDTO().getPrice());
            
            Customer customer=new Customer();
            customer.setCustId(paymentDTO.getReservationDTO().getCustomerDTO().getCustId());
            customer.setCustName(paymentDTO.getReservationDTO().getCustomerDTO().getCustName());
            customer.setCustNic(paymentDTO.getReservationDTO().getCustomerDTO().getCustNic());
            customer.setCustLicenseId(paymentDTO.getReservationDTO().getCustomerDTO().getCustLicenseId());
            customer.setCustTelNumber(paymentDTO.getReservationDTO().getCustomerDTO().getCustTelNumber());
            customer.setCustDob(paymentDTO.getReservationDTO().getCustomerDTO().getCustDob());
            
            Vehicle vehicle=new Vehicle();
            vehicle.setVehicleId(paymentDTO.getReservationDTO().getVehicleDTO().getVehicleId());
            vehicle.setVehicleBrand(paymentDTO.getReservationDTO().getVehicleDTO().getVehicleBrand());
            vehicle.setVehicleInsuaranceId(paymentDTO.getReservationDTO().getVehicleDTO().getVehicleInsuaranceId());
            vehicle.setRegNo(paymentDTO.getReservationDTO().getVehicleDTO().getRegNo());
            vehicle.setColour(paymentDTO.getReservationDTO().getVehicleDTO().getColour());
            vehicle.setSeatingCapacity(paymentDTO.getReservationDTO().getVehicleDTO().getSeatingCapacity());
            vehicle.setFuelType(paymentDTO.getReservationDTO().getVehicleDTO().getFuelType());
            vehicle.setStatus(paymentDTO.getReservationDTO().getVehicleDTO().getStatus());
            vehicle.setPrice(paymentDTO.getReservationDTO().getVehicleDTO().getPrice());
            
            InsuaranceCompany insuaranceCompany=new InsuaranceCompany();
            insuaranceCompany.setInsuaranceCompanyId(paymentDTO.getReservationDTO().getVehicleDTO().getInsuaranceCompanyDTO().getInsuaranceCompanyId());
            insuaranceCompany.setCompanyName(paymentDTO.getReservationDTO().getVehicleDTO().getInsuaranceCompanyDTO().getCompanyName());
            insuaranceCompany.setInsuaranceType(paymentDTO.getReservationDTO().getVehicleDTO().getInsuaranceCompanyDTO().getInsuaranceType());
            
            vehicle.setInsuaranceCompany(insuaranceCompany);
            
            reservation.setCustomer(customer);
            reservation.setVehicle(vehicle);
            
            payment.setReservation(reservation);

            boolean result=paymentRepository.save(payment);
            session.getTransaction().commit();
            return result;
       }
    }

    @Override
    public boolean updatePayment(PaymentDTO paymentDTO) throws Exception {
         try( Session session=HibernateUtil.getSessionFactory().openSession()){
        paymentRepository.setSesstion(session);
        session.beginTransaction();

            Payment payment=new Payment();
            payment.setPaymentId(paymentDTO.getPaymentId());
            payment.setDate(paymentDTO.getDate());
            payment.setTime(paymentDTO.getTime());
            payment.setAmmountPaid(paymentDTO.getAmmountPaid());
            payment.setAdvance(paymentDTO.getAdvance());

            Reservation reservation=new Reservation();
            reservation.setReseveId(paymentDTO.getReservationDTO().getReseveId());
            reservation.setStartDate(paymentDTO.getReservationDTO().getStartDate());
            reservation.setEndDate(paymentDTO.getReservationDTO().getEndDate());
            reservation.setPrice(paymentDTO.getReservationDTO().getPrice());
            
            Customer customer=new Customer();
            customer.setCustId(paymentDTO.getReservationDTO().getCustomerDTO().getCustId());
            customer.setCustName(paymentDTO.getReservationDTO().getCustomerDTO().getCustName());
            customer.setCustNic(paymentDTO.getReservationDTO().getCustomerDTO().getCustNic());
            customer.setCustLicenseId(paymentDTO.getReservationDTO().getCustomerDTO().getCustLicenseId());
            customer.setCustTelNumber(paymentDTO.getReservationDTO().getCustomerDTO().getCustTelNumber());
            customer.setCustDob(paymentDTO.getReservationDTO().getCustomerDTO().getCustDob());
            
            Vehicle vehicle=new Vehicle();
            vehicle.setVehicleId(paymentDTO.getReservationDTO().getVehicleDTO().getVehicleId());
            vehicle.setVehicleBrand(paymentDTO.getReservationDTO().getVehicleDTO().getVehicleBrand());
            vehicle.setVehicleInsuaranceId(paymentDTO.getReservationDTO().getVehicleDTO().getVehicleInsuaranceId());
            vehicle.setRegNo(paymentDTO.getReservationDTO().getVehicleDTO().getRegNo());
            vehicle.setColour(paymentDTO.getReservationDTO().getVehicleDTO().getColour());
            vehicle.setSeatingCapacity(paymentDTO.getReservationDTO().getVehicleDTO().getSeatingCapacity());
            vehicle.setFuelType(paymentDTO.getReservationDTO().getVehicleDTO().getFuelType());
            vehicle.setStatus(paymentDTO.getReservationDTO().getVehicleDTO().getStatus());
            vehicle.setPrice(paymentDTO.getReservationDTO().getVehicleDTO().getPrice());
            
            InsuaranceCompany insuaranceCompany=new InsuaranceCompany();
            insuaranceCompany.setInsuaranceCompanyId(paymentDTO.getReservationDTO().getVehicleDTO().getInsuaranceCompanyDTO().getInsuaranceCompanyId());
            insuaranceCompany.setCompanyName(paymentDTO.getReservationDTO().getVehicleDTO().getInsuaranceCompanyDTO().getCompanyName());
            insuaranceCompany.setInsuaranceType(paymentDTO.getReservationDTO().getVehicleDTO().getInsuaranceCompanyDTO().getInsuaranceType());
            
            vehicle.setInsuaranceCompany(insuaranceCompany);
            
            reservation.setCustomer(customer);
            reservation.setVehicle(vehicle);
            
            payment.setReservation(reservation);

            paymentRepository.update(payment);
            session.getTransaction().commit();
            return true;
       }
    }

    @Override
    public boolean deletePayment(PaymentDTO paymentDTO) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PaymentDTO findPayment(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PaymentDTO> findAllPayment() throws Exception {
        Session session=HibernateUtil.getSessionFactory().openSession();
        paymentRepository.setSesstion(session);
        session.beginTransaction();
        
        List<Payment>payments=paymentRepository.findAll();
        session.getTransaction().commit();
        List<PaymentDTO>paymentDTOs=new ArrayList<>();
        
        for (Payment payment : payments) {
            PaymentDTO paymentDTO=new PaymentDTO();
            paymentDTO.setPaymentId(payment.getPaymentId());
            paymentDTO.setDate(payment.getDate());
            paymentDTO.setTime(payment.getTime());
            paymentDTO.setAmmountPaid(payment.getAmmountPaid());
            paymentDTO.setAdvance(payment.getAdvance());
            
            ReservationDTO reservationDTO=new ReservationDTO();
            reservationDTO.setReseveId(payment.getReservation().getReseveId());
            
            paymentDTO.setReservationDTO(reservationDTO);
            paymentDTOs.add(paymentDTO);
        }
        return paymentDTOs;
        
    }

    @Override
    public PaymentDTO findDetailsforFullPayment(int id) throws Exception {
        Session session=HibernateUtil.getSessionFactory().openSession();
        paymentRepository.setSesstion(session);
        session.beginTransaction();
        
        Payment payment=paymentRepository.findDetailsforFullPayment(id);
        session.getTransaction().commit();
        if(payment!=null){
            
            ReservationDTO reservationDTO=new ReservationDTO();
            reservationDTO.setReseveId(payment.getReservation().getReseveId());
            
            CustomerDTO customerDTO=new CustomerDTO();
            customerDTO.setCustId(payment.getReservation().getCustomer().getCustId());
            
            VehicleDTO vehicleDTO=new VehicleDTO();
            vehicleDTO.setVehicleId(payment.getReservation().getVehicle().getVehicleId());
            reservationDTO.setCustomerDTO(customerDTO);
            reservationDTO.setVehicleDTO(vehicleDTO); 
            
            PaymentDTO paymentDTO=new PaymentDTO();
            //paymentDTO.setPaymentId(payment.getPaymentId());
            paymentDTO.setAdvance(payment.getAdvance());
            paymentDTO.setTime(payment.getTime());
            paymentDTO.setAmmountPaid(payment.getAmmountPaid());
            paymentDTO.setDate(payment.getDate());
            paymentDTO.setTime(payment.getTime());
            paymentDTO.setReservationDTO(reservationDTO);
            
            return paymentDTO;
        }else{
            return null;
        }
    }

    @Override
    public List<PaymentDTO> serchDetailsForModifyReservation(String rid) throws Exception {
        Session session=HibernateUtil.getSessionFactory().openSession();
        paymentRepository.setSesstion(session);
        session.beginTransaction();
        
        List<Payment>payments=paymentRepository.serchDetailsForModifyReservation(rid);
        session.getTransaction().commit();
        List<PaymentDTO>paymentDTOs=new ArrayList<>();
        if(payments!=null){
            for (Payment payment: payments) {
                VehicleDTO vehicleDTO=new VehicleDTO();
                vehicleDTO.setVehicleId(payment.getReservation().getVehicle().getVehicleId());
                ReservationDTO reservationDTO=new ReservationDTO();
                reservationDTO.setVehicleDTO(vehicleDTO);
                reservationDTO.setPrice(payment.getReservation().getPrice());
                reservationDTO.setStartDate(payment.getReservation().getStartDate());
                reservationDTO.setEndDate(payment.getReservation().getEndDate());
                
                PaymentDTO paymentDTO=new PaymentDTO();
                paymentDTO.setPaymentId(payment.getPaymentId());
                paymentDTO.setReservationDTO(reservationDTO);
                
                paymentDTOs.add(paymentDTO);
                
                
            }
            return paymentDTOs;
        }else{
            return null;
        }
    }
    
}
