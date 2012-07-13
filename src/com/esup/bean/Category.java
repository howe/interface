package com.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_category")
@PK({"catId"})
public class Category {

	/**
	 * 
	 */
	@Column("cat_id")
	private Integer catId;
	/**
	 * 
	 */
	@Column("cat_name")
	private String catName;
	/**
	 * 
	 */
	@Column("keywords")
	private String keywords;
	/**
	 * 
	 */
	@Column("cat_desc")
	private String catDesc;
	/**
	 * 
	 */
	@Column("parent_id")
	private Integer parentId;
	/**
	 * 
	 */
	@Column("sort_order")
	private Boolean sortOrder;
	/**
	 * 
	 */
	@Column("template_file")
	private String templateFile;
	/**
	 * 
	 */
	@Column("measure_unit")
	private String measureUnit;
	/**
	 * 
	 */
	@Column("show_in_nav")
	private Boolean showInNav;
	/**
	 * 
	 */
	@Column("style")
	private String style;
	/**
	 * 
	 */
	@Column("is_show")
	private Boolean isShow;
	/**
	 * 
	 */
	@Column("grade")
	private Integer grade;
	/**
	 * 
	 */
	@Column("filter_attr")
	private String filterAttr;
	
	public Integer getCatId() {
		return catId;
	}
	public void setCatId(Integer catId) {
		this.catId = catId;
	}
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getCatDesc() {
		return catDesc;
	}
	public void setCatDesc(String catDesc) {
		this.catDesc = catDesc;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public Boolean getSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(Boolean sortOrder) {
		this.sortOrder = sortOrder;
	}
	public String getTemplateFile() {
		return templateFile;
	}
	public void setTemplateFile(String templateFile) {
		this.templateFile = templateFile;
	}
	public String getMeasureUnit() {
		return measureUnit;
	}
	public void setMeasureUnit(String measureUnit) {
		this.measureUnit = measureUnit;
	}
	public Boolean getShowInNav() {
		return showInNav;
	}
	public void setShowInNav(Boolean showInNav) {
		this.showInNav = showInNav;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public Boolean getIsShow() {
		return isShow;
	}
	public void setIsShow(Boolean isShow) {
		this.isShow = isShow;
	}
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	public String getFilterAttr() {
		return filterAttr;
	}
	public void setFilterAttr(String filterAttr) {
		this.filterAttr = filterAttr;
	}
	
}