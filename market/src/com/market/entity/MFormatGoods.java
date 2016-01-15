package com.market.entity;

import java.util.HashSet;
import java.util.Set;


/**
 * MFormatGoods entity. @author MyEclipse Persistence Tools
 */

public class MFormatGoods  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private MGoods MGoods;
     private String formatName;
     private Set MGoodsformats = new HashSet(0);


    // Constructors

    /** default constructor */
    public MFormatGoods() {
    }

	/** minimal constructor */
    public MFormatGoods(Integer id, MGoods MGoods, String formatName) {
        this.id = id;
        this.MGoods = MGoods;
        this.formatName = formatName;
    }
    
    /** full constructor */
    public MFormatGoods(Integer id, MGoods MGoods, String formatName, Set MGoodsformats) {
        this.id = id;
        this.MGoods = MGoods;
        this.formatName = formatName;
        this.MGoodsformats = MGoodsformats;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public MGoods getMGoods() {
        return this.MGoods;
    }
    
    public void setMGoods(MGoods MGoods) {
        this.MGoods = MGoods;
    }

    public String getFormatName() {
        return this.formatName;
    }
    
    public void setFormatName(String formatName) {
        this.formatName = formatName;
    }

    public Set getMGoodsformats() {
        return this.MGoodsformats;
    }
    
    public void setMGoodsformats(Set MGoodsformats) {
        this.MGoodsformats = MGoodsformats;
    }
   








}