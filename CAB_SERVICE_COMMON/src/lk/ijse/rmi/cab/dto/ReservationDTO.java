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
public class ReservationDTO extends SuperDTO{
    
    private String reseveId;
    private String startDate;
    private String endDate;
    private double price;
    private CustomerDTO customerDTO;
    private VehicleDTO vehicleDTO;
    
    

    public ReservationDTO() {
    }

    public ReservationDTO( String startDate, String endDate, double price, CustomerDTO customerDTO, VehicleDTO vehicleDTO) {
        this.reseveId = reseveId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
        this.customerDTO = customerDTO;
        this.vehicleDTO = vehicleDTO;
    }

    public ReservationDTO(String reseveId, String startDate, String endDate, double price, CustomerDTO customerDTO, VehicleDTO vehicleDTO) {
        this.reseveId = reseveId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
        this.customerDTO = customerDTO;
        this.vehicleDTO = vehicleDTO;
    }

    public ReservationDTO(VehicleDTO vehicleDTO) {
        this.vehicleDTO=vehicleDTO;
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
     * @return the customerDTO
     */
    public CustomerDTO getCustomerDTO() {
        return customerDTO;
    }

    /**
     * @param customerDTO the customerDTO to set
     */
    public void setCustomerDTO(CustomerDTO customerDTO) {
        this.customerDTO = customerDTO;
    }

    /**
     * @return the vehicleDTO
     */
    public VehicleDTO getVehicleDTO() {
        return vehicleDTO;
    }

    /**
     * @param vehicleDTO the vehicleDTO to set
     */
    public void setVehicleDTO(VehicleDTO vehicleDTO) {
        this.vehicleDTO = vehicleDTO;
    }

   
    
    

    

    
    
    
    
}
