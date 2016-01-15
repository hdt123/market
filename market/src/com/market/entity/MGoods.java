package com.market.entity;

import java.util.HashSet;
import java.util.Set;


/**
 * MGoods entity. @author MyEclipse Persistence Tools
 */

public class MGoods  implements java.io.Serializable {


    // Fields    

     private Integer goodsId;
     private String goodsName;
     private String goodsRemark;
     private Float goodsPrice;
     private Integer goodsType;
     private String priImageSrc;
     private String goodsDetail;
     private Integer status;
     private Set MSnapshotorders = new HashSet(0);
     private Set MCollectiongoodses = new HashSet(0);
     private Set MImages = new HashSet(0);
     private Set MGoodsProperties = new HashSet(0);
     private Set MFormatGoodses = new HashSet(0);
     private Set MShopcars = new HashSet(0);
     private Set MRejecteds = new HashSet(0);


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
    
    /** full constructor */
    public MGoods(Integer goodsId, String goodsName, String goodsRemark, Float goodsPrice, Integer goodsType, String priImageSrc, String goodsDetail, Integer status, Set MSnapshotorders, Set MCollectiongoodses, Set MImages, Set MGoodsProperties, Set MFormatGoodses, Set MShopcars, Set MRejecteds) {
        this.goodsId = goodsId;
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
        this.MGoodsProperties = MGoodsProperties;
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

    public Set getMGoodsProperties() {
        return this.MGoodsProperties;
    }
    
    public void setMGoodsProperties(Set MGoodsProperties) {
        this.MGoodsProperties = MGoodsProperties;
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