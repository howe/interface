package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_snatch_log")
@PK({"logId"})
public class SnatchLog {

	/**
	 * 
	 */
	@Id
	@Column("log_id")
	private Integer logId;
	/**
	 * 
	 */
	@Column("snatch_id")
	private Integer snatchId;
	/**
	 * 
	 */
	@Column("user_id")
	private Integer userId;
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
	public Integer getSnatchId() {
		return snatchId;
	}
	public void setSnatchId(Integer snatchId) {
		this.snatchId = snatchId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
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