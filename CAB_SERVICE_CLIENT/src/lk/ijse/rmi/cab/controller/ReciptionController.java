/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.controller;

import java.util.List;
import lk.ijse.rmi.cab.dto.ReciptionDTO;
import lk.ijse.rmi.cab.proxy.ProxyHandler;
import lk.ijse.rmi.cab.service.ServiceFactory;
import lk.ijse.rmi.cab.service.custom.ReciptionService;

/**
 *
 * @author user
 */
public class ReciptionController {
    public static boolean addReciption(ReciptionDTO reciptionDTO)throws Exception{
        ReciptionService reciptionService=(ReciptionService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.RECIPTION);
        return reciptionService.addReciption(reciptionDTO);
    }
    
    public static boolean updateReciption(ReciptionDTO reciptionDTO)throws Exception{
        ReciptionService reciptionService=(ReciptionService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.RECIPTION);
        return reciptionService.updateReciption(reciptionDTO);
    }
    
    public static boolean deleteReciption(int id)throws Exception{
        ReciptionService reciptionService=(ReciptionService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.RECIPTION);
        return reciptionService.deleteReciption(id);
    }
    
    public static ReciptionDTO findReciption(int id)throws Exception{
        ReciptionService reciptionService=(ReciptionService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.RECIPTION);
        return reciptionService.findReciption(id);
    }
    
    public static List<ReciptionDTO>findAllReciption()throws Exception{
        ReciptionService reciptionService=(ReciptionService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.RECIPTION);
        return reciptionService.findAllReciption();
    }
    
}
