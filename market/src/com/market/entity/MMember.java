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
     private Integer gender;   //1.��  2.Ů     0.δ֪
     private String createTime;     //ע��ʱ��
     private String lastLoginTime;  //����¼ʱ��
     private Float totalPrice;    //�����ܽ��
     private Integer state;       //״̬
     private Set<MShopcar> MShopcars = new HashSet<MShopcar>(0);     //���ﳵ����
     private Set<MCollectiongoods> MCollectiongoodses = new HashSet<MCollectiongoods>(0);    //�ղص���Ʒ����
     private Set<MSnapshotorder> MSnapshotorders = new HashSet<MSnapshotorder>(0);			// ���ռ���
     private Set<MCollectionstore> MCollectionstores = new HashSet<MCollectionstore>(0);   //�ղص��ŵ꼯��
     private Set<MAddress> MAddresses = new HashSet<MAddress>(0);  	  //��ַ����
     private Set<MOrder> MOrders = new HashSet<MOrder>(0);    		 //����
     private Set<MRejected> MRejecteds = new HashSet<MRejected>(0);   //�˻���������


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