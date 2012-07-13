package com.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_attribute")
@PK({"attrId"})
public class Attribute {

	/**
	 * 
	 */
	@Column("attr_id")
	private Integer attrId;
	/**
	 * 
	 */
	@Column("cat_id")
	private Integer catId;
	/**
	 * 
	 */
	@Column("attr_name")
	private String attrName;
	/**
	 * 
	 */
	@Column("attr_input_type")
	private Boolean attrInputType;
	/**
	 * 
	 */
	@Column("attr_type")
	private Boolean attrType;
	/**
	 * 
	 */
	@Column("attr_values")
	private String attrValues;
	/**
	 * 
	 */
	@Column("attr_index")
	private Boolean attrIndex;
	/**
	 * 
	 */
	@Column("sort_order")
	private Integer sortOrder;
	/**
	 * 
	 */
	@Column("is_linked")
	private Boolean isLinked;
	/**
	 * 
	 */
	@Column("attr_group")
	private Boolean attrGroup;
	
	public Integer getAttrId() {
		return attrId;
	}
	public void setAttrId(Integer attrId) {
		this.attrId = attrId;
	}
	public Integer getCatId() {
		return catId;
	}
	public void setCatId(Integer catId) {
		this.catId = catId;
	}
	public String getAttrName() {
		return attrName;
	}
	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}
	public Boolean getAttrInputType() {
		return attrInputType;
	}
	public void setAttrInputType(Boolean attrInputType) {
		this.attrInputType = attrInputType;
	}
	public Boolean getAttrType() {
		return attrType;
	}
	public void setAttrType(Boolean attrType) {
		this.attrType = attrType;
	}
	public String getAttrValues() {
		return attrValues;
	}
	public void setAttrValues(String attrValues) {
		this.attrValues = attrValues;
	}
	public Boolean getAttrIndex() {
		return attrIndex;
	}
	public void setAttrIndex(Boolean attrIndex) {
		this.attrIndex = attrIndex;
	}
	public Integer getSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}
	public Boolean getIsLinked() {
		return isLinked;
	}
	public void setIsLinked(Boolean isLinked) {
		this.isLinked = isLinked;
	}
	public Boolean getAttrGroup() {
		return attrGroup;
	}
	public void setAttrGroup(Boolean attrGroup) {
		this.attrGroup = attrGroup;
	}
}