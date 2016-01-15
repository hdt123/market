package com.market.entity;

import java.util.HashSet;
import java.util.Set;


/**
 * 订单
 * @author Administrator
 *
 */
public class MOrder  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer orderId;
     private MMember MMember;     //该订单的所属会员
     private MAddress MAddress;
     private String odreNum;
     private String createTime;
     private Float orderPrice;
     private Integer orderStatus;
     private String orderRemark;
     private Set<MSnapshotorder> MSnapshotorders = new HashSet<MSnapshotorder>(0);   //该订单下的商品快照


    // Constructors

    /** default constructor */
    public MOrder() {
    }

	/** minimal constructor */
    public MOrder(Integer orderId, MMember MMember, MAddress MAddress, String odreNum, String createTime, Float orderPrice, Integer orderStatus) {
        this.orderId = orderId;
        this.MMember = MMember;
        this.MAddress = MAddress;
        this.odreNum = odreNum;
        this.createTime = createTime;
        this.orderPrice = orderPrice;
        this.orderStatus = orderStatus;
    }

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public MMember getMMember() {
		return MMember;
	}

	public void setMMember(MMember mMember) {
		MMember = mMember;
	}

	public MAddress getMAddress() {
		return MAddress;
	}

	public void setMAddress(MAddress mAddress) {
		MAddress = mAddress;
	}

	public String getOdreNum() {
		return odreNum;
	}

	public void setOdreNum(String odreNum) {
		this.odreNum = odreNum;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public Float getOrderPrice() {
		return orderPrice;
	}

	public void setOrderPrice(Float orderPrice) {
		this.orderPrice = orderPrice;
	}

	public Integer getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderRemark() {
		return orderRemark;
	}

	public void setOrderRemark(String orderRemark) {
		this.orderRemark = orderRemark;
	}

	public Set<MSnapshotorder> getMSnapshotorders() {
		return MSnapshotorders;
	}

	public void setMSnapshotorders(Set<MSnapshotorder> mSnapshotorders) {
		MSnapshotorders = mSnapshotorders;
	}
    



}