package com.market.entity;

import java.util.HashSet;
import java.util.Set;


/**
 * 商品实体类
 * @author Administrator
 *
 */

public class MGoods  implements java.io.Serializable {


    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Fields    

     private Integer goodsId;
     private String goodsName;        //商品名称
     private String goodsRemark;      // 商品描述
     private Float goodsPrice;     	  //商品价格
     private MGoodsType goodsType;  //商品类型
     private String priImageSrc;    //预览图地址
     private String goodsDetail;     //商品详情（富文本编辑器）
     private Integer status;         //商品状态   0：上架 、-1：下架（删除）、1：草稿、2：售空
     private Set<MSnapshotorder> MSnapshotorders = new HashSet<MSnapshotorder>(0);  //商品快照集合
     private Set<MCollectiongoods> MCollectiongoodses = new HashSet<MCollectiongoods>(0);  //收藏商品集合
     private Set<MImage> MImages = new HashSet<MImage>(0);  //商品照片集合
     private Set<MGoodsProperty> MGoodsProperties = new HashSet<MGoodsProperty>(0);    // 商品属性集合
     private Set<MFormatGoods> MFormatGoodses = new HashSet<MFormatGoods>(0);    // 商品规格集合
     private Set<MShopcar> MShopcars = new HashSet<MShopcar>(0);      //购物车集合
     private Set<MRejected> MRejecteds = new HashSet<MRejected>(0);    //退货换货单


    // Constructors

    /** default constructor */
    public MGoods() {
    }

	/** minimal constructor */
    public MGoods(Integer goodsId, String goodsName, String goodsRemark, Float goodsPrice, Integer status) {
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.goodsRemark = goodsRemark;
        this.goodsPrice = goodsPrice;
        this.status = status;
    }

	public Integer getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsRemark() {
		return goodsRemark;
	}

	public void setGoodsRemark(String goodsRemark) {
		this.goodsRemark = goodsRemark;
	}

	public Float getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsPrice(Float goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public MGoodsType getGoodsType() {
		return goodsType;
	}

	public void setGoodsType(MGoodsType goodsType) {
		this.goodsType = goodsType;
	}

	public String getPriImageSrc() {
		return priImageSrc;
	}

	public void setPriImageSrc(String priImageSrc) {
		this.priImageSrc = priImageSrc;
	}

	public String getGoodsDetail() {
		return goodsDetail;
	}

	public void setGoodsDetail(String goodsDetail) {
		this.goodsDetail = goodsDetail;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Set<MSnapshotorder> getMSnapshotorders() {
		return MSnapshotorders;
	}

	public void setMSnapshotorders(Set<MSnapshotorder> mSnapshotorders) {
		MSnapshotorders = mSnapshotorders;
	}

	public Set<MCollectiongoods> getMCollectiongoodses() {
		return MCollectiongoodses;
	}

	public void setMCollectiongoodses(Set<MCollectiongoods> mCollectiongoodses) {
		MCollectiongoodses = mCollectiongoodses;
	}

	public Set<MImage> getMImages() {
		return MImages;
	}

	public void setMImages(Set<MImage> mImages) {
		MImages = mImages;
	}

	public Set<MGoodsProperty> getMGoodsProperties() {
		return MGoodsProperties;
	}

	public void setMGoodsProperties(Set<MGoodsProperty> mGoodsProperties) {
		MGoodsProperties = mGoodsProperties;
	}

	public Set<MFormatGoods> getMFormatGoodses() {
		return MFormatGoodses;
	}

	public void setMFormatGoodses(Set<MFormatGoods> mFormatGoodses) {
		MFormatGoodses = mFormatGoodses;
	}

	public Set<MShopcar> getMShopcars() {
		return MShopcars;
	}

	public void setMShopcars(Set<MShopcar> mShopcars) {
		MShopcars = mShopcars;
	}

	public Set<MRejected> getMRejecteds() {
		return MRejecteds;
	}

	public void setMRejecteds(Set<MRejected> mRejecteds) {
		MRejecteds = mRejecteds;
	}
    
 
   
    
}