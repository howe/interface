package com.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_payment")
@PK({"payId"})
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
	
	public Integer getPayId() {
		return payId;
	}
	public void setPayId(Integer payId) {
		this.payId = payId;
	}
	public String getPayCode() {
		return payCode;
	}
	public void setPayCode(String payCode) {
		this.payCode = payCode;
	}
	public String getPayName() {
		return payName;
	}
	public void setPayName(String payName) {
		this.payName = payName;
	}
	public String getPayFee() {
		return payFee;
	}
	public void setPayFee(String payFee) {
		this.payFee = payFee;
	}
	public String getPayDesc() {
		return payDesc;
	}
	public void setPayDesc(String payDesc) {
		this.payDesc = payDesc;
	}
	public Integer getPayOrder() {
		return payOrder;
	}
	public void setPayOrder(Integer payOrder) {
		this.payOrder = payOrder;
	}
	public String getPayConfig() {
		return payConfig;
	}
	public void setPayConfig(String payConfig) {
		this.payConfig = payConfig;
	}
	public Boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	public Boolean getIsCod() {
		return isCod;
	}
	public void setIsCod(Boolean isCod) {
		this.isCod = isCod;
	}
	public Boolean getIsOnline() {
		return isOnline;
	}
	public void setIsOnline(Boolean isOnline) {
		this.isOnline = isOnline;
	}
	
}