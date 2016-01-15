package com.market.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


/**
 * 商品类型
 * @author 胡铎腾
 *
 */
public class MGoodsType implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer typeId;
	
	private String typeName;
	
	private Set<MGoods> MGoodses = new HashSet<MGoods>();

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public Set<MGoods> getMGoodses() {
		return MGoodses;
	}

	public void setMGoodses(Set<MGoods> mGoodses) {
		MGoodses = mGoodses;
	}
	
	
	
}
