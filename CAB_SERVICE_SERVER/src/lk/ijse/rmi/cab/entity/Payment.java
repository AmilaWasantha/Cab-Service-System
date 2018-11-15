/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author user
 */
@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int paymentId;
    private String date;
    private String time;
    private double ammountPaid;
    private double advance;
    
    @ManyToOne(cascade = CascadeType.ALL)
    private Reservation reservation;

    public Payment() {
    }

    public Payment(String date, String time, double ammountPaid, double advance, Reservation reservation) {
        this.paymentId = paymentId;
        this.date = date;
        this.time = time;
        this.ammountPaid = ammountPaid;
        this.advance = advance;
        this.reservation = reservation;
    }

    public Payment(int paymentId, String date, String time, double ammountPaid, double advance, Reservation reservation) {
        this.paymentId = paymentId;
        this.date = date;
        this.time = time;
        this.ammountPaid = ammountPaid;
        this.advance = advance;
        this.reservation = reservation;
    }

    /**
     * @return the paymentId
     */
    public int getPaymentId() {
        return paymentId;
    }

    /**
     * @param paymentId the paymentId to set
     */
    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * @return the ammountPaid
     */
    public double getAmmountPaid() {
        return ammountPaid;
    }

    /**
     * @param ammountPaid the ammountPaid to set
     */
    public void setAmmountPaid(double ammountPaid) {
        this.ammountPaid = ammountPaid;
    }

    /**
     * @return the advance
     */
    public double getAdvance() {
        return advance;
    }

    /**
     * @param advance the advance to set
     */
    public void setAdvance(double advance) {
        this.advance = advance;
    }

    /**
     * @return the reservation
     */
    public Reservation getReservation() {
        return reservation;
    }

    /**
     * @param reservation the reservation to set
     */
    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    @Override
    public String toString() {
        return "Payment{" + "paymentId=" + paymentId + ", date=" + date + ", time=" + time + ", ammountPaid=" + ammountPaid + ", advance=" + advance + ", reservation=" + reservation + '}';
    }
    
    
    

    

    
    
    
    
    
}
