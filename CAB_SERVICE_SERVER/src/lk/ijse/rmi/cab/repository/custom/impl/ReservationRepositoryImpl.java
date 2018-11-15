/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.repository.custom.impl;

import java.io.Serializable;
import java.util.ArrayList;

import java.util.List;
import static javassist.CtMethod.ConstParameter.string;
import lk.ijse.rmi.cab.entity.Customer;
import lk.ijse.rmi.cab.entity.Reservation;
import lk.ijse.rmi.cab.entity.Vehicle;
import lk.ijse.rmi.cab.repository.SuperRepositoryImpl;
import lk.ijse.rmi.cab.repository.custom.ReservationRepository;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

/**
 *
 * @author user
 */
public class ReservationRepositoryImpl implements ReservationRepository{
    private Session session;
   

    @Override
    public boolean save(Reservation t) throws Exception {
        Serializable addReservation=session.save(t);
        if(addReservation!=null){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void update(Reservation t) throws Exception {
        session.update(t);
    }

    @Override
    public void delete(Reservation t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Reservation findBYId(String Id) throws Exception {
        Criteria add=session.createCriteria(Reservation.class).add(Restrictions.eq("reseveId", Id));
        List<Reservation>reseve=add.list();
        Reservation reservation1=null;
        for (Reservation reservation : reseve) {
            reservation1=new Reservation();
            reservation1.setReseveId(reservation.getReseveId());
            reservation1.setStartDate(reservation.getStartDate());
            reservation1.setEndDate(reservation.getEndDate());
            reservation1.setCustomer(new Customer(reservation.getCustomer().getCustId()));
            reservation1.setVehicle(new Vehicle(reservation.getVehicle().getVehicleId()));
            
            
        }
        return reservation1;
    }

    @Override
    public List<Reservation> findAll() throws Exception {
        return session.createCriteria(Reservation.class).list();
    }

    @Override
    public List<Reservation> getAllAvailableVehicles(String in, String out) throws Exception {
        NativeQuery sqlQuery=session.createSQLQuery ("SELECT vehicleId from vehicle where vehicleId not in(Select vehicleId from Reservation Where (startDate<='" + in + "' && endDate>='" + in + "') || (startDate<='" + out + "' && endDate>='" + out + "') || (startDate>='" + in + "' && endDate<='" + out + "') || (endDate='" + in + "' && endDate='" + out + "') || (startDate='" + out + "' && startDate='" + out + "'))");
        List<Object[]> list = sqlQuery.list();
        List<Reservation>l=new ArrayList<>();
        for (Object row : list) {
            Reservation reservation=new Reservation();
            Vehicle vehicle=new Vehicle();
            vehicle.setVehicleId(Integer.parseInt(row.toString()));
            reservation.setVehicle(vehicle);
            
            l.add(reservation);
        }
        return l;
    }

    @Override
    public boolean vehicleReservatonOfNewCustomer(Reservation reservation) throws Exception {
        Serializable addReservation=session.save(reservation);
        if(addReservation!=null){
            return true;
        }else{
            return false;
        }
    }

//    @Override
//    public int getLastId() throws Exception {
//        Query query=session.createSQLQuery("select last_value from reservation");
//        int lastid=query.getFirstResult();
//        return lastid;
//    }

    @Override
    public Reservation getLastId() throws Exception {
//        Reservation reservation=(Reservation) session.createQuery("from reservation ORDER BY reseveId DES").setMaxResults(1).getSingleResult();
//        return reservation;
            Reservation f=null;
            int fid=(int) session.createQuery("select max(reseveId) form reservation").uniqueResult();
            f=session.get(Reservation.class, fid);
            return f;
    }

    @Override
    public void setSesstion(Session session) {
        this.session=session;
    }

    @Override
    public List<Reservation> serchReserveIdForModifyReservation(String nic) throws Exception {
     NativeQuery query=session.createNativeQuery("select reservation.reseveId from reservation INNER JOIN customer ON customer.custId=reservation.customer_custId where customer.custNic='"+nic+"'");
        List<Object[]>listt=query.list();
        List<Reservation>reservations=new ArrayList<>();
        for (Object row :listt) {
           Reservation reservation=new Reservation();
           reservation.setReseveId(row.toString());
           reservations.add(reservation);
            
        }
        return reservations;
    }
    
}
