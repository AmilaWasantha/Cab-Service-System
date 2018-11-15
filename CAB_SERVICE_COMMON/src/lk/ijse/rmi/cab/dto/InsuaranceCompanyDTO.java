/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.dto;

import java.util.List;
import javax.swing.JTextField;

/**
 *
 * @author user
 */
public class InsuaranceCompanyDTO extends SuperDTO{
   
    private String insuaranceCompanyId;
    private String companyName;
    private String insuaranceType;
    
    

    public InsuaranceCompanyDTO() {
    }

    public InsuaranceCompanyDTO( String companyName, String insuaranceType) {
        
        this.companyName = companyName;
        this.insuaranceType = insuaranceType;
    }

    public InsuaranceCompanyDTO(String insuaranceCompanyId, String companyName, String insuaranceType) {
        this.insuaranceCompanyId = insuaranceCompanyId;
        this.companyName = companyName;
        this.insuaranceType = insuaranceType;
    }

    public InsuaranceCompanyDTO(String insuaranceCompanyId) {
       this.insuaranceCompanyId=insuaranceCompanyId;
    }

  

    /**
     * @return the insuaranceCompanyId
     */
    public String getInsuaranceCompanyId() {
        return insuaranceCompanyId;
    }

    /**
     * @param insuaranceCompanyId the insuaranceCompanyId to set
     */
    public void setInsuaranceCompanyId(String insuaranceCompanyId) {
        this.insuaranceCompanyId = insuaranceCompanyId;
    }

    /**
     * @return the companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * @param companyName the companyName to set
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * @return the insuaranceType
     */
    public String getInsuaranceType() {
        return insuaranceType;
    }

    /**
     * @param insuaranceType the insuaranceType to set
     */
    public void setInsuaranceType(String insuaranceType) {
        this.insuaranceType = insuaranceType;
    }

    

    

   

    

    
    
    
    
}
