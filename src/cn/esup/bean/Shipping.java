package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_shipping")
public class Shipping {

	/**
	 * 
	 */
	@Column("shipping_id")
	private Integer shippingId;
	/**
	 * 
	 */
	@Column("shipping_code")
	private String shippingCode;
	/**
	 * 
	 */
	@Column("shipping_name")
	private String shippingName;
	/**
	 * 
	 */
	@Column("shipping_desc")
	private String shippingDesc;
	/**
	 * 
	 */
	@Column("insure")
	private String insure;
	/**
	 * 
	 */
	@Column("support_cod")
	private Boolean supportCod;
	/**
	 * 
	 */
	@Column("enabled")
	private Boolean enabled;
	/**
	 * 
	 */
	@Column("shipping_print")
	private String shippingPrint;
	/**
	 * 
	 */
	@Column("print_bg")
	private String printBg;
	/**
	 * 
	 */
	@Column("config_lable")
	private String configLable;
	/**
	 * 
	 */
	@Column("print_model")
	private Boolean printModel;
	/**
	 * 
	 */
	@Column("shipping_order")
	private Integer shippingOrder;
}