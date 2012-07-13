package com.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_ad")
@PK({"adId"})
public class Ad {

	/**
	 * 
	 */
	@Column("ad_id")
	private Integer adId;
	/**
	 * 
	 */
	@Column("position_id")
	private Integer positionId;
	/**
	 * 
	 */
	@Column("media_type")
	private Integer mediaType;
	/**
	 * 
	 */
	@Column("ad_name")
	private String adName;
	/**
	 * 
	 */
	@Column("ad_link")
	private String adLink;
	/**
	 * 
	 */
	@Column("ad_code")
	private String adCode;
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
	@Column("link_man")
	private String linkMan;
	/**
	 * 
	 */
	@Column("link_email")
	private String linkEmail;
	/**
	 * 
	 */
	@Column("link_phone")
	private String linkPhone;
	/**
	 * 
	 */
	@Column("click_count")
	private Integer clickCount;
	/**
	 * 
	 */
	@Column("enabled")
	private Integer enabled;
	public Integer getAdId() {
		return adId;
	}
	
	public void setAdId(Integer adId) {
		this.adId = adId;
	}
	public Integer getPositionId() {
		return positionId;
	}
	public void setPositionId(Integer positionId) {
		this.positionId = positionId;
	}
	public Integer getMediaType() {
		return mediaType;
	}
	public void setMediaType(Integer mediaType) {
		this.mediaType = mediaType;
	}
	public String getAdName() {
		return adName;
	}
	public void setAdName(String adName) {
		this.adName = adName;
	}
	public String getAdLink() {
		return adLink;
	}
	public void setAdLink(String adLink) {
		this.adLink = adLink;
	}
	public String getAdCode() {
		return adCode;
	}
	public void setAdCode(String adCode) {
		this.adCode = adCode;
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
	public String getLinkMan() {
		return linkMan;
	}
	public void setLinkMan(String linkMan) {
		this.linkMan = linkMan;
	}
	public String getLinkEmail() {
		return linkEmail;
	}
	public void setLinkEmail(String linkEmail) {
		this.linkEmail = linkEmail;
	}
	public String getLinkPhone() {
		return linkPhone;
	}
	public void setLinkPhone(String linkPhone) {
		this.linkPhone = linkPhone;
	}
	public Integer getClickCount() {
		return clickCount;
	}
	public void setClickCount(Integer clickCount) {
		this.clickCount = clickCount;
	}
	public Integer getEnabled() {
		return enabled;
	}
	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}
	
}