package com.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_shipping_area")
public class ShippingArea {

	/**
	 * 
	 */
	@Column("shipping_area_id")
	private Integer shippingAreaId;
	/**
	 * 
	 */
	@Column("shipping_area_name")
	private String shippingAreaName;
	/**
	 * 
	 */
	@Column("shipping_id")
	private Integer shippingId;
	/**
	 * 
	 */
	@Column("configure")
	private String configure;
	
	public Integer getShippingAreaId() {
		return shippingAreaId;
	}
	public void setShippingAreaId(Integer shippingAreaId) {
		this.shippingAreaId = shippingAreaId;
	}
	public String getShippingAreaName() {
		return shippingAreaName;
	}
	public void setShippingAreaName(String shippingAreaName) {
		this.shippingAreaName = shippingAreaName;
	}
	public Integer getShippingId() {
		return shippingId;
	}
	public void setShippingId(Integer shippingId) {
		this.shippingId = shippingId;
	}
	public String getConfigure() {
		return configure;
	}
	public void setConfigure(String configure) {
		this.configure = configure;
	}
	
}