/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.buisness.custom;

import java.util.List;
import lk.ijse.rmi.cab.buisness.SuperBO;
import lk.ijse.rmi.cab.dto.InsuaranceCompanyDTO;

/**
 *
 * @author user
 */
public interface InsuaranceCompanyBO extends SuperBO{
    public boolean addInsuaranceCompany(InsuaranceCompanyDTO insuaranceCompanyDTO)throws Exception;
    public boolean updateInsuaranceCompany(InsuaranceCompanyDTO insuaranceCompanyDTO)throws Exception;
    public boolean deleteInsuaranceCompany(int id)throws Exception;
   // public InsuaranceCompanyDTO findInsuranceCompany(int InsuaranceCompanyName)throws Exception;
    public InsuaranceCompanyDTO getFindByCompanyName(String companyName)throws Exception;
    public List<InsuaranceCompanyDTO>findAllInsuaranceCompany()throws Exception;
    public InsuaranceCompanyDTO serchBYId(String id)throws Exception;
    
}
