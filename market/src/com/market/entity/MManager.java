package com.market.entity;

import java.util.HashSet;
import java.util.Set;


/**
 * MManager entity. @author MyEclipse Persistence Tools
 */

public class MManager  implements java.io.Serializable {


    // Fields    

     private Integer managerId;
     private String managerName;
     private String password;
     private String createDate;
     private String lastLoginDate;
     private Set MLogs = new HashSet(0);


    // Constructors

    /** default constructor */
    public MManager() {
    }

	/** minimal constructor */
    public MManager(Integer managerId, String managerName, String password) {
        this.managerId = managerId;
        this.managerName = managerName;
        this.password = password;
    }
    
    /** full constructor */
    public MManager(Integer managerId, String managerName, String password, String createDate, String lastLoginDate, Set MLogs) {
        this.managerId = managerId;
        this.managerName = managerName;
        this.password = password;
        this.createDate = createDate;
        this.lastLoginDate = lastLoginDate;
        this.MLogs = MLogs;
    }

   
    // Property accessors

    public Integer getManagerId() {
        return this.managerId;
    }
    
    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public String getManagerName() {
        return this.managerName;
    }
    
    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreateDate() {
        return this.createDate;
    }
    
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getLastLoginDate() {
        return this.lastLoginDate;
    }
    
    public void setLastLoginDate(String lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public Set getMLogs() {
        return this.MLogs;
    }
    
    public void setMLogs(Set MLogs) {
        this.MLogs = MLogs;
    }
   








}