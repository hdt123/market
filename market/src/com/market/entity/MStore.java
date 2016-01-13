package com.market.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * MStore entity. @author MyEclipse Persistence Tools
 */

public class MStore implements java.io.Serializable {

	// Fields

	private Integer storeId;
	private Set MCollectionstores = new HashSet(0);

	// Constructors

	/** default constructor */
	public MStore() {
	}

	/** full constructor */
	public MStore(Set MCollectionstores) {
		this.MCollectionstores = MCollectionstores;
	}

	// Property accessors

	public Integer getStoreId() {
		return this.storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public Set getMCollectionstores() {
		return this.MCollectionstores;
	}

	public void setMCollectionstores(Set MCollectionstores) {
		this.MCollectionstores = MCollectionstores;
	}

}