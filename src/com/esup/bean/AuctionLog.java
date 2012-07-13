package com.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/

@Table("es_auction_log")
@PK({"logId"})
public class AuctionLog {

	/**
	 * 
	 */
	@Id
	@Column("log_id")
	private Integer logId;
	/**
	 * 
	 */
	@Column("act_id")
	private Integer actId;
	/**
	 * 
	 */
	@Column("bid_user")
	private Integer bidUser;
	/**
	 * 
	 */
	@Column("bid_price")
	private Long bidPrice;
	/**
	 * 
	 */
	@Column("bid_time")
	private Integer bidTime;
	
	public Integer getLogId() {
		return logId;
	}
	public void setLogId(Integer logId) {
		this.logId = logId;
	}
	public Integer getActId() {
		return actId;
	}
	public void setActId(Integer actId) {
		this.actId = actId;
	}
	public Integer getBidUser() {
		return bidUser;
	}
	public void setBidUser(Integer bidUser) {
		this.bidUser = bidUser;
	}
	public Long getBidPrice() {
		return bidPrice;
	}
	public void setBidPrice(Long bidPrice) {
		this.bidPrice = bidPrice;
	}
	public Integer getBidTime() {
		return bidTime;
	}
	public void setBidTime(Integer bidTime) {
		this.bidTime = bidTime;
	}
}