package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_order_action")
public class OrderAction {

	/**
	 * 
	 */
	@Id
	@Column("action_id")
	private Integer actionId;
	/**
	 * 
	 */
	@Column("order_id")
	private Integer orderId;
	/**
	 * 
	 */
	@Column("action_user")
	private String actionUser;
	/**
	 * 
	 */
	@Column("order_status")
	private Boolean orderStatus;
	/**
	 * 
	 */
	@Column("shipping_status")
	private Boolean shippingStatus;
	/**
	 * 
	 */
	@Column("pay_status")
	private Boolean payStatus;
	/**
	 * 
	 */
	@Column("action_place")
	private Boolean actionPlace;
	/**
	 * 
	 */
	@Column("action_note")
	private String actionNote;
	/**
	 * 
	 */
	@Column("log_time")
	private Integer logTime;
}