package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
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
}