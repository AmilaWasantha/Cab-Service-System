/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.dto;

/**
 *
 * @author user
 */
public class CustomerDTO extends SuperDTO{
    private int custId;
    private String custName;
    private String custNic;
    private String custLicenseId;
    private String custTelNumber;
    private String custDob;

    public CustomerDTO() {
    }

    public CustomerDTO( String custName, String custNic, String custLicenseId, String custTelNumber, String custDob) {
        this.custId = custId;
        this.custName = custName;
        this.custNic = custNic;
        this.custLicenseId = custLicenseId;
        this.custTelNumber = custTelNumber;
        this.custDob = custDob;
    }

    public CustomerDTO(int custId, String custName, String custNic, String custLicenseId, String custTelNumber, String custDob) {
        this.custId = custId;
        this.custName = custName;
        this.custNic = custNic;
        this.custLicenseId = custLicenseId;
        this.custTelNumber = custTelNumber;
        this.custDob = custDob;
    }

    public CustomerDTO(int custId) {
        this.custId=custId;
    }

    

    /**
     * @return the custId
     */
    public int getCustId() {
        return custId;
    }

    /**
     * @param custId the custId to set
     */
    public void setCustId(int custId) {
        this.custId = custId;
    }

    /**
     * @return the custName
     */
    public String getCustName() {
        return custName;
    }

    /**
     * @param custName the custName to set
     */
    public void setCustName(String custName) {
        this.custName = custName;
    }

    /**
     * @return the custNic
     */
    public String getCustNic() {
        return custNic;
    }

    /**
     * @param custNic the custNic to set
     */
    public void setCustNic(String custNic) {
        this.custNic = custNic;
    }

    /**
     * @return the custLicenseId
     */
    public String getCustLicenseId() {
        return custLicenseId;
    }

    /**
     * @param custLicenseId the custLicenseId to set
     */
    public void setCustLicenseId(String custLicenseId) {
        this.custLicenseId = custLicenseId;
    }

    /**
     * @return the custTelNumber
     */
    public String getCustTelNumber() {
        return custTelNumber;
    }

    /**
     * @param custTelNumber the custTelNumber to set
     */
    public void setCustTelNumber(String custTelNumber) {
        this.custTelNumber = custTelNumber;
    }

    /**
     * @return the custDob
     */
    public String getCustDob() {
        return custDob;
    }

    /**
     * @param custDob the custDob to set
     */
    public void setCustDob(String custDob) {
        this.custDob = custDob;
    }

    
    
    
    
}
