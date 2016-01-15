package com.market.entity;

import java.util.HashSet;
import java.util.Set;


/**
 * π‹¿Ì‘±
 * @author Administrator
 *
 */
public class MManager  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer managerId;
     private String managerName;
     private String password;
     private String createDate;
     private String lastLoginDate;
     private Set<MManager> MLogs = new HashSet<MManager>(0);


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

	public Integer getManagerId() {
		return managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(String lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public Set<MManager> getMLogs() {
		return MLogs;
	}

	public void setMLogs(Set<MManager> mLogs) {
		MLogs = mLogs;
	}
    
  


}