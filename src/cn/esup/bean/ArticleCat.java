package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_article_cat")
@PK({"catId"})
public class ArticleCat {

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
	@Column("cat_type")
	private Boolean catType;
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
	@Column("sort_order")
	private Integer sortOrder;
	/**
	 * 
	 */
	@Column("show_in_nav")
	private Boolean showInNav;
	/**
	 * 
	 */
	@Column("parent_id")
	private Integer parentId;
	
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
	public Boolean getCatType() {
		return catType;
	}
	public void setCatType(Boolean catType) {
		this.catType = catType;
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
	public Integer getSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}
	public Boolean getShowInNav() {
		return showInNav;
	}
	public void setShowInNav(Boolean showInNav) {
		this.showInNav = showInNav;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	
}