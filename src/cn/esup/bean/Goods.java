package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_goods")
public class Goods {

	/**
	 * 
	 */
	@Id
	@Column("goods_id")
	private Integer goodsId;
	/**
	 * 
	 */
	@Column("cat_id")
	private Integer catId;
	/**
	 * 
	 */
	@Column("goods_sn")
	private String goodsSn;
	/**
	 * 
	 */
	@Column("goods_name")
	private String goodsName;
	/**
	 * 
	 */
	@Column("goods_name_style")
	private String goodsNameStyle;
	/**
	 * 
	 */
	@Column("click_count")
	private Integer clickCount;
	/**
	 * 
	 */
	@Column("brand_id")
	private Integer brandId;
	/**
	 * 
	 */
	@Column("provider_name")
	private String providerName;
	/**
	 * 
	 */
	@Column("goods_number")
	private Integer goodsNumber;
	/**
	 * 
	 */
	@Column("goods_weight")
	private Long goodsWeight;
	/**
	 * 
	 */
	@Column("market_price")
	private Long marketPrice;
	/**
	 * 
	 */
	@Column("shop_price")
	private Long shopPrice;
	/**
	 * 
	 */
	@Column("promote_price")
	private Long promotePrice;
	/**
	 * 
	 */
	@Column("promote_start_date")
	private Integer promoteStartDate;
	/**
	 * 
	 */
	@Column("promote_end_date")
	private Integer promoteEndDate;
	/**
	 * 
	 */
	@Column("warn_number")
	private Integer warnNumber;
	/**
	 * 
	 */
	@Column("keywords")
	private String keywords;
	/**
	 * 
	 */
	@Column("goods_brief")
	private String goodsBrief;
	/**
	 * 
	 */
	@Column("goods_desc")
	private String goodsDesc;
	/**
	 * 
	 */
	@Column("goods_thumb")
	private String goodsThumb;
	/**
	 * 
	 */
	@Column("goods_img")
	private String goodsImg;
	/**
	 * 
	 */
	@Column("original_img")
	private String originalImg;
	/**
	 * 
	 */
	@Column("is_real")
	private Integer isReal;
	/**
	 * 
	 */
	@Column("extension_code")
	private String extensionCode;
	/**
	 * 
	 */
	@Column("is_on_sale")
	private Boolean isOnSale;
	/**
	 * 
	 */
	@Column("is_alone_sale")
	private Boolean isAloneSale;
	/**
	 * 
	 */
	@Column("is_shipping")
	private Boolean isShipping;
	/**
	 * 
	 */
	@Column("integral")
	private Integer integral;
	/**
	 * 
	 */
	@Column("add_time")
	private Integer addTime;
	/**
	 * 
	 */
	@Column("sort_order")
	private Integer sortOrder;
	/**
	 * 
	 */
	@Column("is_delete")
	private Boolean isDelete;
	/**
	 * 
	 */
	@Column("is_best")
	private Boolean isBest;
	/**
	 * 
	 */
	@Column("is_new")
	private Boolean isNew;
	/**
	 * 
	 */
	@Column("is_hot")
	private Boolean isHot;
	/**
	 * 
	 */
	@Column("is_promote")
	private Boolean isPromote;
	/**
	 * 
	 */
	@Column("bonus_type_id")
	private Integer bonusTypeId;
	/**
	 * 
	 */
	@Column("last_update")
	private Integer lastUpdate;
	/**
	 * 
	 */
	@Column("goods_type")
	private Integer goodsType;
	/**
	 * 
	 */
	@Column("seller_note")
	private String sellerNote;
	/**
	 * 
	 */
	@Column("give_integral")
	private Integer giveIntegral;
	/**
	 * 
	 */
	@Column("rank_integral")
	private Integer rankIntegral;
	/**
	 * 供应商ID, 自供品为0
	 */
	@Column("suppliers_id")
	private Integer suppliersId;
	/**
	 * 
	 */
	@Column("is_check")
	private Boolean isCheck;
	/**
	 * 单位
	 */
	@Column("danwei")
	private String danwei;
	/**
	 * 单价
	 */
	@Column("danjia")
	private Long danjia;
	/**
	 * 游戏币数量
	 */
	@Column("yxsl")
	private Long yxsl;
	/**
	 * 阵营
	 */
	@Column("zhenying")
	private String zhenying;
	/**
	 * 游戏名
	 */
	@Column("yxm")
	private String yxm;
	/**
	 * 游戏服名
	 */
	@Column("yxqm")
	private String yxqm;
	/**
	 * 游戏服名
	 */
	@Column("yxfm")
	private String yxfm;
	/**
	 * 供货商商品ID
	 */
	@Column("ghsp_id")
	private String ghspId;
}