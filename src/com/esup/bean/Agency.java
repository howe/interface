package com.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_agency")
@PK({"agencyId"})
public class Agency {

	/**
	 * 
	 */
	@Column("agency_id")
	private Integer agencyId;
	/**
	 * 
	 */
	@Column("agency_name")
	private String agencyName;
	/**
	 * 
	 */
	@Column("agency_desc")
	private String agencyDesc;
	
	public Integer getAgencyId() {
		return agencyId;
	}
	public void setAgencyId(Integer agencyId) {
		this.agencyId = agencyId;
	}
	public String getAgencyName() {
		return agencyName;
	}
	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}
	public String getAgencyDesc() {
		return agencyDesc;
	}
	public void setAgencyDesc(String agencyDesc) {
		this.agencyDesc = agencyDesc;
	}
	
}