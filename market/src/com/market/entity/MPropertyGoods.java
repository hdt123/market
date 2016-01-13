package com.market.entity;

/**
 * MPropertyGoods entity. @author MyEclipse Persistence Tools
 */

public class MPropertyGoods implements java.io.Serializable {

	// Fields

	private Integer id;
	private MGoods MGoods;
	private MGoodsproperty MGoodsproperty;
	private String propertyName;

	// Constructors

	/** default constructor */
	public MPropertyGoods() {
	}

	/** full constructor */
	public MPropertyGoods(MGoods MGoods, MGoodsproperty MGoodsproperty,
			String propertyName) {
		this.MGoods = MGoods;
		this.MGoodsproperty = MGoodsproperty;
		this.propertyName = propertyName;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public MGoods getMGoods() {
		return this.MGoods;
	}

	public void setMGoods(MGoods MGoods) {
		this.MGoods = MGoods;
	}

	public MGoodsproperty getMGoodsproperty() {
		return this.MGoodsproperty;
	}

	public void setMGoodsproperty(MGoodsproperty MGoodsproperty) {
		this.MGoodsproperty = MGoodsproperty;
	}

	public String getPropertyName() {
		return this.propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

}