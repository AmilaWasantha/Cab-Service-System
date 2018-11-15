/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.repository.custom.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import lk.ijse.rmi.cab.entity.Customer;
import lk.ijse.rmi.cab.entity.Payment;
import lk.ijse.rmi.cab.entity.Reservation;
import lk.ijse.rmi.cab.entity.Vehicle;
import lk.ijse.rmi.cab.repository.SuperRepositoryImpl;
import lk.ijse.rmi.cab.repository.custom.PaymentRepository;
import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

/**
 *
 * @author user
 */
public class PaymentRepositoryImpl  implements PaymentRepository{
    private Session session;

    @Override
    public void setSesstion(Session session) {
        this.session=session;
    }

    @Override
    public boolean save(Payment t) throws Exception {
        Serializable savePayment=session.save(t);
        if(savePayment!=null){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void update(Payment t) throws Exception {
        session.update(t);
    }

    @Override
    public void delete(Payment t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Payment findBYId(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Payment> findAll() throws Exception {
        return session.createCriteria(Payment.class).list();
    }

    @Override
    public Payment findDetailsforFullPayment(int id) throws Exception {
        NativeQuery query=session.createNativeQuery("SELECT  payment.reservation_reseveId,reservation.customer_custId,reservation.vehicle_vehicleId,payment.date,payment.ammountPaid,payment.advance,payment.time\n "+" FROM payment INNER JOIN reservation ON reservation.reseveId=payment.reservation_reseveId\n "+" WHERE payment.paymentId='"+id+"'");
        List<Object[]> list=query.list();
        Payment payment=new Payment();
        
        
        for (Object[] rows : list) {
            
            Reservation reservation=new Reservation();
            reservation.setReseveId(rows[0].toString());
            
            Customer customer=new Customer();
            customer.setCustId(Integer.parseInt(rows[1].toString()));
            reservation.setCustomer(customer);
            
            Vehicle vehicle=new Vehicle();
            vehicle.setVehicleId(Integer.parseInt(rows[2].toString()));
            reservation.setVehicle(vehicle);
            
            payment.setReservation(reservation);
            payment.setDate(rows[3].toString());
            payment.setAmmountPaid(Double.parseDouble(rows[4].toString()));
            payment.setAdvance(Double.parseDouble(rows[5].toString()));
            payment.setTime(rows[6].toString());
            
            
            
        }
        return payment;
    }

    @Override
    public List<Payment> serchDetailsForModifyReservation(String rid) throws Exception {
        NativeQuery query=session.createNativeQuery("select reservation.startDate, reservation.endDate, reservation.vehicle_vehicleId,reservation.price,payment.paymentId from payment INNER JOIN reservation ON reservation.reseveId=payment.reservation_reseveId where reservation.reseveId='"+rid+"'");
        List<Object[]>list=query.list();
        List<Payment>payments=new ArrayList<>();
        for (Object row[] : list) {
            Vehicle vehicle=new Vehicle();
            vehicle.setVehicleId(Integer.parseInt(row[2].toString()));
            Reservation reservation=new Reservation();
            reservation.setStartDate(row[0].toString());
            reservation.setEndDate(row[1].toString());
            reservation.setPrice(Double.parseDouble(row[3].toString()));
            reservation.setVehicle(vehicle);
            Payment payment=new Payment();
            payment.setPaymentId(Integer.parseInt(row[4].toString()));
            payment.setReservation(reservation);
            payments.add(payment);
        }
        return payments;
    }
    
}
