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
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int vehicleId;
    private String vehicleBrand;
    
    private String vehicleInsuaranceId;
    private String regNo;
    private String colour;
    private int SeatingCapacity;
    private String FuelType;
    private String status;
    private double price;
    
    @ManyToOne(cascade = CascadeType.ALL)
    private InsuaranceCompany insuaranceCompany;

    public Vehicle() {
    }

    public Vehicle( String vehicleBrand, String vehicleInsuaranceId, String regNo, String colour, int SeatingCapacity, String FuelType, String status, double price, InsuaranceCompany insuaranceCompany) {
        this.vehicleId = vehicleId;
        this.vehicleBrand = vehicleBrand;
        this.vehicleInsuaranceId = vehicleInsuaranceId;
        this.regNo = regNo;
        this.colour = colour;
        this.SeatingCapacity = SeatingCapacity;
        this.FuelType = FuelType;
        this.status = status;
        this.price = price;
        this.insuaranceCompany = insuaranceCompany;
    }

    public Vehicle(int vehicleId, String vehicleBrand, String vehicleInsuaranceId, String regNo, String colour, int SeatingCapacity, String FuelType, String status, double price, InsuaranceCompany insuaranceCompany) {
        this.vehicleId = vehicleId;
        this.vehicleBrand = vehicleBrand;
        this.vehicleInsuaranceId = vehicleInsuaranceId;
        this.regNo = regNo;
        this.colour = colour;
        this.SeatingCapacity = SeatingCapacity;
        this.FuelType = FuelType;
        this.status = status;
        this.price = price;
        this.insuaranceCompany = insuaranceCompany;
    }

    public Vehicle(String vehicleBrand, String vehicleInsuaranceId, String regNo, String colour, int seatingCapacity, String fuelType, String status, double price) {
        this.vehicleBrand=vehicleBrand;
        this.vehicleInsuaranceId=vehicleInsuaranceId;
        this.regNo=regNo;
        this.colour=colour;
        this.SeatingCapacity=seatingCapacity;
        this.FuelType=fuelType;
        this.status=status;
        this.price=price;
    }

    public Vehicle(int vehicleId) {
        this.vehicleId=vehicleId;
    }

    /**
     * @return the vehicleId
     */
    public int getVehicleId() {
        return vehicleId;
    }

    /**
     * @param vehicleId the vehicleId to set
     */
    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    /**
     * @return the vehicleBrand
     */
    public String getVehicleBrand() {
        return vehicleBrand;
    }

    /**
     * @param vehicleBrand the vehicleBrand to set
     */
    public void setVehicleBrand(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }

    /**
     * @return the vehicleInsuaranceId
     */
    public String getVehicleInsuaranceId() {
        return vehicleInsuaranceId;
    }

    /**
     * @param vehicleInsuaranceId the vehicleInsuaranceId to set
     */
    public void setVehicleInsuaranceId(String vehicleInsuaranceId) {
        this.vehicleInsuaranceId = vehicleInsuaranceId;
    }

    /**
     * @return the regNo
     */
    public String getRegNo() {
        return regNo;
    }

    /**
     * @param regNo the regNo to set
     */
    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    /**
     * @return the colour
     */
    public String getColour() {
        return colour;
    }

    /**
     * @param colour the colour to set
     */
    public void setColour(String colour) {
        this.colour = colour;
    }

    /**
     * @return the SeatingCapacity
     */
    public int getSeatingCapacity() {
        return SeatingCapacity;
    }

    /**
     * @param SeatingCapacity the SeatingCapacity to set
     */
    public void setSeatingCapacity(int SeatingCapacity) {
        this.SeatingCapacity = SeatingCapacity;
    }

    /**
     * @return the FuelType
     */
    public String getFuelType() {
        return FuelType;
    }

    /**
     * @param FuelType the FuelType to set
     */
    public void setFuelType(String FuelType) {
        this.FuelType = FuelType;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
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
     * @return the insuaranceCompany
     */
    public InsuaranceCompany getInsuaranceCompany() {
        return insuaranceCompany;
    }

    /**
     * @param insuaranceCompany the insuaranceCompany to set
     */
    public void setInsuaranceCompany(InsuaranceCompany insuaranceCompany) {
        this.insuaranceCompany = insuaranceCompany;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "vehicleId=" + vehicleId + ", vehicleBrand=" + vehicleBrand + ", vehicleInsuaranceId=" + vehicleInsuaranceId + ", regNo=" + regNo + ", colour=" + colour + ", SeatingCapacity=" + SeatingCapacity + ", FuelType=" + FuelType + ", status=" + status + ", price=" + price + ", insuaranceCompany=" + insuaranceCompany + '}';
    }

    

  

    
    
    
    
}
