package com.market.entity;

/**
 * 
 * @author ������
 *   �ղ���Ʒentity
 */

public class MCollectiongoods implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Fields

	private Integer collectionGoodsId;   //���� 
	private MGoods MGoods;     //�ղص���Ʒ
	private MMember MMember;	//��Ա
	private String collectDate;  //�ղ�����
	private String collectionGoodsDesc;  //��ע

	// Constructors

	/** default constructor */
	public MCollectiongoods() {
	}

	/** minimal constructor */
	public MCollectiongoods(MGoods MGoods, MMember MMember, String collectDate) {
		this.MGoods = MGoods;
		this.MMember = MMember;
		this.collectDate = collectDate;
	}

	/** full constructor */
	public MCollectiongoods(MGoods MGoods, MMember MMember, String collectDate,
			String collectionGoodsDesc) {
		this.MGoods = MGoods;
		this.MMember = MMember;
		this.collectDate = collectDate;
		this.collectionGoodsDesc = collectionGoodsDesc;
	}


	public MGoods getMGoods() {
		return this.MGoods;
	}

	public Integer getCollectionGoodsId() {
		return collectionGoodsId;
	}

	public void setCollectionGoodsId(Integer collectionGoodsId) {
		this.collectionGoodsId = collectionGoodsId;
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