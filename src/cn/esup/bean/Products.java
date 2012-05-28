package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_products")
public class Products {

	/**
	 * 
	 */
	@Id
	@Column("product_id")
	private Integer productId;
	/**
	 * 
	 */
	@Column("goods_id")
	private Integer goodsId;
	/**
	 * 
	 */
	@Column("goods_attr")
	private String goodsAttr;
	/**
	 * 
	 */
	@Column("product_sn")
	private String productSn;
	/**
	 * 
	 */
	@Column("product_number")
	private Integer productNumber;
}