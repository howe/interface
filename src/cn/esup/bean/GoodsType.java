package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_goods_type")
public class GoodsType {

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
	@Column("enabled")
	private Boolean enabled;
	/**
	 * 
	 */
	@Column("attr_group")
	private String attrGroup;
	
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
	public Boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	public String getAttrGroup() {
		return attrGroup;
	}
	public void setAttrGroup(String attrGroup) {
		this.attrGroup = attrGroup;
	}
	
}