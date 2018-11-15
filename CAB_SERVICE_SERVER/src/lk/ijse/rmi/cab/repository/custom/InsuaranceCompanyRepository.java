/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.repository.custom;

import lk.ijse.rmi.cab.entity.InsuaranceCompany;
import lk.ijse.rmi.cab.repository.SuperRepository;

/**
 *
 * @author user
 */
public interface InsuaranceCompanyRepository extends SuperRepository<InsuaranceCompany, String>{

    public InsuaranceCompany getFindByCompanyName(String CompanyName)throws Exception;
    public InsuaranceCompany searchBYId(String id)throws Exception;
    
}
