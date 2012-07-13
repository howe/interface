package com.esup.bean;

import org.nutz.dao.entity.annotation.*;
/**
* 
*/
@Table("es_order_action")
@PK({"actionId"})
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
	
	public Integer getActionId() {
		return actionId;
	}
	public void setActionId(Integer actionId) {
		this.actionId = actionId;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getActionUser() {
		return actionUser;
	}
	public void setActionUser(String actionUser) {
		this.actionUser = actionUser;
	}
	public Boolean getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(Boolean orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Boolean getShippingStatus() {
		return shippingStatus;
	}
	public void setShippingStatus(Boolean shippingStatus) {
		this.shippingStatus = shippingStatus;
	}
	public Boolean getPayStatus() {
		return payStatus;
	}
	public void setPayStatus(Boolean payStatus) {
		this.payStatus = payStatus;
	}
	public Boolean getActionPlace() {
		return actionPlace;
	}
	public void setActionPlace(Boolean actionPlace) {
		this.actionPlace = actionPlace;
	}
	public String getActionNote() {
		return actionNote;
	}
	public void setActionNote(String actionNote) {
		this.actionNote = actionNote;
	}
	public Integer getLogTime() {
		return logTime;
	}
	public void setLogTime(Integer logTime) {
		this.logTime = logTime;
	}
	
}