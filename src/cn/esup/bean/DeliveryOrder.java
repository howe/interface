package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_delivery_order")
public class DeliveryOrder {

	/**
	 * 
	 */
	@Id
	@Column("delivery_id")
	private Integer deliveryId;
	/**
	 * 
	 */
	@Column("delivery_sn")
	private String deliverySn;
	/**
	 * 
	 */
	@Column("order_sn")
	private String orderSn;
	/**
	 * 
	 */
	@Column("order_id")
	private Integer orderId;
	/**
	 * 
	 */
	@Column("invoice_no")
	private String invoiceNo;
	/**
	 * 
	 */
	@Column("add_time")
	private Integer addTime;
	/**
	 * 
	 */
	@Column("shipping_id")
	private Integer shippingId;
	/**
	 * 
	 */
	@Column("shipping_name")
	private String shippingName;
	/**
	 * 
	 */
	@Column("user_id")
	private Integer userId;
	/**
	 * 
	 */
	@Column("action_user")
	private String actionUser;
	/**
	 * 
	 */
	@Column("consignee")
	private String consignee;
	/**
	 * 
	 */
	@Column("address")
	private String address;
	/**
	 * 
	 */
	@Column("country")
	private Integer country;
	/**
	 * 
	 */
	@Column("province")
	private Integer province;
	/**
	 * 
	 */
	@Column("city")
	private Integer city;
	/**
	 * 
	 */
	@Column("district")
	private Integer district;
	/**
	 * 
	 */
	@Column("sign_building")
	private String signBuilding;
	/**
	 * 
	 */
	@Column("email")
	private String email;
	/**
	 * 
	 */
	@Column("zipcode")
	private String zipcode;
	/**
	 * 
	 */
	@Column("tel")
	private String tel;
	/**
	 * 
	 */
	@Column("mobile")
	private String mobile;
	/**
	 * 
	 */
	@Column("best_time")
	private String bestTime;
	/**
	 * 
	 */
	@Column("postscript")
	private String postscript;
	/**
	 * 
	 */
	@Column("how_oos")
	private String howOos;
	/**
	 * 
	 */
	@Column("insure_fee")
	private Long insureFee;
	/**
	 * 
	 */
	@Column("shipping_fee")
	private Long shippingFee;
	/**
	 * 
	 */
	@Column("update_time")
	private Integer updateTime;
	/**
	 * 
	 */
	@Column("suppliers_id")
	private Integer suppliersId;
	/**
	 * 
	 */
	@Column("status")
	private Boolean status;
	/**
	 * 
	 */
	@Column("agency_id")
	private Integer agencyId;
}