/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.repository.custom;

import java.util.List;
import lk.ijse.rmi.cab.entity.Payment;
import lk.ijse.rmi.cab.repository.SuperRepository;

/**
 *
 * @author user
 */
public interface PaymentRepository extends SuperRepository<Payment,String>{
    
    public Payment findDetailsforFullPayment(int id)throws Exception;
    public List<Payment>serchDetailsForModifyReservation(String rid)throws Exception;
    
}
