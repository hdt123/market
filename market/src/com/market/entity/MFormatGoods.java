package com.market.entity;

import java.util.HashSet;
import java.util.Set;


/**
 * 商品规格父级实体类
 * @author 胡铎腾
 *
 */

public class MFormatGoods  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
     private MGoods MGoods;               //规格对应商品
     private String formatName;          //规格父级名称
     private Set<MGoodsformat> MGoodsformats = new HashSet<MGoodsformat>(0);    //该父级属性所对应的子类属性集合，如：父级属性是颜色，则子类可以是红色，绿色等


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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public MGoods getMGoods() {
		return MGoods;
	}

	public void setMGoods(MGoods mGoods) {
		MGoods = mGoods;
	}

	public String getFormatName() {
		return formatName;
	}

	public void setFormatName(String formatName) {
		this.formatName = formatName;
	}

	public Set<MGoodsformat> getMGoodsformats() {
		return MGoodsformats;
	}

	public void setMGoodsformats(Set<MGoodsformat> mGoodsformats) {
		MGoodsformats = mGoodsformats;
	}
    
  
   
    // Property accessors

  


}