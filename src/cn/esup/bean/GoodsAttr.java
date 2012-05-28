package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_goods_attr")
public class GoodsAttr {

	/**
	 * 
	 */
	@Id
	@Column("goods_attr_id")
	private Integer goodsAttrId;
	/**
	 * 
	 */
	@Column("goods_id")
	private Integer goodsId;
	/**
	 * 
	 */
	@Column("attr_id")
	private Integer attrId;
	/**
	 * 
	 */
	@Column("attr_value")
	private String attrValue;
	/**
	 * 
	 */
	@Column("attr_price")
	private String attrPrice;
}