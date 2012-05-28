package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_account_log")
@PK({"logId"})
public class AccountLog {

	/**
	 * 
	 */
	@Id
	@Column("log_id")
	private Integer logId;
	/**
	 * 
	 */
	@Column("user_id")
	private Integer userId;
	/**
	 * 
	 */
	@Column("user_money")
	private Long userMoney;
	/**
	 * 
	 */
	@Column("frozen_money")
	private Long frozenMoney;
	/**
	 * 
	 */
	@Column("rank_points")
	private Integer rankPoints;
	/**
	 * 
	 */
	@Column("pay_points")
	private Integer payPoints;
	/**
	 * 
	 */
	@Column("change_time")
	private Integer changeTime;
	/**
	 * 
	 */
	@Column("change_desc")
	private String changeDesc;
	/**
	 * 
	 */
	@Column("change_type")
	private Integer changeType;
	
	public Integer getLogId() {
		return logId;
	}
	public void setLogId(Integer logId) {
		this.logId = logId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Long getUserMoney() {
		return userMoney;
	}
	public void setUserMoney(Long userMoney) {
		this.userMoney = userMoney;
	}
	public Long getFrozenMoney() {
		return frozenMoney;
	}
	public void setFrozenMoney(Long frozenMoney) {
		this.frozenMoney = frozenMoney;
	}
	public Integer getRankPoints() {
		return rankPoints;
	}
	public void setRankPoints(Integer rankPoints) {
		this.rankPoints = rankPoints;
	}
	public Integer getPayPoints() {
		return payPoints;
	}
	public void setPayPoints(Integer payPoints) {
		this.payPoints = payPoints;
	}
	public Integer getChangeTime() {
		return changeTime;
	}
	public void setChangeTime(Integer changeTime) {
		this.changeTime = changeTime;
	}
	public String getChangeDesc() {
		return changeDesc;
	}
	public void setChangeDesc(String changeDesc) {
		this.changeDesc = changeDesc;
	}
	public Integer getChangeType() {
		return changeType;
	}
	public void setChangeType(Integer changeType) {
		this.changeType = changeType;
	}
	
}