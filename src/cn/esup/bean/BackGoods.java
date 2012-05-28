package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_back_goods")
public class BackGoods {

	/**
	 * 
	 */
	@Id
	@Column("rec_id")
	private Integer recId;
	/**
	 * 
	 */
	@Column("back_id")
	private Integer backId;
	/**
	 * 
	 */
	@Column("goods_id")
	private Integer goodsId;
	/**
	 * 
	 */
	@Column("product_id")
	private Integer productId;
	/**
	 * 
	 */
	@Column("product_sn")
	private String productSn;
	/**
	 * 
	 */
	@Column("goods_name")
	private String goodsName;
	/**
	 * 
	 */
	@Column("brand_name")
	private String brandName;
	/**
	 * 
	 */
	@Column("goods_sn")
	private String goodsSn;
	/**
	 * 
	 */
	@Column("is_real")
	private Boolean isReal;
	/**
	 * 
	 */
	@Column("send_number")
	private Integer sendNumber;
	/**
	 * 
	 */
	@Column("goods_attr")
	private String goodsAttr;
}