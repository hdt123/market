package com.market.entity;



/**
 * MShopcar entity. @author MyEclipse Persistence Tools
 */

public class MShopcar  implements java.io.Serializable {


    // Fields    

     private Integer shopcarId;
     private MGoods MGoods;
     private MMember MMember;
     private MGoodsformat MGoodsformat;
     private String creataDate;
     private Integer goodsNum;
     private Float goodsPrice;
     private String shopcarRemark;


    // Constructors

    /** default constructor */
    public MShopcar() {
    }

	/** minimal constructor */
    public MShopcar(Integer shopcarId, MGoods MGoods, MMember MMember, Integer goodsNum, Float goodsPrice) {
        this.shopcarId = shopcarId;
        this.MGoods = MGoods;
        this.MMember = MMember;
        this.goodsNum = goodsNum;
        this.goodsPrice = goodsPrice;
    }
    
    /** full constructor */
    public MShopcar(Integer shopcarId, MGoods MGoods, MMember MMember, MGoodsformat MGoodsformat, String creataDate, Integer goodsNum, Float goodsPrice, String shopcarRemark) {
        this.shopcarId = shopcarId;
        this.MGoods = MGoods;
        this.MMember = MMember;
        this.MGoodsformat = MGoodsformat;
        this.creataDate = creataDate;
        this.goodsNum = goodsNum;
        this.goodsPrice = goodsPrice;
        this.shopcarRemark = shopcarRemark;
    }

   
    // Property accessors

    public Integer getShopcarId() {
        return this.shopcarId;
    }
    
    public void setShopcarId(Integer shopcarId) {
        this.shopcarId = shopcarId;
    }

    public MGoods getMGoods() {
        return this.MGoods;
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

    public MGoodsformat getMGoodsformat() {
        return this.MGoodsformat;
    }
    
    public void setMGoodsformat(MGoodsformat MGoodsformat) {
        this.MGoodsformat = MGoodsformat;
    }

    public String getCreataDate() {
        return this.creataDate;
    }
    
    public void setCreataDate(String creataDate) {
        this.creataDate = creataDate;
    }

    public Integer getGoodsNum() {
        return this.goodsNum;
    }
    
    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    public Float getGoodsPrice() {
        return this.goodsPrice;
    }
    
    public void setGoodsPrice(Float goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getShopcarRemark() {
        return this.shopcarRemark;
    }
    
    public void setShopcarRemark(String shopcarRemark) {
        this.shopcarRemark = shopcarRemark;
    }
   








}