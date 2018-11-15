/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.startup;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.rmi.cab.service.impl.ServiceFactoryImpl;

/**
 *
 * @author user
 */
public class StartServer {
    public static void main(String args[]){
        try {
            Registry registry=LocateRegistry.createRegistry(5050);
            registry.rebind("cab", ServiceFactoryImpl.getInstance());
            System.out.println("Server Is Start");
        } catch (RemoteException ex) {
            Logger.getLogger(StartServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
