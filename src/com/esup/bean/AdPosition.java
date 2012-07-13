package com.esup.bean;

import org.nutz.dao.entity.annotation.*;


/**
* 
*/
@Table("es_ad_position")
public class AdPosition {

	/**
	 * 
	 */
	@Column("position_id")
	private Integer positionId;
	/**
	 * 
	 */
	@Column("position_name")
	private String positionName;
	/**
	 * 
	 */
	@Column("ad_width")
	private Integer adWidth;
	/**
	 * 
	 */
	@Column("ad_height")
	private Integer adHeight;
	/**
	 * 
	 */
	@Column("position_desc")
	private String positionDesc;
	/**
	 * 
	 */
	@Column("position_style")
	private String positionStyle;
	
	public Integer getPositionId() {
		return positionId;
	}
	public void setPositionId(Integer positionId) {
		this.positionId = positionId;
	}
	public String getPositionName() {
		return positionName;
	}
	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}
	public Integer getAdWidth() {
		return adWidth;
	}
	public void setAdWidth(Integer adWidth) {
		this.adWidth = adWidth;
	}
	public Integer getAdHeight() {
		return adHeight;
	}
	public void setAdHeight(Integer adHeight) {
		this.adHeight = adHeight;
	}
	public String getPositionDesc() {
		return positionDesc;
	}
	public void setPositionDesc(String positionDesc) {
		this.positionDesc = positionDesc;
	}
	public String getPositionStyle() {
		return positionStyle;
	}
	public void setPositionStyle(String positionStyle) {
		this.positionStyle = positionStyle;
	}
	
}