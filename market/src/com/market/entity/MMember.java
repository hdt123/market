package com.market.entity;

import java.util.HashSet;
import java.util.Set;


/**
 * MMember entity. @author MyEclipse Persistence Tools
 */

public class MMember  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer memberId;
     private String memberName;
     private String password;
     private String phoneNum;
     private String email;
     private Integer gender;   //1.男  2.女     0.未知
     private String createTime;     //注册时间
     private String lastLoginTime;  //最后登录时间
     private Float totalPrice;    //消费总金额
     private Integer state;       //状态
     private Set<MShopcar> MShopcars = new HashSet<MShopcar>(0);     //购物车集合
     private Set<MCollectiongoods> MCollectiongoodses = new HashSet<MCollectiongoods>(0);    //收藏的商品集合
     private Set<MSnapshotorder> MSnapshotorders = new HashSet<MSnapshotorder>(0);			// 快照集合
     private Set<MCollectionstore> MCollectionstores = new HashSet<MCollectionstore>(0);   //收藏的门店集合
     private Set<MAddress> MAddresses = new HashSet<MAddress>(0);  	  //地址集合
     private Set<MOrder> MOrders = new HashSet<MOrder>(0);    		 //订单
     private Set<MRejected> MRejecteds = new HashSet<MRejected>(0);   //退货换货集合


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

	public Integer getMemberId() {
		return memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(String lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public Float getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Float totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Set<MShopcar> getMShopcars() {
		return MShopcars;
	}

	public void setMShopcars(Set<MShopcar> mShopcars) {
		MShopcars = mShopcars;
	}

	public Set<MCollectiongoods> getMCollectiongoodses() {
		return MCollectiongoodses;
	}

	public void setMCollectiongoodses(Set<MCollectiongoods> mCollectiongoodses) {
		MCollectiongoodses = mCollectiongoodses;
	}

	public Set<MSnapshotorder> getMSnapshotorders() {
		return MSnapshotorders;
	}

	public void setMSnapshotorders(Set<MSnapshotorder> mSnapshotorders) {
		MSnapshotorders = mSnapshotorders;
	}

	public Set<MCollectionstore> getMCollectionstores() {
		return MCollectionstores;
	}

	public void setMCollectionstores(Set<MCollectionstore> mCollectionstores) {
		MCollectionstores = mCollectionstores;
	}

	public Set<MAddress> getMAddresses() {
		return MAddresses;
	}

	public void setMAddresses(Set<MAddress> mAddresses) {
		MAddresses = mAddresses;
	}

	public Set<MOrder> getMOrders() {
		return MOrders;
	}

	public void setMOrders(Set<MOrder> mOrders) {
		MOrders = mOrders;
	}

	public Set<MRejected> getMRejecteds() {
		return MRejecteds;
	}

	public void setMRejecteds(Set<MRejected> mRejecteds) {
		MRejecteds = mRejecteds;
	}


}