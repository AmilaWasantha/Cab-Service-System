/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.service.custom;

import java.util.List;
import lk.ijse.rmi.cab.dto.InsuaranceCompanyDTO;
import lk.ijse.rmi.cab.service.SuperService;

/**
 *
 * @author user
 */
public interface InsuaranceCompanyService extends SuperService{
    public boolean addInsuaranceCompany(InsuaranceCompanyDTO insuaranceCompanyDTO)throws Exception;
    public boolean updateInsuaranceCompany(InsuaranceCompanyDTO insuaranceCompanyDTO)throws Exception;
    public boolean deleteInsuaranceCompany(int id)throws Exception;
    //public InsuaranceCompanyDTO findInsuaranceCompany(int InsuaranceCompanyName)throws Exception;
    public InsuaranceCompanyDTO getFindByCompanyName(String CompanyName)throws Exception;
    public List<InsuaranceCompanyDTO>findAllInsuaranceCompany()throws Exception;
    public InsuaranceCompanyDTO serchById(String id)throws Exception;
}
