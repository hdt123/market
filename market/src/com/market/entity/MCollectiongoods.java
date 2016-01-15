package com.market.entity;



/**
 * MCollectiongoods entity. @author MyEclipse Persistence Tools
 */

public class MCollectiongoods  implements java.io.Serializable {


    // Fields    

     private Integer collectionGoodsId;
     private MGoods MGoods;
     private MMember MMember;
     private String collectDate;
     private String collectionGoodsDesc;


    // Constructors

    /** default constructor */
    public MCollectiongoods() {
    }

	/** minimal constructor */
    public MCollectiongoods(Integer collectionGoodsId, MGoods MGoods, MMember MMember, String collectDate) {
        this.collectionGoodsId = collectionGoodsId;
        this.MGoods = MGoods;
        this.MMember = MMember;
        this.collectDate = collectDate;
    }
    
    /** full constructor */
    public MCollectiongoods(Integer collectionGoodsId, MGoods MGoods, MMember MMember, String collectDate, String collectionGoodsDesc) {
        this.collectionGoodsId = collectionGoodsId;
        this.MGoods = MGoods;
        this.MMember = MMember;
        this.collectDate = collectDate;
        this.collectionGoodsDesc = collectionGoodsDesc;
    }

   
    // Property accessors

    public Integer getCollectionGoodsId() {
        return this.collectionGoodsId;
    }
    
    public void setCollectionGoodsId(Integer collectionGoodsId) {
        this.collectionGoodsId = collectionGoodsId;
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