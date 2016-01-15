package com.market.entity;



/**
 * MSnapshotorder entity. @author MyEclipse Persistence Tools
 */

public class MSnapshotorder  implements java.io.Serializable {


    // Fields    

     private Integer snapshotId;
     private MGoods MGoods;
     private MMember MMember;
     private MGoodsformat MGoodsformat;
     private MOrder MOrder;
     private Integer goodsNum;
     private String createDate;
     private String remark;


    // Constructors

    /** default constructor */
    public MSnapshotorder() {
    }

	/** minimal constructor */
    public MSnapshotorder(Integer snapshotId, MGoods MGoods, MMember MMember, MOrder MOrder, Integer goodsNum, String createDate) {
        this.snapshotId = snapshotId;
        this.MGoods = MGoods;
        this.MMember = MMember;
        this.MOrder = MOrder;
        this.goodsNum = goodsNum;
        this.createDate = createDate;
    }
    
    /** full constructor */
    public MSnapshotorder(Integer snapshotId, MGoods MGoods, MMember MMember, MGoodsformat MGoodsformat, MOrder MOrder, Integer goodsNum, String createDate, String remark) {
        this.snapshotId = snapshotId;
        this.MGoods = MGoods;
        this.MMember = MMember;
        this.MGoodsformat = MGoodsformat;
        this.MOrder = MOrder;
        this.goodsNum = goodsNum;
        this.createDate = createDate;
        this.remark = remark;
    }

   
    // Property accessors

    public Integer getSnapshotId() {
        return this.snapshotId;
    }
    
    public void setSnapshotId(Integer snapshotId) {
        this.snapshotId = snapshotId;
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

    public MOrder getMOrder() {
        return this.MOrder;
    }
    
    public void setMOrder(MOrder MOrder) {
        this.MOrder = MOrder;
    }

    public Integer getGoodsNum() {
        return this.goodsNum;
    }
    
    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    public String getCreateDate() {
        return this.createDate;
    }
    
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getRemark() {
        return this.remark;
    }
    
    public void setRemark(String remark) {
        this.remark = remark;
    }
   








}