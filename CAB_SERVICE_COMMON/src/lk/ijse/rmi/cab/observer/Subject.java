/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.observer;

import java.rmi.Remote;

/**
 *
 * @author user
 */
public interface Subject extends Remote{
    
    public void registerObserver(Observer observer)throws Exception;
    
    public void unRegisterObserver(Observer observer)throws Exception;
    
    public void notifyAllObservers(String message)throws Exception;
}
