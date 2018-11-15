/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author user
 */
@Entity
public class Reciption {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int reciptionId;
    private String reciptionName;

    public Reciption() {
    }

    public Reciption( String reciptionName) {
        this.reciptionId = reciptionId;
        this.reciptionName = reciptionName;
    }

    public Reciption(int reciptionId, String reciptionName) {
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

    @Override
    public String toString() {
        return "Reciption{" + "reciptionId=" + reciptionId + ", reciptionName=" + reciptionName + '}';
    }

    
    
    
    
}
