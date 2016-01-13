package com.market.entity;

/**
 * MImage entity. @author MyEclipse Persistence Tools
 */

public class MImage implements java.io.Serializable {

	// Fields

	private Integer imageId;
	private MGoods MGoods;
	private String imageSrc;
	private Integer storeId;

	// Constructors

	/** default constructor */
	public MImage() {
	}

	/** minimal constructor */
	public MImage(String imageSrc) {
		this.imageSrc = imageSrc;
	}

	/** full constructor */
	public MImage(MGoods MGoods, String imageSrc, Integer storeId) {
		this.MGoods = MGoods;
		this.imageSrc = imageSrc;
		this.storeId = storeId;
	}

	// Property accessors

	public Integer getImageId() {
		return this.imageId;
	}

	public void setImageId(Integer imageId) {
		this.imageId = imageId;
	}

	public MGoods getMGoods() {
		return this.MGoods;
	}

	public void setMGoods(MGoods MGoods) {
		this.MGoods = MGoods;
	}

	public String getImageSrc() {
		return this.imageSrc;
	}

	public void setImageSrc(String imageSrc) {
		this.imageSrc = imageSrc;
	}

	public Integer getStoreId() {
		return this.storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

}