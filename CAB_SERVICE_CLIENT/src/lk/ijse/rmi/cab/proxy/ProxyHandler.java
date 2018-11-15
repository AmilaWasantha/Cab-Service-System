/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.proxy;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.rmi.cab.service.ServiceFactory;
import lk.ijse.rmi.cab.service.SuperService;
import lk.ijse.rmi.cab.service.custom.CustomerService;
import lk.ijse.rmi.cab.service.custom.InsuaranceCompanyService;
import lk.ijse.rmi.cab.service.custom.PaymentService;
import lk.ijse.rmi.cab.service.custom.ReciptionService;
import lk.ijse.rmi.cab.service.custom.ReservationService;
import lk.ijse.rmi.cab.service.custom.UserService;
import lk.ijse.rmi.cab.service.custom.VehicleService;

/**
 *
 * @author user
 */
public class ProxyHandler implements ServiceFactory{
    
    private static ProxyHandler proxyHandler;
    private ServiceFactory serviceFactory;
    private UserService userService;
    private ReciptionService reciptionService;
    private InsuaranceCompanyService insuaranceCompanyService;
    private CustomerService customerService;
    private ReservationService reservationService;
    private PaymentService paymentService;
    private VehicleService vehicleService;
    

    public ProxyHandler() {
        try {
            serviceFactory=(ServiceFactory) Naming.lookup("rmi://localhost:5050/cab");
            userService=(UserService) serviceFactory.getService(serviceType.User);
            reciptionService=(ReciptionService) serviceFactory.getService(serviceType.RECIPTION);
            insuaranceCompanyService=(InsuaranceCompanyService) serviceFactory.getService(serviceType.INSUARANCECOMPANY);
            customerService=(CustomerService) serviceFactory.getService(serviceType.CUSTOMER);
            paymentService=(PaymentService) serviceFactory.getService(serviceType.PAYMENT);
            reservationService=(ReservationService) serviceFactory.getService(serviceType.RESERVATION);
            vehicleService=(VehicleService) serviceFactory.getService(serviceType.VEHICLE);
            
        } catch (NotBoundException ex) {
            Logger.getLogger(ProxyHandler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ProxyHandler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ProxyHandler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ProxyHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static ProxyHandler getInstance(){
        if(proxyHandler==null){
            proxyHandler=new ProxyHandler();
        }
        return proxyHandler;
    }
    
    

    @Override
    public SuperService getService(serviceType type) throws Exception {
        switch(type){
            case User:
                return userService;
            case RECIPTION:
                return reciptionService;
            case INSUARANCECOMPANY:
                return insuaranceCompanyService;
            case CUSTOMER:
                return customerService;
            case RESERVATION:
                return reservationService;
            case PAYMENT:
                return paymentService;
            case VEHICLE:
                return vehicleService;
            default:
                return null;
        }
    }
    
}
