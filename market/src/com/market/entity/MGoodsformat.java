package com.market.entity;

import java.util.HashSet;
import java.util.Set;


/**
 * MGoodsformat entity. @author MyEclipse Persistence Tools
 */

public class MGoodsformat  implements java.io.Serializable {


    // Fields    

     private Integer formatId;
     private MFormatGoods MFormatGoods;
     private String formatName;
     private Float goodsPrice;
     private Set MShopcars = new HashSet(0);
     private Set MSnapshotorders = new HashSet(0);


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
    
    /** full constructor */
    public MGoodsformat(Integer formatId, MFormatGoods MFormatGoods, String formatName, Float goodsPrice, Set MShopcars, Set MSnapshotorders) {
        this.formatId = formatId;
        this.MFormatGoods = MFormatGoods;
        this.formatName = formatName;
        this.goodsPrice = goodsPrice;
        this.MShopcars = MShopcars;
        this.MSnapshotorders = MSnapshotorders;
    }

   
    // Property accessors

    public Integer getFormatId() {
        return this.formatId;
    }
    
    public void setFormatId(Integer formatId) {
        this.formatId = formatId;
    }

    public MFormatGoods getMFormatGoods() {
        return this.MFormatGoods;
    }
    
    public void setMFormatGoods(MFormatGoods MFormatGoods) {
        this.MFormatGoods = MFormatGoods;
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

    public Set getMShopcars() {
        return this.MShopcars;
    }
    
    public void setMShopcars(Set MShopcars) {
        this.MShopcars = MShopcars;
    }

    public Set getMSnapshotorders() {
        return this.MSnapshotorders;
    }
    
    public void setMSnapshotorders(Set MSnapshotorders) {
        this.MSnapshotorders = MSnapshotorders;
    }
   








}