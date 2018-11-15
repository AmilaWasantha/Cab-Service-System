/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.controller;

import java.util.List;
import lk.ijse.rmi.cab.dto.InsuaranceCompanyDTO;
import lk.ijse.rmi.cab.proxy.ProxyHandler;
import lk.ijse.rmi.cab.service.ServiceFactory;
import lk.ijse.rmi.cab.service.custom.InsuaranceCompanyService;

/**
 *
 * @author user
 */
public class InsuaranceCompanyController {
    
    public static boolean addInsuaranceCompany(InsuaranceCompanyDTO insuaranceCompanyDTO)throws Exception{
        InsuaranceCompanyService insuaranceCompanyService=(InsuaranceCompanyService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.INSUARANCECOMPANY);
        return insuaranceCompanyService.addInsuaranceCompany(insuaranceCompanyDTO);
    }
    public static boolean updateInsuaranceCompany(InsuaranceCompanyDTO insuaranceCompanyDTO)throws Exception{
        InsuaranceCompanyService insuaranceCompanyService=(InsuaranceCompanyService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.INSUARANCECOMPANY);
        return insuaranceCompanyService.updateInsuaranceCompany(insuaranceCompanyDTO);
        
    }
    
    public static boolean deleteInsuaranceCompany(int id)throws Exception{
        InsuaranceCompanyService insuaranceCompanyService=(InsuaranceCompanyService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.INSUARANCECOMPANY);
        return insuaranceCompanyService.deleteInsuaranceCompany(id);
    }
    
    
//    public static InsuaranceCompanyDTO findInsuaranceCompany(int InsuaranceCompanyName)throws Exception{
//        InsuaranceCompanyService insuaranceCompanyService=(InsuaranceCompanyService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.INSUARANCECOMPANY);
//        return insuaranceCompanyService.findInsuaranceCompany(InsuaranceCompanyName);
//    }
    
    public static List<InsuaranceCompanyDTO>findAllInsuaranceCompany()throws Exception{
        InsuaranceCompanyService insuaranceCompanyService=(InsuaranceCompanyService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.INSUARANCECOMPANY);
        return insuaranceCompanyService.findAllInsuaranceCompany();
    }
    
    public static InsuaranceCompanyDTO getFindByCompanyName(String CompanyName)throws Exception{
        InsuaranceCompanyService insuaranceCompanyService=(InsuaranceCompanyService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.INSUARANCECOMPANY);
        return insuaranceCompanyService.getFindByCompanyName(CompanyName);
    }
    
    public static InsuaranceCompanyDTO searchById(String id)throws Exception{
        InsuaranceCompanyService insuaranceCompanyService=(InsuaranceCompanyService) ProxyHandler.getInstance().getService(ServiceFactory.serviceType.INSUARANCECOMPANY);
        return insuaranceCompanyService.serchById(id);
    }
}
