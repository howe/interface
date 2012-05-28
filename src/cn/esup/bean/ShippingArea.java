package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
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
}