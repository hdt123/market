package com.market.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * MAddress entity. @author 胡铎腾
 * 收货地址
 */

public class MAddress implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Fields

	private Integer addressId;
	private MProvince MProvinceByAreaId;     //省市区镇
	private MProvince MProvinceByProvinceId;  //省市区镇
	private MProvince MProvinceByCityId;  //省市区镇
	private MMember MMember;			//地址所属会员
	private MProvince MProvinceByCountryId;
	private String addressDetail;     //详细地址
	private Integer state;             //排序，默认地址state = 0；
	private String phoneNum;
	private String contactName;       //联系人
	private String postCode;         //邮编
	private Set<MOrder> MOrders = new HashSet<MOrder>(0);   //订单集合

	// Constructors

	/** default constructor */
	public MAddress() {
	}

	/** minimal constructor */
	public MAddress(MProvince MProvinceByAreaId,
			MProvince MProvinceByProvinceId, MProvince MProvinceByCityId,
			MMember MMember, String phoneNum, String contactName) {
		this.MProvinceByAreaId = MProvinceByAreaId;
		this.MProvinceByProvinceId = MProvinceByProvinceId;
		this.MProvinceByCityId = MProvinceByCityId;
		this.MMember = MMember;
		this.phoneNum = phoneNum;
		this.contactName = contactName;
	}

	/** full constructor */
	public MAddress(MProvince MProvinceByAreaId,
			MProvince MProvinceByProvinceId, MProvince MProvinceByCityId,
			MMember MMember, MProvince MProvinceByCountryId,
			String addressDetail, Integer state, String phoneNum,
			String contactName, String postCode, Set<MOrder> MOrders) {
		this.MProvinceByAreaId = MProvinceByAreaId;
		this.MProvinceByProvinceId = MProvinceByProvinceId;
		this.MProvinceByCityId = MProvinceByCityId;
		this.MMember = MMember;
		this.MProvinceByCountryId = MProvinceByCountryId;
		this.addressDetail = addressDetail;
		this.state = state;
		this.phoneNum = phoneNum;
		this.contactName = contactName;
		this.postCode = postCode;
		this.MOrders = MOrders;
	}

	// Property accessors

	public Integer getAddressId() {
		return this.addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public MProvince getMProvinceByAreaId() {
		return this.MProvinceByAreaId;
	}

	public void setMProvinceByAreaId(MProvince MProvinceByAreaId) {
		this.MProvinceByAreaId = MProvinceByAreaId;
	}

	public MProvince getMProvinceByProvinceId() {
		return this.MProvinceByProvinceId;
	}

	public void setMProvinceByProvinceId(MProvince MProvinceByProvinceId) {
		this.MProvinceByProvinceId = MProvinceByProvinceId;
	}

	public MProvince getMProvinceByCityId() {
		return this.MProvinceByCityId;
	}

	public void setMProvinceByCityId(MProvince MProvinceByCityId) {
		this.MProvinceByCityId = MProvinceByCityId;
	}

	public MMember getMMember() {
		return this.MMember;
	}

	public void setMMember(MMember MMember) {
		this.MMember = MMember;
	}

	public MProvince getMProvinceByCountryId() {
		return this.MProvinceByCountryId;
	}

	public void setMProvinceByCountryId(MProvince MProvinceByCountryId) {
		this.MProvinceByCountryId = MProvinceByCountryId;
	}

	public String getAddressDetail() {
		return this.addressDetail;
	}

	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getPhoneNum() {
		return this.phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getContactName() {
		return this.contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getPostCode() {
		return this.postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public Set<MOrder> getMOrders() {
		return this.MOrders;
	}

	public void setMOrders(Set<MOrder> MOrders) {
		this.MOrders = MOrders;
	}

}