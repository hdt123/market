package com.market.entity;

/**
 * 
 * @author 胡铎腾
 *   收藏商品entity
 */

public class MCollectiongoods implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Fields

	private Integer collectionGoodsId;   //主键 
	private MGoods MGoods;     //收藏的商品
	private MMember MMember;	//会员
	private String collectDate;  //收藏日期
	private String collectionGoodsDesc;  //备注

	// Constructors

	/** default constructor */
	public MCollectiongoods() {
	}

	/** minimal constructor */
	public MCollectiongoods(MGoods MGoods, MMember MMember, String collectDate) {
		this.MGoods = MGoods;
		this.MMember = MMember;
		this.collectDate = collectDate;
	}

	/** full constructor */
	public MCollectiongoods(MGoods MGoods, MMember MMember, String collectDate,
			String collectionGoodsDesc) {
		this.MGoods = MGoods;
		this.MMember = MMember;
		this.collectDate = collectDate;
		this.collectionGoodsDesc = collectionGoodsDesc;
	}


	public MGoods getMGoods() {
		return this.MGoods;
	}

	public Integer getCollectionGoodsId() {
		return collectionGoodsId;
	}

	public void setCollectionGoodsId(Integer collectionGoodsId) {
		this.collectionGoodsId = collectionGoodsId;
	}

	public void setMGoods(MGoods MGoods) {
		this.MGoods = MGoods;
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