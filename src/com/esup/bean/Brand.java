package com.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_brand")
@PK({"brandId"})
public class Brand {

	/**
	 * 
	 */
	@Column("brand_id")
	private Integer brandId;
	/**
	 * 
	 */
	@Column("brand_name")
	private String brandName;
	/**
	 * 
	 */
	@Column("brand_logo")
	private String brandLogo;
	/**
	 * 
	 */
	@Column("brand_desc")
	private String brandDesc;
	/**
	 * 
	 */
	@Column("site_url")
	private String siteUrl;
	/**
	 * 
	 */
	@Column("sort_order")
	private Integer sortOrder;
	/**
	 * 
	 */
	@Column("is_show")
	private Boolean isShow;
	
	public Integer getBrandId() {
		return brandId;
	}
	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getBrandLogo() {
		return brandLogo;
	}
	public void setBrandLogo(String brandLogo) {
		this.brandLogo = brandLogo;
	}
	public String getBrandDesc() {
		return brandDesc;
	}
	public void setBrandDesc(String brandDesc) {
		this.brandDesc = brandDesc;
	}
	public String getSiteUrl() {
		return siteUrl;
	}
	public void setSiteUrl(String siteUrl) {
		this.siteUrl = siteUrl;
	}
	public Integer getSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}
	public Boolean getIsShow() {
		return isShow;
	}
	public void setIsShow(Boolean isShow) {
		this.isShow = isShow;
	}
	
}