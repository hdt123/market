package com.market.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * MGoodsproperty entity. @author MyEclipse Persistence Tools
 */

public class MGoodsproperty implements java.io.Serializable {

	// Fields

	private Integer propertyId;
	private String propertyName;
	private Set MSnapshotorders = new HashSet(0);
	private Set MPropertyGoodses = new HashSet(0);

	// Constructors

	/** default constructor */
	public MGoodsproperty() {
	}

	/** minimal constructor */
	public MGoodsproperty(String propertyName) {
		this.propertyName = propertyName;
	}

	/** full constructor */
	public MGoodsproperty(String propertyName, Set MSnapshotorders,
			Set MPropertyGoodses) {
		this.propertyName = propertyName;
		this.MSnapshotorders = MSnapshotorders;
		this.MPropertyGoodses = MPropertyGoodses;
	}

	// Property accessors

	public Integer getPropertyId() {
		return this.propertyId;
	}

	public void setPropertyId(Integer propertyId) {
		this.propertyId = propertyId;
	}

	public String getPropertyName() {
		return this.propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public Set getMSnapshotorders() {
		return this.MSnapshotorders;
	}

	public void setMSnapshotorders(Set MSnapshotorders) {
		this.MSnapshotorders = MSnapshotorders;
	}

	public Set getMPropertyGoodses() {
		return this.MPropertyGoodses;
	}

	public void setMPropertyGoodses(Set MPropertyGoodses) {
		this.MPropertyGoodses = MPropertyGoodses;
	}

}