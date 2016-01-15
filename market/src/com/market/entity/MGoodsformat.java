package com.market.entity;

import java.util.HashSet;
import java.util.Set;


/**
 * 商品子属性实体类
 * @author 胡铎腾
 *
 */

public class MGoodsformat  implements java.io.Serializable {


    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Fields    

     private Integer formatId;
     private MFormatGoods MFormatGoods;   //商品
     private String formatName;			  //子属性名称
     private Float goodsPrice;			  //该规格的价格
     private Set<MShopcar> MShopcars = new HashSet<MShopcar>(0);   //购物车集合
     private Set<MSnapshotorder> MSnapshotorders = new HashSet<MSnapshotorder>(0);   //商品快照集合


    // Constructors

    /** default constructor */
    public MGoodsformat() {
    }

	/** minimal constructor */
    public MGoodsformat(Integer formatId, MFormatGoods MFormatGoods, String formatName, Float goodsPrice) {
        this.formatId = formatId;
        this.MFormatGoods = MFormatGoods;
        this.formatName = formatName;
        this.goodsPrice = goodsPrice;
    }

	public Integer getFormatId() {
		return formatId;
	}

	public void setFormatId(Integer formatId) {
		this.formatId = formatId;
	}

	public MFormatGoods getMFormatGoods() {
		return MFormatGoods;
	}

	public void setMFormatGoods(MFormatGoods mFormatGoods) {
		MFormatGoods = mFormatGoods;
	}

	public String getFormatName() {
		return formatName;
	}

	public void setFormatName(String formatName) {
		this.formatName = formatName;
	}

	public Float getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsPrice(Float goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public Set<MShopcar> getMShopcars() {
		return MShopcars;
	}

	public void setMShopcars(Set<MShopcar> mShopcars) {
		MShopcars = mShopcars;
	}

	public Set<MSnapshotorder> getMSnapshotorders() {
		return MSnapshotorders;
	}

	public void setMSnapshotorders(Set<MSnapshotorder> mSnapshotorders) {
		MSnapshotorders = mSnapshotorders;
	}
    


}