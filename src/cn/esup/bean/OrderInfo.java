package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_order_info")
public class OrderInfo {

	/**
	 * 
	 */
	@Id
	@Column("order_id")
	private Integer orderId;
	/**
	 * 
	 */
	@Column("order_sn")
	private String orderSn;
	/**
	 * 
	 */
	@Column("user_id")
	private Integer userId;
	/**
	 * 
	 */
	@Column("order_status")
	private Boolean orderStatus;
	/**
	 * 
	 */
	@Column("shipping_status")
	private Boolean shippingStatus;
	/**
	 * 
	 */
	@Column("pay_status")
	private Boolean payStatus;
	/**
	 * 
	 */
	@Column("consignee")
	private String consignee;
	/**
	 * 
	 */
	@Column("country")
	private Integer country;
	/**
	 * 
	 */
	@Column("province")
	private Integer province;
	/**
	 * 
	 */
	@Column("city")
	private Integer city;
	/**
	 * 
	 */
	@Column("district")
	private Integer district;
	/**
	 * 
	 */
	@Column("address")
	private String address;
	/**
	 * 
	 */
	@Column("zipcode")
	private String zipcode;
	/**
	 * 
	 */
	@Column("tel")
	private String tel;
	/**
	 * 
	 */
	@Column("mobile")
	private String mobile;
	/**
	 * 
	 */
	@Column("email")
	private String email;
	/**
	 * 
	 */
	@Column("best_time")
	private String bestTime;
	/**
	 * 
	 */
	@Column("sign_building")
	private String signBuilding;
	/**
	 * 
	 */
	@Column("postscript")
	private String postscript;
	/**
	 * 
	 */
	@Column("shipping_id")
	private Integer shippingId;
	/**
	 * 
	 */
	@Column("shipping_name")
	private String shippingName;
	/**
	 * 
	 */
	@Column("pay_id")
	private Integer payId;
	/**
	 * 
	 */
	@Column("pay_name")
	private String payName;
	/**
	 * 
	 */
	@Column("how_oos")
	private String howOos;
	/**
	 * 
	 */
	@Column("how_surplus")
	private String howSurplus;
	/**
	 * 
	 */
	@Column("pack_name")
	private String packName;
	/**
	 * 
	 */
	@Column("card_name")
	private String cardName;
	/**
	 * 
	 */
	@Column("card_message")
	private String cardMessage;
	/**
	 * 
	 */
	@Column("inv_payee")
	private String invPayee;
	/**
	 * 
	 */
	@Column("inv_content")
	private String invContent;
	/**
	 * 
	 */
	@Column("goods_amount")
	private Long goodsAmount;
	/**
	 * 
	 */
	@Column("shipping_fee")
	private Long shippingFee;
	/**
	 * 
	 */
	@Column("insure_fee")
	private Long insureFee;
	/**
	 * 
	 */
	@Column("pay_fee")
	private Long payFee;
	/**
	 * 
	 */
	@Column("pack_fee")
	private Long packFee;
	/**
	 * 
	 */
	@Column("card_fee")
	private Long cardFee;
	/**
	 * 
	 */
	@Column("money_paid")
	private Long moneyPaid;
	/**
	 * 
	 */
	@Column("surplus")
	private Long surplus;
	/**
	 * 
	 */
	@Column("integral")
	private Integer integral;
	/**
	 * 
	 */
	@Column("integral_money")
	private Long integralMoney;
	/**
	 * 
	 */
	@Column("bonus")
	private Long bonus;
	/**
	 * 
	 */
	@Column("order_amount")
	private Long orderAmount;
	/**
	 * 
	 */
	@Column("from_ad")
	private Integer fromAd;
	/**
	 * 
	 */
	@Column("referer")
	private String referer;
	/**
	 * 
	 */
	@Column("add_time")
	private Integer addTime;
	/**
	 * 
	 */
	@Column("confirm_time")
	private Integer confirmTime;
	/**
	 * 
	 */
	@Column("pay_time")
	private Integer payTime;
	/**
	 * 
	 */
	@Column("shipping_time")
	private Integer shippingTime;
	/**
	 * 
	 */
	@Column("pack_id")
	private Integer packId;
	/**
	 * 
	 */
	@Column("card_id")
	private Integer cardId;
	/**
	 * 
	 */
	@Column("bonus_id")
	private Integer bonusId;
	/**
	 * 
	 */
	@Column("invoice_no")
	private String invoiceNo;
	/**
	 * 
	 */
	@Column("extension_code")
	private String extensionCode;
	/**
	 * 
	 */
	@Column("extension_id")
	private Integer extensionId;
	/**
	 * 
	 */
	@Column("to_buyer")
	private String toBuyer;
	/**
	 * 
	 */
	@Column("pay_note")
	private String payNote;
	/**
	 * 
	 */
	@Column("agency_id")
	private Integer agencyId;
	/**
	 * 
	 */
	@Column("inv_type")
	private String invType;
	/**
	 * 
	 */
	@Column("tax")
	private Long tax;
	/**
	 * 
	 */
	@Column("is_separate")
	private Boolean isSeparate;
	/**
	 * 
	 */
	@Column("parent_id")
	private Integer parentId;
	/**
	 * 
	 */
	@Column("discount")
	private Long discount;
	/**
	 * 游戏角色名称
	 */
	@Column("game_nickname")
	private String gameNickname;
	/**
	 * 游戏角色等级
	 */
	@Column("game_level")
	private String gameLevel;
	/**
	 * 游戏角色ID号
	 */
	@Column("game_jueseid")
	private String gameJueseid;
	/**
	 * 游戏角色职业
	 */
	@Column("game_zhiye")
	private String gameZhiye;
}