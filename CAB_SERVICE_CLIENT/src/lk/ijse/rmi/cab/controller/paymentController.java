/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.controller;

import java.util.List;
import lk.ijse.rmi.cab.dto.PaymentDTO;
import lk.ijse.rmi.cab.proxy.ProxyHandler;
import lk.ijse.rmi.cab.service.ServiceFactory;
import lk.ijse.rmi.cab.service.custom.PaymentService;

/**
 *
 * @author user
 */
public class paymentController {
    
    public static boolean addPayment(PaymentDTO paymentDTO)throws Exception{
        PaymentService paymentService=(PaymentService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.PAYMENT);
        return paymentService.addPayment(paymentDTO);
    }
    
    public static boolean upadatePayment(PaymentDTO paymentDTO)throws Exception{
        PaymentService paymentService=(PaymentService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.PAYMENT);
        return paymentService.updatePayment(paymentDTO);
    }
    
    public static boolean deletePayment(int id)throws Exception{
        PaymentService paymentService=(PaymentService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.PAYMENT);
        return paymentService.deletePayment(id);
    }
    
    public static PaymentDTO findPayment(int id)throws Exception{
        PaymentService paymentService=(PaymentService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.PAYMENT);
        return paymentService.findPayment(id);
    }
    
    public static List<PaymentDTO>findAllPayments()throws Exception{
        PaymentService paymentService=(PaymentService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.PAYMENT);
        return paymentService.findAllPayment();
    }
    public static PaymentDTO findDetailsforFullPayment(int id)throws Exception{
        PaymentService paymentService=(PaymentService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.PAYMENT);
        return paymentService.findDetailsforFullPayment(id);
    }
    public static List<PaymentDTO>serchDetailsForModifyReservation(String rid)throws Exception{
        PaymentService paymentService=(PaymentService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.PAYMENT);
        return paymentService.serchDetailsForModifyReservation(rid);
    }
    
}
