package com.market.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author Administrator
 *  ��Ʒ�������
 *  �����Ʒ��Ӧһ���������
 *  һ��������ƶ�Ӧ������
 */

public class MFormatGoods implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private MGoods MGoods;     //��Ʒ
	private Set<MGoodsformat> MGoodsformats = new HashSet<MGoodsformat>();   //����
	private String formatName;    //�������

	// Constructors

	/** default constructor */
	public MFormatGoods() {
	}

	/** full constructor */
	public MFormatGoods(MGoods MGoods, Set<MGoodsformat> MGoodsformats,
			String formatName) {
		this.MGoods = MGoods;
		this.MGoodsformats = MGoodsformats;
		this.formatName = formatName;
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

	

	public Set<MGoodsformat> getMGoodsformats() {
		return MGoodsformats;
	}

	public void setMGoodsformats(Set<MGoodsformat> mGoodsformats) {
		MGoodsformats = mGoodsformats;
	}

	public String getFormatName() {
		return this.formatName;
	}

	public void setFormatName(String formatName) {
		this.formatName = formatName;
	}

}