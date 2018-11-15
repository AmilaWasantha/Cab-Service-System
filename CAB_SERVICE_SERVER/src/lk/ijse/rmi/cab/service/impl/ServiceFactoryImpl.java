/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.service.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import lk.ijse.rmi.cab.service.ServiceFactory;
import lk.ijse.rmi.cab.service.SuperService;
import lk.ijse.rmi.cab.service.custom.impl.CustomerServiceImpl;
import lk.ijse.rmi.cab.service.custom.impl.InsuaranceCompanyServiceImpl;
import lk.ijse.rmi.cab.service.custom.impl.PaymentServiceImpl;
import lk.ijse.rmi.cab.service.custom.impl.ReciptionServiceImpl;
import lk.ijse.rmi.cab.service.custom.impl.ReservationServiceImpl;
import lk.ijse.rmi.cab.service.custom.impl.UserServiceImpl;
import lk.ijse.rmi.cab.service.custom.impl.VehicleServiceImpl;

/**
 *
 * @author user
 */
public class ServiceFactoryImpl extends UnicastRemoteObject implements ServiceFactory{
    
    private static ServiceFactory serviceFactory;

    private ServiceFactoryImpl()throws RemoteException{
       
    }
    
    public static ServiceFactory getInstance() throws RemoteException{
        if(serviceFactory==null){
            serviceFactory=new ServiceFactoryImpl();
        }
        return serviceFactory;
    }
    
    
    
    

    @Override
    public SuperService getService(serviceType type) throws Exception {
        switch(type){
            case User:
                return new UserServiceImpl();
            case RECIPTION:
                return new ReciptionServiceImpl();
            case INSUARANCECOMPANY:
                return new InsuaranceCompanyServiceImpl();
            case CUSTOMER:
                return new CustomerServiceImpl();
            case PAYMENT:
                return new PaymentServiceImpl();
            case RESERVATION:
                return new ReservationServiceImpl();
            case VEHICLE:
                return new VehicleServiceImpl();
            
            default:
                return null;
        }
    }
    
    
    
}
