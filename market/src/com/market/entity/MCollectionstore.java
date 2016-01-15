package com.market.entity;



/**
 * MCollectionstore entity. @author MyEclipse Persistence Tools
 */

public class MCollectionstore  implements java.io.Serializable {


    // Fields    

     private Integer collectionStoreId;
     private MStore MStore;
     private MMember MMember;
     private String collectDate;
     private String collectionStoreDesc;


    // Constructors

    /** default constructor */
    public MCollectionstore() {
    }

	/** minimal constructor */
    public MCollectionstore(Integer collectionStoreId, MStore MStore, MMember MMember, String collectDate) {
        this.collectionStoreId = collectionStoreId;
        this.MStore = MStore;
        this.MMember = MMember;
        this.collectDate = collectDate;
    }
    
    /** full constructor */
    public MCollectionstore(Integer collectionStoreId, MStore MStore, MMember MMember, String collectDate, String collectionStoreDesc) {
        this.collectionStoreId = collectionStoreId;
        this.MStore = MStore;
        this.MMember = MMember;
        this.collectDate = collectDate;
        this.collectionStoreDesc = collectionStoreDesc;
    }

   
    // Property accessors

    public Integer getCollectionStoreId() {
        return this.collectionStoreId;
    }
    
    public void setCollectionStoreId(Integer collectionStoreId) {
        this.collectionStoreId = collectionStoreId;
    }

    public MStore getMStore() {
        return this.MStore;
    }
    
    public void setMStore(MStore MStore) {
        this.MStore = MStore;
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

    public String getCollectionStoreDesc() {
        return this.collectionStoreDesc;
    }
    
    public void setCollectionStoreDesc(String collectionStoreDesc) {
        this.collectionStoreDesc = collectionStoreDesc;
    }
   








}