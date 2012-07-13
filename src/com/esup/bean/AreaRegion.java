package com.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_area_region")
@PK({"shippingAreaId" ,"regionId"})
public class AreaRegion {

	/**
	 * 
	 */
	@Column("shipping_area_id")
	private Integer shippingAreaId;
	/**
	 * 
	 */
	@Column("region_id")
	private Integer regionId;
	
	public Integer getShippingAreaId() {
		return shippingAreaId;
	}
	public void setShippingAreaId(Integer shippingAreaId) {
		this.shippingAreaId = shippingAreaId;
	}
	public Integer getRegionId() {
		return regionId;
	}
	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
	}
	
}