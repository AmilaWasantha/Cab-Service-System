/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.buisness;

import lk.ijse.rmi.cab.buisness.custom.impl.CustomerBOImpl;
import lk.ijse.rmi.cab.buisness.custom.impl.InsuaranceCompanyBOImpl;
import lk.ijse.rmi.cab.buisness.custom.impl.PaymentBOImpl;
import lk.ijse.rmi.cab.buisness.custom.impl.ReciptionBOImpl;
import lk.ijse.rmi.cab.buisness.custom.impl.ReservationBOImpl;
import lk.ijse.rmi.cab.buisness.custom.impl.UserBOImpl;
import lk.ijse.rmi.cab.buisness.custom.impl.VehicleBOImpl;

/**
 *
 * @author user
 */
public class BOFactory {
        
          
    private static BOFactory bOFactory;
    
    public enum BOType{
        USER,RECIPTION,INSUARANCECOMPANY,CUSTOMER,PAYMENT,RESERVATION,VEHICLE
    }
    private BOFactory(){}
    
    public static BOFactory getInstance(){
        if(bOFactory==null){
            bOFactory=new BOFactory();
        }
        return bOFactory;
    }
    
    public SuperBO getType(BOType type){
        switch(type){
            case USER:
                return new UserBOImpl();
            case RECIPTION:
                return new ReciptionBOImpl();
                
            case INSUARANCECOMPANY:
                return new InsuaranceCompanyBOImpl();
            case CUSTOMER:
                return new CustomerBOImpl();
            case PAYMENT :
                return new PaymentBOImpl();
            case RESERVATION:
                return new ReservationBOImpl();
            case VEHICLE:
                return new VehicleBOImpl();
            default:
                return null;
        }
    }

    
    
}
