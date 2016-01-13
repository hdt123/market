package com.market.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * MGoods entity. @author MyEclipse Persistence Tools
 */

public class MGoods implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer goodsId;
	private String goodsName;
	private String goodsRemark;
	private Float goodsPrice;
	private Integer goodsType;
	private String priImageSrc;
	private String goodsDetail;
	private Integer status;
	private Set<MSnapshotorder> MSnapshotorders = new HashSet<MSnapshotorder>(0);
	private Set<MCollectiongoods> MCollectiongoodses = new HashSet<MCollectiongoods>(0);
	private Set<MImage> MImages = new HashSet<MImage>(0);
	private Set<MPropertyGoods> MPropertyGoodses = new HashSet<MPropertyGoods>(0);
	private Set<MFormatGoods> MFormatGoodses = new HashSet<MFormatGoods>(0);
	private Set<MShopcar> MShopcars = new HashSet<MShopcar>(0);
	private Set<MRejected> MRejecteds = new HashSet<MRejected>(0);

	// Constructors

	/** default constructor */
	public MGoods() {
	}

	/** minimal constructor */
	public MGoods(String goodsName, String goodsRemark, Float goodsPrice,
			Integer status) {
		this.goodsName = goodsName;
		this.goodsRemark = goodsRemark;
		this.goodsPrice = goodsPrice;
		this.status = status;
	}

	/** full constructor */
	public MGoods(String goodsName, String goodsRemark, Float goodsPrice,
			Integer goodsType, String priImageSrc, String goodsDetail,
			Integer status, Set MSnapshotorders, Set MCollectiongoodses,
			Set MImages, Set MPropertyGoodses, Set MFormatGoodses,
			Set MShopcars, Set MRejecteds) {
		this.goodsName = goodsName;
		this.goodsRemark = goodsRemark;
		this.goodsPrice = goodsPrice;
		this.goodsType = goodsType;
		this.priImageSrc = priImageSrc;
		this.goodsDetail = goodsDetail;
		this.status = status;
		this.MSnapshotorders = MSnapshotorders;
		this.MCollectiongoodses = MCollectiongoodses;
		this.MImages = MImages;
		this.MPropertyGoodses = MPropertyGoodses;
		this.MFormatGoodses = MFormatGoodses;
		this.MShopcars = MShopcars;
		this.MRejecteds = MRejecteds;
	}

	// Property accessors

	public Integer getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsName() {
		return this.goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsRemark() {
		return this.goodsRemark;
	}

	public void setGoodsRemark(String goodsRemark) {
		this.goodsRemark = goodsRemark;
	}

	public Float getGoodsPrice() {
		return this.goodsPrice;
	}

	public void setGoodsPrice(Float goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public Integer getGoodsType() {
		return this.goodsType;
	}

	public void setGoodsType(Integer goodsType) {
		this.goodsType = goodsType;
	}

	public String getPriImageSrc() {
		return this.priImageSrc;
	}

	public void setPriImageSrc(String priImageSrc) {
		this.priImageSrc = priImageSrc;
	}

	public String getGoodsDetail() {
		return this.goodsDetail;
	}

	public void setGoodsDetail(String goodsDetail) {
		this.goodsDetail = goodsDetail;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Set getMSnapshotorders() {
		return this.MSnapshotorders;
	}

	public void setMSnapshotorders(Set MSnapshotorders) {
		this.MSnapshotorders = MSnapshotorders;
	}

	public Set getMCollectiongoodses() {
		return this.MCollectiongoodses;
	}

	public void setMCollectiongoodses(Set MCollectiongoodses) {
		this.MCollectiongoodses = MCollectiongoodses;
	}

	public Set getMImages() {
		return this.MImages;
	}

	public void setMImages(Set MImages) {
		this.MImages = MImages;
	}

	public Set getMPropertyGoodses() {
		return this.MPropertyGoodses;
	}

	public void setMPropertyGoodses(Set MPropertyGoodses) {
		this.MPropertyGoodses = MPropertyGoodses;
	}

	public Set getMFormatGoodses() {
		return this.MFormatGoodses;
	}

	public void setMFormatGoodses(Set MFormatGoodses) {
		this.MFormatGoodses = MFormatGoodses;
	}

	public Set getMShopcars() {
		return this.MShopcars;
	}

	public void setMShopcars(Set MShopcars) {
		this.MShopcars = MShopcars;
	}

	public Set getMRejecteds() {
		return this.MRejecteds;
	}

	public void setMRejecteds(Set MRejecteds) {
		this.MRejecteds = MRejecteds;
	}

}