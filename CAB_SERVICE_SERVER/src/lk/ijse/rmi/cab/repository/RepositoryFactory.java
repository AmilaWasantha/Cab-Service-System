/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.repository;

import lk.ijse.rmi.cab.repository.custom.impl.CustomerRepositoryImpl;
import lk.ijse.rmi.cab.repository.custom.impl.InsuaranceCompanyRepositoryImpl;
import lk.ijse.rmi.cab.repository.custom.impl.PaymentRepositoryImpl;
import lk.ijse.rmi.cab.repository.custom.impl.ReciptionRepositoryImpl;
import lk.ijse.rmi.cab.repository.custom.impl.ReservationRepositoryImpl;
import lk.ijse.rmi.cab.repository.custom.impl.UserRepositoryImpl;
import lk.ijse.rmi.cab.repository.custom.impl.VehicleRepositoryImpl;


/**
 *
 * @author user
 */
public class RepositoryFactory {
    
    private static RepositoryFactory repositoryFactory;
    
    public enum RepositoryType{
        USER,RECIPTION,INSUARANCECOMPANY,CUSTOMER,PAYMENT,RESERVATION,VEHICLE
    }

    private RepositoryFactory() {
    }
    
    public static RepositoryFactory getInstance(){
        if(repositoryFactory==null){
            repositoryFactory=new RepositoryFactory();
        }
        return repositoryFactory;
    }
    
    public SuperRepository getRepository(RepositoryType type){
        switch(type){
            case USER:
                return new UserRepositoryImpl();
            case RECIPTION:
                return new ReciptionRepositoryImpl();
            case INSUARANCECOMPANY:
                return new InsuaranceCompanyRepositoryImpl();
            case CUSTOMER:
                return new CustomerRepositoryImpl();
            case PAYMENT:
                return new PaymentRepositoryImpl();
            case RESERVATION:
                return new ReservationRepositoryImpl();
            case VEHICLE:
                return new VehicleRepositoryImpl();
            default:
                return null;
        }
    }
}
