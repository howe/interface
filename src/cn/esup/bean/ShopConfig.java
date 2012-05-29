package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_shop_config")
public class ShopConfig {

	/**
	 * 
	 */
	@Column("id")
	private Integer id;
	/**
	 * 
	 */
	@Column("parent_id")
	private Integer parentId;
	/**
	 * 
	 */
	@Column("code")
	private String code;
	/**
	 * 
	 */
	@Column("type")
	private String type;
	/**
	 * 
	 */
	@Column("store_range")
	private String storeRange;
	/**
	 * 
	 */
	@Column("store_dir")
	private String storeDir;
	/**
	 * 
	 */
	@Column("value")
	private String value;
	/**
	 * 
	 */
	@Column("sort_order")
	private Integer sortOrder;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStoreRange() {
		return storeRange;
	}
	public void setStoreRange(String storeRange) {
		this.storeRange = storeRange;
	}
	public String getStoreDir() {
		return storeDir;
	}
	public void setStoreDir(String storeDir) {
		this.storeDir = storeDir;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Integer getSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}
	
}