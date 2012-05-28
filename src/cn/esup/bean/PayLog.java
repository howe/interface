package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_pay_log")
public class PayLog {

	/**
	 * 
	 */
	@Id
	@Column("log_id")
	private Integer logId;
	/**
	 * 
	 */
	@Column("order_id")
	private Integer orderId;
	/**
	 * 
	 */
	@Column("order_amount")
	private Long orderAmount;
	/**
	 * 
	 */
	@Column("order_type")
	private Boolean orderType;
	/**
	 * 
	 */
	@Column("is_paid")
	private Boolean isPaid;
}