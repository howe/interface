package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_cart")
public class Cart {

	/**
	 * 
	 */
	@Id
	@Column("rec_id")
	private Integer recId;
	/**
	 * 
	 */
	@Column("user_id")
	private Integer userId;
	/**
	 * 
	 */
	@Column("session_id")
	private String sessionId;
	/**
	 * 
	 */
	@Column("goods_id")
	private Integer goodsId;
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
	@Column("goods_name")
	private String goodsName;
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
	@Column("goods_number")
	private Integer goodsNumber;
	/**
	 * 
	 */
	@Column("goods_attr")
	private String goodsAttr;
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
	@Column("rec_type")
	private Boolean recType;
	/**
	 * 
	 */
	@Column("is_gift")
	private Integer isGift;
	/**
	 * 
	 */
	@Column("is_shipping")
	private Boolean isShipping;
	/**
	 * 
	 */
	@Column("can_handsel")
	private Integer canHandsel;
	/**
	 * 
	 */
	@Column("goods_attr_id")
	private String goodsAttrId;
}