package com.market.entity;



/**
 * ÍË»õ»»»õµ¥
 * @author Administrator
 *
 */

public class MRejected  implements java.io.Serializable {


    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Fields    

     private Integer rejectedId;
     private MGoods MGoods;
     private MMember MMember;
     private String rejectedDate;
     private String rejectedReson;


    // Constructors

    /** default constructor */
    public MRejected() {
    }

	/** minimal constructor */
    public MRejected(Integer rejectedId, MGoods MGoods, MMember MMember, String rejectedDate) {
        this.rejectedId = rejectedId;
        this.MGoods = MGoods;
        this.MMember = MMember;
        this.rejectedDate = rejectedDate;
    }
    
    /** full constructor */
    public MRejected(Integer rejectedId, MGoods MGoods, MMember MMember, String rejectedDate, String rejectedReson) {
        this.rejectedId = rejectedId;
        this.MGoods = MGoods;
        this.MMember = MMember;
        this.rejectedDate = rejectedDate;
        this.rejectedReson = rejectedReson;
    }

   
    // Property accessors

    public Integer getRejectedId() {
        return this.rejectedId;
    }
    
    public void setRejectedId(Integer rejectedId) {
        this.rejectedId = rejectedId;
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

    public String getRejectedDate() {
        return this.rejectedDate;
    }
    
    public void setRejectedDate(String rejectedDate) {
        this.rejectedDate = rejectedDate;
    }

    public String getRejectedReson() {
        return this.rejectedReson;
    }
    
    public void setRejectedReson(String rejectedReson) {
        this.rejectedReson = rejectedReson;
    }
   








}