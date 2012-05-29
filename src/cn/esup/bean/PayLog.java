package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_pay_log")
@PK({"logId"})
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
	
	public Integer getLogId() {
		return logId;
	}
	public void setLogId(Integer logId) {
		this.logId = logId;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Long getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(Long orderAmount) {
		this.orderAmount = orderAmount;
	}
	public Boolean getOrderType() {
		return orderType;
	}
	public void setOrderType(Boolean orderType) {
		this.orderType = orderType;
	}
	public Boolean getIsPaid() {
		return isPaid;
	}
	public void setIsPaid(Boolean isPaid) {
		this.isPaid = isPaid;
	}
	
}