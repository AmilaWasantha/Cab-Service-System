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
public class Reservation {
    @Id
    
    private String reseveId;
    private String startDate;
    private String endDate;
    private double price;
    
    @ManyToOne(cascade = CascadeType.ALL)
    private Customer customer;
    
    @ManyToOne(cascade = CascadeType.ALL)
    private Vehicle vehicle;
 
    

    public Reservation() {
    }

    public Reservation( String startDate, String endDate, double price, Customer customer, Vehicle vehicle) {
        this.reseveId = reseveId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
        this.customer = customer;
        this.vehicle = vehicle;
    }

    public Reservation(String reseveId, String startDate, String endDate, double price, Customer customer, Vehicle vehicle) {
        this.reseveId = reseveId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
        this.customer = customer;
        this.vehicle = vehicle;
    }

    /**
     * @return the reseveId
     */
    public String getReseveId() {
        return reseveId;
    }

    /**
     * @param reseveId the reseveId to set
     */
    public void setReseveId(String reseveId) {
        this.reseveId = reseveId;
    }

    /**
     * @return the startDate
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the endDate
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * @param customer the customer to set
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * @return the vehicle
     */
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * @param vehicle the vehicle to set
     */
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Reservation{" + "reseveId=" + reseveId + ", startDate=" + startDate + ", endDate=" + endDate + ", price=" + price + ", customer=" + customer + ", vehicle=" + vehicle + '}';
    }

    
    
    
    
    

    
  
    
    
    
}
