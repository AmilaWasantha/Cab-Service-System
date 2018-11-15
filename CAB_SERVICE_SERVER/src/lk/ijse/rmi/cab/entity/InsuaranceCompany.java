/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author user
 */
@Entity
public class InsuaranceCompany {
    @Id
    
    private String insuaranceCompanyId;
    private String companyName;
    private String insuaranceType;
    
    

    public InsuaranceCompany() {
    }

    public InsuaranceCompany(String companyName, String insuaranceType) {
         this.companyName = companyName;
        this.insuaranceType = insuaranceType;
    }

    public InsuaranceCompany(String insuaranceCompanyId, String companyName, String insuaranceType) {
        this.insuaranceCompanyId = insuaranceCompanyId;
        this.companyName = companyName;
        this.insuaranceType = insuaranceType;
    }

    public InsuaranceCompany(String insuaranceCompanyId) {
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

    @Override
    public String toString() {
        return "InsuaranceCompany{" + "insuaranceCompanyId=" + insuaranceCompanyId + ", companyName=" + companyName + ", insuaranceType=" + insuaranceType + '}';
    }

    
    

    
    

    
    
    
}
