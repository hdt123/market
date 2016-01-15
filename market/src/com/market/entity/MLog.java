package com.market.entity;



/**
 * »’÷æ¿‡
 * @author Administrator
 *
 */

public class MLog  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer logId;
     private MManager MManager;
     private String logOperate;
     private String operateDate;


    // Constructors

    /** default constructor */
    public MLog() {
    }

    
    /** full constructor */
    public MLog(Integer logId, MManager MManager, String logOperate, String operateDate) {
        this.logId = logId;
        this.MManager = MManager;
        this.logOperate = logOperate;
        this.operateDate = operateDate;
    }

   
    // Property accessors

    public Integer getLogId() {
        return this.logId;
    }
    
    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public MManager getMManager() {
        return this.MManager;
    }
    
    public void setMManager(MManager MManager) {
        this.MManager = MManager;
    }

    public String getLogOperate() {
        return this.logOperate;
    }
    
    public void setLogOperate(String logOperate) {
        this.logOperate = logOperate;
    }

    public String getOperateDate() {
        return this.operateDate;
    }
    
    public void setOperateDate(String operateDate) {
        this.operateDate = operateDate;
    }
   








}