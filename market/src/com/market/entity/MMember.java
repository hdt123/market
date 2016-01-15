package com.market.entity;

import java.util.HashSet;
import java.util.Set;


/**
 * MMember entity. @author MyEclipse Persistence Tools
 */

public class MMember  implements java.io.Serializable {


    // Fields    

     private Integer memberId;
     private String memberName;
     private String password;
     private String phoneNum;
     private String email;
     private Integer gender;
     private String createTime;
     private String lastLoginTime;
     private Float totalPrice;
     private Integer state;
     private Set MShopcars = new HashSet(0);
     private Set MCollectiongoodses = new HashSet(0);
     private Set MSnapshotorders = new HashSet(0);
     private Set MCollectionstores = new HashSet(0);
     private Set MAddresses = new HashSet(0);
     private Set MOrders = new HashSet(0);
     private Set MRejecteds = new HashSet(0);


    // Constructors

    /** default constructor */
    public MMember() {
    }

	/** minimal constructor */
    public MMember(Integer memberId, String memberName, String password) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.password = password;
    }
    
    /** full constructor */
    public MMember(Integer memberId, String memberName, String password, String phoneNum, String email, Integer gender, String createTime, String lastLoginTime, Float totalPrice, Integer state, Set MShopcars, Set MCollectiongoodses, Set MSnapshotorders, Set MCollectionstores, Set MAddresses, Set MOrders, Set MRejecteds) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.password = password;
        this.phoneNum = phoneNum;
        this.email = email;
        this.gender = gender;
        this.createTime = createTime;
        this.lastLoginTime = lastLoginTime;
        this.totalPrice = totalPrice;
        this.state = state;
        this.MShopcars = MShopcars;
        this.MCollectiongoodses = MCollectiongoodses;
        this.MSnapshotorders = MSnapshotorders;
        this.MCollectionstores = MCollectionstores;
        this.MAddresses = MAddresses;
        this.MOrders = MOrders;
        this.MRejecteds = MRejecteds;
    }

   
    // Property accessors

    public Integer getMemberId() {
        return this.memberId;
    }
    
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return this.memberName;
    }
    
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNum() {
        return this.phoneNum;
    }
    
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGender() {
        return this.gender;
    }
    
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getCreateTime() {
        return this.createTime;
    }
    
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getLastLoginTime() {
        return this.lastLoginTime;
    }
    
    public void setLastLoginTime(String lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Float getTotalPrice() {
        return this.totalPrice;
    }
    
    public void setTotalPrice(Float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getState() {
        return this.state;
    }
    
    public void setState(Integer state) {
        this.state = state;
    }

    public Set getMShopcars() {
        return this.MShopcars;
    }
    
    public void setMShopcars(Set MShopcars) {
        this.MShopcars = MShopcars;
    }

    public Set getMCollectiongoodses() {
        return this.MCollectiongoodses;
    }
    
    public void setMCollectiongoodses(Set MCollectiongoodses) {
        this.MCollectiongoodses = MCollectiongoodses;
    }

    public Set getMSnapshotorders() {
        return this.MSnapshotorders;
    }
    
    public void setMSnapshotorders(Set MSnapshotorders) {
        this.MSnapshotorders = MSnapshotorders;
    }

    public Set getMCollectionstores() {
        return this.MCollectionstores;
    }
    
    public void setMCollectionstores(Set MCollectionstores) {
        this.MCollectionstores = MCollectionstores;
    }

    public Set getMAddresses() {
        return this.MAddresses;
    }
    
    public void setMAddresses(Set MAddresses) {
        this.MAddresses = MAddresses;
    }

    public Set getMOrders() {
        return this.MOrders;
    }
    
    public void setMOrders(Set MOrders) {
        this.MOrders = MOrders;
    }

    public Set getMRejecteds() {
        return this.MRejecteds;
    }
    
    public void setMRejecteds(Set MRejecteds) {
        this.MRejecteds = MRejecteds;
    }
   








}