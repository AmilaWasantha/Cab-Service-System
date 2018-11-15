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
public class UserDTO extends SuperDTO{
    
    private String UserName;
    private String password;
    private String type;

    public UserDTO() {
    }

    public UserDTO( String password, String type) {
        this.UserName = UserName;
        this.password = password;
        this.type = type;
    }

    public UserDTO(String UserName, String password, String type) {
        this.UserName = UserName;
        this.password = password;
        this.type = type;
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

    

    
    
    
    
    
    
    
    
}
