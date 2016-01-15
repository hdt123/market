package com.market.entity;

import java.util.HashSet;
import java.util.Set;


/**
 * MStore entity. @author MyEclipse Persistence Tools
 */

public class MStore  implements java.io.Serializable {


    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Fields    

     private Integer storeId;
     private Set<MCollectiongoods> MCollectionstores = new HashSet<MCollectiongoods>(0);


    // Constructors

    /** default constructor */
    public MStore() {
    }

	/** minimal constructor */
    public MStore(Integer storeId) {
        this.storeId = storeId;
    }

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public Set<MCollectiongoods> getMCollectionstores() {
		return MCollectionstores;
	}

	public void setMCollectionstores(Set<MCollectiongoods> mCollectionstores) {
		MCollectionstores = mCollectionstores;
	}
  







}