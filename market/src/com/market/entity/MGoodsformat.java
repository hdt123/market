package com.market.entity;

import java.util.HashSet;
import java.util.Set;


/**
 * ��Ʒ������ʵ����
 * @author ������
 *
 */

public class MGoodsformat  implements java.io.Serializable {


    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Fields    

     private Integer formatId;
     private MFormatGoods MFormatGoods;   //��Ʒ
     private String formatName;			  //����������
     private Float goodsPrice;			  //�ù��ļ۸�
     private Set<MShopcar> MShopcars = new HashSet<MShopcar>(0);   //���ﳵ����
     private Set<MSnapshotorder> MSnapshotorders = new HashSet<MSnapshotorder>(0);   //��Ʒ���ռ���


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

	public Integer getFormatId() {
		return formatId;
	}

	public void setFormatId(Integer formatId) {
		this.formatId = formatId;
	}

	public MFormatGoods getMFormatGoods() {
		return MFormatGoods;
	}

	public void setMFormatGoods(MFormatGoods mFormatGoods) {
		MFormatGoods = mFormatGoods;
	}

	public String getFormatName() {
		return formatName;
	}

	public void setFormatName(String formatName) {
		this.formatName = formatName;
	}

	public Float getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsPrice(Float goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public Set<MShopcar> getMShopcars() {
		return MShopcars;
	}

	public void setMShopcars(Set<MShopcar> mShopcars) {
		MShopcars = mShopcars;
	}

	public Set<MSnapshotorder> getMSnapshotorders() {
		return MSnapshotorders;
	}

	public void setMSnapshotorders(Set<MSnapshotorder> mSnapshotorders) {
		MSnapshotorders = mSnapshotorders;
	}
    


}