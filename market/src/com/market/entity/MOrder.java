package com.market.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * MOrder entity. @author MyEclipse Persistence Tools
 */

public class MOrder implements java.io.Serializable {

	// Fields

	private Integer orderId;
	private MMember MMember;
	private MAddress MAddress;
	private String odreNum;
	private String createTime;
	private Float orderPrice;
	private Integer orderStatus;
	private String orderRemark;
	private Set MSnapshotorders = new HashSet(0);

	// Constructors

	/** default constructor */
	public MOrder() {
	}

	/** minimal constructor */
	public MOrder(MMember MMember, MAddress MAddress, String odreNum,
			String createTime, Float orderPrice, Integer orderStatus) {
		this.MMember = MMember;
		this.MAddress = MAddress;
		this.odreNum = odreNum;
		this.createTime = createTime;
		this.orderPrice = orderPrice;
		this.orderStatus = orderStatus;
	}

	/** full constructor */
	public MOrder(MMember MMember, MAddress MAddress, String odreNum,
			String createTime, Float orderPrice, Integer orderStatus,
			String orderRemark, Set MSnapshotorders) {
		this.MMember = MMember;
		this.MAddress = MAddress;
		this.odreNum = odreNum;
		this.createTime = createTime;
		this.orderPrice = orderPrice;
		this.orderStatus = orderStatus;
		this.orderRemark = orderRemark;
		this.MSnapshotorders = MSnapshotorders;
	}

	// Property accessors

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public MMember getMMember() {
		return this.MMember;
	}

	public void setMMember(MMember MMember) {
		this.MMember = MMember;
	}

	public MAddress getMAddress() {
		return this.MAddress;
	}

	public void setMAddress(MAddress MAddress) {
		this.MAddress = MAddress;
	}

	public String getOdreNum() {
		return this.odreNum;
	}

	public void setOdreNum(String odreNum) {
		this.odreNum = odreNum;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public Float getOrderPrice() {
		return this.orderPrice;
	}

	public void setOrderPrice(Float orderPrice) {
		this.orderPrice = orderPrice;
	}

	public Integer getOrderStatus() {
		return this.orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderRemark() {
		return this.orderRemark;
	}

	public void setOrderRemark(String orderRemark) {
		this.orderRemark = orderRemark;
	}

	public Set getMSnapshotorders() {
		return this.MSnapshotorders;
	}

	public void setMSnapshotorders(Set MSnapshotorders) {
		this.MSnapshotorders = MSnapshotorders;
	}

}