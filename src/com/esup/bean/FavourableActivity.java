package com.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_favourable_activity")
@PK({"actId"})
public class FavourableActivity {

	/**
	 * 
	 */
	@Column("act_id")
	private Integer actId;
	/**
	 * 
	 */
	@Column("act_name")
	private String actName;
	/**
	 * 
	 */
	@Column("start_time")
	private Integer startTime;
	/**
	 * 
	 */
	@Column("end_time")
	private Integer endTime;
	/**
	 * 
	 */
	@Column("user_rank")
	private String userRank;
	/**
	 * 
	 */
	@Column("act_range")
	private Integer actRange;
	/**
	 * 
	 */
	@Column("act_range_ext")
	private String actRangeExt;
	/**
	 * 
	 */
	@Column("min_amount")
	private Long minAmount;
	/**
	 * 
	 */
	@Column("max_amount")
	private Long maxAmount;
	/**
	 * 
	 */
	@Column("act_type")
	private Integer actType;
	/**
	 * 
	 */
	@Column("act_type_ext")
	private Long actTypeExt;
	/**
	 * 
	 */
	@Column("gift")
	private String gift;
	/**
	 * 
	 */
	@Column("sort_order")
	private Integer sortOrder;
	
	public Integer getActId() {
		return actId;
	}
	public void setActId(Integer actId) {
		this.actId = actId;
	}
	public String getActName() {
		return actName;
	}
	public void setActName(String actName) {
		this.actName = actName;
	}
	public Integer getStartTime() {
		return startTime;
	}
	public void setStartTime(Integer startTime) {
		this.startTime = startTime;
	}
	public Integer getEndTime() {
		return endTime;
	}
	public void setEndTime(Integer endTime) {
		this.endTime = endTime;
	}
	public String getUserRank() {
		return userRank;
	}
	public void setUserRank(String userRank) {
		this.userRank = userRank;
	}
	public Integer getActRange() {
		return actRange;
	}
	public void setActRange(Integer actRange) {
		this.actRange = actRange;
	}
	public String getActRangeExt() {
		return actRangeExt;
	}
	public void setActRangeExt(String actRangeExt) {
		this.actRangeExt = actRangeExt;
	}
	public Long getMinAmount() {
		return minAmount;
	}
	public void setMinAmount(Long minAmount) {
		this.minAmount = minAmount;
	}
	public Long getMaxAmount() {
		return maxAmount;
	}
	public void setMaxAmount(Long maxAmount) {
		this.maxAmount = maxAmount;
	}
	public Integer getActType() {
		return actType;
	}
	public void setActType(Integer actType) {
		this.actType = actType;
	}
	public Long getActTypeExt() {
		return actTypeExt;
	}
	public void setActTypeExt(Long actTypeExt) {
		this.actTypeExt = actTypeExt;
	}
	public String getGift() {
		return gift;
	}
	public void setGift(String gift) {
		this.gift = gift;
	}
	public Integer getSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}
	
}