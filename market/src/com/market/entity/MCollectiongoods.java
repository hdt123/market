package com.market.entity;



/**
 * �ղ���Ʒʵ����
 * @author ������
 *
 */

public class MCollectiongoods  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer collectionGoodsId;      
     private MGoods MGoods;             //�ղص���Ʒ
     private MMember MMember;           //�ղػ�Ա
     private String collectDate;        //�ղ�����
     private String collectionGoodsDesc;      //�ղر�ע


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