package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_payment")
public class Payment {

	/**
	 * 
	 */
	@Column("pay_id")
	private Integer payId;
	/**
	 * 
	 */
	@Column("pay_code")
	private String payCode;
	/**
	 * 
	 */
	@Column("pay_name")
	private String payName;
	/**
	 * 
	 */
	@Column("pay_fee")
	private String payFee;
	/**
	 * 
	 */
	@Column("pay_desc")
	private String payDesc;
	/**
	 * 
	 */
	@Column("pay_order")
	private Integer payOrder;
	/**
	 * 
	 */
	@Column("pay_config")
	private String payConfig;
	/**
	 * 
	 */
	@Column("enabled")
	private Boolean enabled;
	/**
	 * 
	 */
	@Column("is_cod")
	private Boolean isCod;
	/**
	 * 
	 */
	@Column("is_online")
	private Boolean isOnline;
}