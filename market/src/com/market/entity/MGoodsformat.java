package com.market.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * MGoodsformat entity. @author MyEclipse Persistence Tools
 */

public class MGoodsformat implements java.io.Serializable {

	// Fields

	private Integer formatId;
	private String formatName;
	private Float goodsPrice;
	private Set<MSnapshotorder> MSnapshotorders = new HashSet(0);
	private Set MFormatGoodses = new HashSet(0);

	// Constructors

	/** default constructor */
	public MGoodsformat() {
	}

	/** minimal constructor */
	public MGoodsformat(String formatName, Float goodsPrice) {
		this.formatName = formatName;
		this.goodsPrice = goodsPrice;
	}

	/** full constructor */
	public MGoodsformat(String formatName, Float goodsPrice,
			Set MSnapshotorders, Set MFormatGoodses) {
		this.formatName = formatName;
		this.goodsPrice = goodsPrice;
		this.MSnapshotorders = MSnapshotorders;
		this.MFormatGoodses = MFormatGoodses;
	}

	// Property accessors

	public Integer getFormatId() {
		return this.formatId;
	}

	public void setFormatId(Integer formatId) {
		this.formatId = formatId;
	}

	public String getFormatName() {
		return this.formatName;
	}

	public void setFormatName(String formatName) {
		this.formatName = formatName;
	}

	public Float getGoodsPrice() {
		return this.goodsPrice;
	}

	public void setGoodsPrice(Float goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public Set getMSnapshotorders() {
		return this.MSnapshotorders;
	}

	public void setMSnapshotorders(Set MSnapshotorders) {
		this.MSnapshotorders = MSnapshotorders;
	}

	public Set getMFormatGoodses() {
		return this.MFormatGoodses;
	}

	public void setMFormatGoodses(Set MFormatGoodses) {
		this.MFormatGoodses = MFormatGoodses;
	}

}