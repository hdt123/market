package com.market.entity;

import java.util.HashSet;
import java.util.Set;


/**
 * ��Ʒ��񸸼�ʵ����
 * @author ������
 *
 */

public class MFormatGoods  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
     private MGoods MGoods;               //����Ӧ��Ʒ
     private String formatName;          //��񸸼�����
     private Set<MGoodsformat> MGoodsformats = new HashSet<MGoodsformat>(0);    //�ø�����������Ӧ���������Լ��ϣ��磺������������ɫ������������Ǻ�ɫ����ɫ��


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