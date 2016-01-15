package com.market.entity;

import java.util.HashSet;
import java.util.Set;


/**
 * MProvince entity. @author MyEclipse Persistence Tools
 */

public class MProvince implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
     private Integer code;
     private Integer parentId;
     private String name;
     private Integer level;
     private Set<MAddress> MAddressesForCountryId = new HashSet<MAddress>(0);
     private Set<MAddress> MAddressesForProvinceId = new HashSet<MAddress>(0);
     private Set<MAddress> MAddressesForAreaId = new HashSet<MAddress>(0);
     private Set<MAddress> MAddressesForCityId = new HashSet<MAddress>(0);


    // Constructors

    /** default constructor */
    public MProvince() {
    }

	/** minimal constructor */
    public MProvince(Integer id, Integer code, Integer parentId, String name, Integer level) {
        this.id = id;
        this.code = code;
        this.parentId = parentId;
        this.name = name;
        this.level = level;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Set<MAddress> getMAddressesForCountryId() {
		return MAddressesForCountryId;
	}

	public void setMAddressesForCountryId(Set<MAddress> mAddressesForCountryId) {
		MAddressesForCountryId = mAddressesForCountryId;
	}

	public Set<MAddress> getMAddressesForProvinceId() {
		return MAddressesForProvinceId;
	}

	public void setMAddressesForProvinceId(Set<MAddress> mAddressesForProvinceId) {
		MAddressesForProvinceId = mAddressesForProvinceId;
	}

	public Set<MAddress> getMAddressesForAreaId() {
		return MAddressesForAreaId;
	}

	public void setMAddressesForAreaId(Set<MAddress> mAddressesForAreaId) {
		MAddressesForAreaId = mAddressesForAreaId;
	}

	public Set<MAddress> getMAddressesForCityId() {
		return MAddressesForCityId;
	}

	public void setMAddressesForCityId(Set<MAddress> mAddressesForCityId) {
		MAddressesForCityId = mAddressesForCityId;
	}
    
  




}