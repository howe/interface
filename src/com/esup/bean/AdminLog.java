package com.esup.bean;

import org.nutz.dao.entity.annotation.*;


/**
* 
*/
@Table("es_admin_log")
@PK({"logId"})
public class AdminLog {

	/**
	 * 
	 */
	@Id
	@Column("log_id")
	private Integer logId;
	/**
	 * 
	 */
	@Column("log_time")
	private Integer logTime;
	/**
	 * 
	 */
	@Column("user_id")
	private Integer userId;
	/**
	 * 
	 */
	@Column("log_info")
	private String logInfo;
	/**
	 * 
	 */
	@Column("ip_address")
	private String ipAddress;
	
	public Integer getLogId() {
		return logId;
	}
	public void setLogId(Integer logId) {
		this.logId = logId;
	}
	public Integer getLogTime() {
		return logTime;
	}
	public void setLogTime(Integer logTime) {
		this.logTime = logTime;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getLogInfo() {
		return logInfo;
	}
	public void setLogInfo(String logInfo) {
		this.logInfo = logInfo;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	
}