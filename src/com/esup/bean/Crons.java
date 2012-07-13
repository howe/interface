package com.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_crons")
@PK({"cronId"})
public class Crons {

	/**
	 * 
	 */
	@Column("cron_id")
	private Integer cronId;
	/**
	 * 
	 */
	@Column("cron_code")
	private String cronCode;
	/**
	 * 
	 */
	@Column("cron_name")
	private String cronName;
	/**
	 * 
	 */
	@Column("cron_desc")
	private String cronDesc;
	/**
	 * 
	 */
	@Column("cron_order")
	private Integer cronOrder;
	/**
	 * 
	 */
	@Column("cron_config")
	private String cronConfig;
	/**
	 * 
	 */
	@Column("thistime")
	private Integer thistime;
	/**
	 * 
	 */
	@Column("nextime")
	private Integer nextime;
	/**
	 * 
	 */
	@Column("day")
	private Integer day;
	/**
	 * 
	 */
	@Column("week")
	private String week;
	/**
	 * 
	 */
	@Column("hour")
	private String hour;
	/**
	 * 
	 */
	@Column("minute")
	private String minute;
	/**
	 * 
	 */
	@Column("enable")
	private Boolean enable;
	/**
	 * 
	 */
	@Column("run_once")
	private Boolean runOnce;
	/**
	 * 
	 */
	@Column("allow_ip")
	private String allowIp;
	/**
	 * 
	 */
	@Column("alow_files")
	private String alowFiles;
	
	public Integer getCronId() {
		return cronId;
	}
	public void setCronId(Integer cronId) {
		this.cronId = cronId;
	}
	public String getCronCode() {
		return cronCode;
	}
	public void setCronCode(String cronCode) {
		this.cronCode = cronCode;
	}
	public String getCronName() {
		return cronName;
	}
	public void setCronName(String cronName) {
		this.cronName = cronName;
	}
	public String getCronDesc() {
		return cronDesc;
	}
	public void setCronDesc(String cronDesc) {
		this.cronDesc = cronDesc;
	}
	public Integer getCronOrder() {
		return cronOrder;
	}
	public void setCronOrder(Integer cronOrder) {
		this.cronOrder = cronOrder;
	}
	public String getCronConfig() {
		return cronConfig;
	}
	public void setCronConfig(String cronConfig) {
		this.cronConfig = cronConfig;
	}
	public Integer getThistime() {
		return thistime;
	}
	public void setThistime(Integer thistime) {
		this.thistime = thistime;
	}
	public Integer getNextime() {
		return nextime;
	}
	public void setNextime(Integer nextime) {
		this.nextime = nextime;
	}
	public Integer getDay() {
		return day;
	}
	public void setDay(Integer day) {
		this.day = day;
	}
	public String getWeek() {
		return week;
	}
	public void setWeek(String week) {
		this.week = week;
	}
	public String getHour() {
		return hour;
	}
	public void setHour(String hour) {
		this.hour = hour;
	}
	public String getMinute() {
		return minute;
	}
	public void setMinute(String minute) {
		this.minute = minute;
	}
	public Boolean getEnable() {
		return enable;
	}
	public void setEnable(Boolean enable) {
		this.enable = enable;
	}
	public Boolean getRunOnce() {
		return runOnce;
	}
	public void setRunOnce(Boolean runOnce) {
		this.runOnce = runOnce;
	}
	public String getAllowIp() {
		return allowIp;
	}
	public void setAllowIp(String allowIp) {
		this.allowIp = allowIp;
	}
	public String getAlowFiles() {
		return alowFiles;
	}
	public void setAlowFiles(String alowFiles) {
		this.alowFiles = alowFiles;
	}
	
}