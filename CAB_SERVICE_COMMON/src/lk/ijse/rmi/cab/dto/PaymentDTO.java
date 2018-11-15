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
public class PaymentDTO extends SuperDTO{
    private int paymentId;
    private String date;
    private String time;
    private double ammountPaid;
    private double advance;
    private ReservationDTO reservationDTO;

    public PaymentDTO() {
    }

    public PaymentDTO( String date, String time, double ammountPaid, double advance, ReservationDTO reservationDTO) {
        this.paymentId = paymentId;
        this.date = date;
        this.time = time;
        this.ammountPaid = ammountPaid;
        this.advance = advance;
        this.reservationDTO = reservationDTO;
    }

    public PaymentDTO(int paymentId, String date, String time, double ammountPaid, double advance, ReservationDTO reservationDTO) {
        this.paymentId = paymentId;
        this.date = date;
        this.time = time;
        this.ammountPaid = ammountPaid;
        this.advance = advance;
        this.reservationDTO = reservationDTO;
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
     * @return the reservationDTO
     */
    public ReservationDTO getReservationDTO() {
        return reservationDTO;
    }

    /**
     * @param reservationDTO the reservationDTO to set
     */
    public void setReservationDTO(ReservationDTO reservationDTO) {
        this.reservationDTO = reservationDTO;
    }
    
    
    

    
   
    
    
    
}
