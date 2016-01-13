package com.market.entity;

/**
 * MCollectionstore entity. @author MyEclipse Persistence Tools
 */

public class MCollectionstore implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer collectionGoods;
	private MStore MStore;
	private MMember MMember;
	private String collectDate;
	private String collectionGoodsDesc;

	// Constructors

	/** default constructor */
	public MCollectionstore() {
	}

	/** minimal constructor */
	public MCollectionstore(MStore MStore, MMember MMember, String collectDate) {
		this.MStore = MStore;
		this.MMember = MMember;
		this.collectDate = collectDate;
	}

	/** full constructor */
	public MCollectionstore(MStore MStore, MMember MMember, String collectDate,
			String collectionGoodsDesc) {
		this.MStore = MStore;
		this.MMember = MMember;
		this.collectDate = collectDate;
		this.collectionGoodsDesc = collectionGoodsDesc;
	}

	// Property accessors

	public Integer getCollectionGoods() {
		return this.collectionGoods;
	}

	public void setCollectionGoods(Integer collectionGoods) {
		this.collectionGoods = collectionGoods;
	}

	public MStore getMStore() {
		return this.MStore;
	}

	public void setMStore(MStore MStore) {
		this.MStore = MStore;
	}

	public MMember getMMember() {
		return this.MMember;
	}

	public void setMMember(MMember MMember) {
		this.MMember = MMember;
	}

	public String getCollectDate() {
		return this.collectDate;
	}

	public void setCollectDate(String collectDate) {
		this.collectDate = collectDate;
	}

	public String getCollectionGoodsDesc() {
		return this.collectionGoodsDesc;
	}

	public void setCollectionGoodsDesc(String collectionGoodsDesc) {
		this.collectionGoodsDesc = collectionGoodsDesc;
	}

}