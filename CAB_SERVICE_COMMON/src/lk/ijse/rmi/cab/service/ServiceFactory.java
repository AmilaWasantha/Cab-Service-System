/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.service;

import java.rmi.Remote;

/**
 *
 * @author user
 */
public interface ServiceFactory extends Remote{
    
    public enum serviceType{
        User,RECIPTION,INSUARANCECOMPANY,CUSTOMER,PAYMENT,RESERVATION,VEHICLE
    }
    
    public SuperService getService(serviceType type)throws Exception;
    
}
