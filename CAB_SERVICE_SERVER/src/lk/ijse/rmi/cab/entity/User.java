/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.rmi.cab.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author user
 */
@Entity
public class User {
    @Id
    private String UserName;
    private String password;
    private String type;

    public User() {
    }

    public User(String password, String type) {
        this.UserName = UserName;
        this.password = password;
        this.type = type;
    }

    public User(String UserName, String password, String type) {
        this.UserName = UserName;
        this.password = password;
        this.type = type;
    }

    public User(String userName) {
        this.UserName=userName;
    }

    /**
     * @return the UserName
     */
    public String getUserName() {
        return UserName;
    }

    /**
     * @param UserName the UserName to set
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "User{" + "UserName=" + UserName + ", password=" + password + ", type=" + type + '}';
    }

    
    

    

    
    
    
    
}
