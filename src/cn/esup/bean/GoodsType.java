package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
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
}