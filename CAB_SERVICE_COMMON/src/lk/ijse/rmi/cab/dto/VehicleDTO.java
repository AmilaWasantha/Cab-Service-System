/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.dto;

/**
 *
 * @author user
 */
public class VehicleDTO extends SuperDTO{
    
    private int vehicleId;
    private String vehicleBrand;
    
    private String vehicleInsuaranceId;
    private String regNo;
    private String colour;
    private int SeatingCapacity;
    private String FuelType;
    private String status;
    private double price;
    private InsuaranceCompanyDTO insuaranceCompanyDTO;

    public VehicleDTO() {
    }

    public VehicleDTO(String vehicleBrand, String vehicleInsuaranceId, String regNo, String colour, int SeatingCapacity, String FuelType, String status, double price, InsuaranceCompanyDTO insuaranceCompanyDTO) {
        this.vehicleId = vehicleId;
        this.vehicleBrand = vehicleBrand;
        this.vehicleInsuaranceId = vehicleInsuaranceId;
        this.regNo = regNo;
        this.colour = colour;
        this.SeatingCapacity = SeatingCapacity;
        this.FuelType = FuelType;
        this.status = status;
        this.price = price;
        this.insuaranceCompanyDTO = insuaranceCompanyDTO;
    }

    public VehicleDTO(int vehicleId, String vehicleBrand, String vehicleInsuaranceId, String regNo, String colour, int SeatingCapacity, String FuelType, String status, double price, InsuaranceCompanyDTO insuaranceCompanyDTO) {
        this.vehicleId = vehicleId;
        this.vehicleBrand = vehicleBrand;
        this.vehicleInsuaranceId = vehicleInsuaranceId;
        this.regNo = regNo;
        this.colour = colour;
        this.SeatingCapacity = SeatingCapacity;
        this.FuelType = FuelType;
        this.status = status;
        this.price = price;
        this.insuaranceCompanyDTO = insuaranceCompanyDTO;
    }

    public VehicleDTO(int vehicleId) {
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
     * @return the insuaranceCompanyDTO
     */
    public InsuaranceCompanyDTO getInsuaranceCompanyDTO() {
        return insuaranceCompanyDTO;
    }

    /**
     * @param insuaranceCompanyDTO the insuaranceCompanyDTO to set
     */
    public void setInsuaranceCompanyDTO(InsuaranceCompanyDTO insuaranceCompanyDTO) {
        this.insuaranceCompanyDTO = insuaranceCompanyDTO;
    }
    
    
    

    
    
    
    
    
}
