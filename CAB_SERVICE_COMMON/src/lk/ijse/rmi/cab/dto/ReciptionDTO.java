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
public class ReciptionDTO extends SuperDTO{
    private int reciptionId;
    private String reciptionName;

    public ReciptionDTO() {
    }

    public ReciptionDTO(String reciptionName) {
         this.reciptionName = reciptionName;
    }

    public ReciptionDTO(int reciptionId, String reciptionName) {
        this.reciptionId = reciptionId;
        this.reciptionName = reciptionName;
    }

    /**
     * @return the reciptionId
     */
    public int getReciptionId() {
        return reciptionId;
    }

    /**
     * @param reciptionId the reciptionId to set
     */
    public void setReciptionId(int reciptionId) {
        this.reciptionId = reciptionId;
    }

    /**
     * @return the reciptionName
     */
    public String getReciptionName() {
        return reciptionName;
    }

    /**
     * @param reciptionName the reciptionName to set
     */
    public void setReciptionName(String reciptionName) {
        this.reciptionName = reciptionName;
    }

    
    
    
    
}
