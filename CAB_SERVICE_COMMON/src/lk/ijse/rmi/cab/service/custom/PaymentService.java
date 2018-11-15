/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.service.custom;

import java.util.List;
import lk.ijse.rmi.cab.dto.PaymentDTO;
import lk.ijse.rmi.cab.service.SuperService;

/**
 *
 * @author user
 */
public interface PaymentService extends SuperService{
    public boolean addPayment(PaymentDTO paymentDTO)throws Exception;
    public boolean updatePayment(PaymentDTO paymentDTO)throws Exception;
    public boolean deletePayment(int id)throws Exception;
    public PaymentDTO findPayment(int id)throws Exception;
    public List<PaymentDTO>findAllPayment()throws Exception;
    public PaymentDTO findDetailsforFullPayment(int id)throws Exception;
    public List<PaymentDTO>serchDetailsForModifyReservation(String rid)throws Exception;
            
    
}
