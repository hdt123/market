package com.market.entity;



/**
 * ��Ʒ����
 * @author Administrator
 *
 */

public class MGoodsProperty  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer propertyId;    
     private MGoods MGoods;       //��Ʒ
     private String propertyName;   //���Լ�
     private String propertyValue;  //����ֵ


    // Constructors

    /** default constructor */
    public MGoodsProperty() {
    }

    
    /** full constructor */
    public MGoodsProperty(Integer propertyId, MGoods MGoods, String propertyName, String propertyValue) {
        this.propertyId = propertyId;
        this.MGoods = MGoods;
        this.propertyName = propertyName;
        this.propertyValue = propertyValue;
    }

   
    // Property accessors

    public Integer getPropertyId() {
        return this.propertyId;
    }
    
    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }

    public MGoods getMGoods() {
        return this.MGoods;
    }
    
    public void setMGoods(MGoods MGoods) {
        this.MGoods = MGoods;
    }

    public String getPropertyName() {
        return this.propertyName;
    }
    
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getPropertyValue() {
        return this.propertyValue;
    }
    
    public void setPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue;
    }
   








}