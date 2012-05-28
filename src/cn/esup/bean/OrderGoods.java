package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_order_goods")
public class OrderGoods {

	/**
	 * 
	 */
	@Id
	@Column("rec_id")
	private Integer recId;
	/**
	 * 
	 */
	@Column("order_id")
	private Integer orderId;
	/**
	 * 
	 */
	@Column("goods_id")
	private Integer goodsId;
	/**
	 * 
	 */
	@Column("goods_name")
	private String goodsName;
	/**
	 * 
	 */
	@Column("goods_sn")
	private String goodsSn;
	/**
	 * 
	 */
	@Column("product_id")
	private Integer productId;
	/**
	 * 
	 */
	@Column("goods_number")
	private Integer goodsNumber;
	/**
	 * 
	 */
	@Column("market_price")
	private Long marketPrice;
	/**
	 * 
	 */
	@Column("goods_price")
	private Long goodsPrice;
	/**
	 * 
	 */
	@Column("goods_attr")
	private String goodsAttr;
	/**
	 * 
	 */
	@Column("send_number")
	private Integer sendNumber;
	/**
	 * 
	 */
	@Column("is_real")
	private Boolean isReal;
	/**
	 * 
	 */
	@Column("extension_code")
	private String extensionCode;
	/**
	 * 
	 */
	@Column("parent_id")
	private Integer parentId;
	/**
	 * 
	 */
	@Column("is_gift")
	private Integer isGift;
	/**
	 * 
	 */
	@Column("goods_attr_id")
	private String goodsAttrId;
}