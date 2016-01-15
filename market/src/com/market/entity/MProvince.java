package com.market.entity;

import java.util.HashSet;
import java.util.Set;


/**
 * MProvince entity. @author MyEclipse Persistence Tools
 */

public class MProvince  implements java.io.Serializable {


    // Fields    

     private Integer id;
     private Integer code;
     private Integer parentId;
     private String name;
     private Integer level;
     private Set MAddressesForCountryId = new HashSet(0);
     private Set MAddressesForProvinceId = new HashSet(0);
     private Set MAddressesForAreaId = new HashSet(0);
     private Set MAddressesForCityId = new HashSet(0);


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
    
    /** full constructor */
    public MProvince(Integer id, Integer code, Integer parentId, String name, Integer level, Set MAddressesForCountryId, Set MAddressesForProvinceId, Set MAddressesForAreaId, Set MAddressesForCityId) {
        this.id = id;
        this.code = code;
        this.parentId = parentId;
        this.name = name;
        this.level = level;
        this.MAddressesForCountryId = MAddressesForCountryId;
        this.MAddressesForProvinceId = MAddressesForProvinceId;
        this.MAddressesForAreaId = MAddressesForAreaId;
        this.MAddressesForCityId = MAddressesForCityId;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCode() {
        return this.code;
    }
    
    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getParentId() {
        return this.parentId;
    }
    
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return this.level;
    }
    
    public void setLevel(Integer level) {
        this.level = level;
    }

    public Set getMAddressesForCountryId() {
        return this.MAddressesForCountryId;
    }
    
    public void setMAddressesForCountryId(Set MAddressesForCountryId) {
        this.MAddressesForCountryId = MAddressesForCountryId;
    }

    public Set getMAddressesForProvinceId() {
        return this.MAddressesForProvinceId;
    }
    
    public void setMAddressesForProvinceId(Set MAddressesForProvinceId) {
        this.MAddressesForProvinceId = MAddressesForProvinceId;
    }

    public Set getMAddressesForAreaId() {
        return this.MAddressesForAreaId;
    }
    
    public void setMAddressesForAreaId(Set MAddressesForAreaId) {
        this.MAddressesForAreaId = MAddressesForAreaId;
    }

    public Set getMAddressesForCityId() {
        return this.MAddressesForCityId;
    }
    
    public void setMAddressesForCityId(Set MAddressesForCityId) {
        this.MAddressesForCityId = MAddressesForCityId;
    }
   








}