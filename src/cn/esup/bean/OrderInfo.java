package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 订单信息表
*/
@Table("es_order_info")
@PK({"orderId"})
public class OrderInfo {

	/**
	 * 订单编号（自增id）
	 */
	@Id
	@Column("order_id")
	private Integer orderId;
	
	/**
	 * 订单序列号
	 */
	@Column("order_sn")
	private String orderSn;
	
	/**
	 * 用户id,同es_users的user_id
	 */
	@Column("user_id")
	private Integer userId;
	
	/**
	 * 订单的状态;0未确认,1确认,2已取消,3无效,4退货
	 */
	@Column("order_status")
	private Boolean orderStatus;
	
	/**
	 * 商品配送情况;0未发货,1已发货,2已收货,4退货
	 */
	@Column("shipping_status")
	private Boolean shippingStatus;
	
	/**
	 * 支付状态;0未付款;1付款中;2已付款
	 */
	@Column("pay_status")
	private Boolean payStatus;
	
	/**
	 * 收货人的姓名,用户页面填写,默认取值表user_address
	 */
	@Column("consignee")
	private String consignee;
	
	/**
	 * 收货人的国家,用户页面填写,默认取值于表user_address,其id对应的值在es_region, 默认为 1
	 */
	@Column("country")
	private Integer country;
	
	/**
	 * 收货人的省份,用户页面填写,默认取值于表user_address, 其id对应的值在es_region, 默认为2
	 */
	@Column("province")
	private Integer province;
	
	/**
	 * 收货人的城市,用户页面填写,默认取值于表user_address,其id对应的值在es_region, 默认为52
	 */
	@Column("city")
	private Integer city;
	
	/**
	 * 收货人的地区,用户页面填写,默认取值于表user_address,其id对应的值在es_region, 默认为500
	 */
	@Column("district")
	private Integer district;
	
	/**
	 * 收货人的详细地址,用户页面填写,默认取值于表user_address, 写死了为esup
	 */
	@Column("address")
	private String address;
	
	/**
	 * 收货人的邮编,用户页面填写,默认取值于表user_address
	 */
	@Column("zipcode")
	private String zipcode;
	
	/**
	 * 收货人的手机号码,用户页面填写,默认取值于表user_address
	 */
	@Column("tel")
	private String tel;
	
	/**
	 * 收货人的QQ号码,用户页面填写,默认取值于表user_address, 因为要多个字段 所以把这个字段前端填QQ号码
	 */
	@Column("mobile")
	private String mobile;
	
	/**
	 * 收货人的Email, 用户页面填写,默认取值于表user_address
	 */
	@Column("email")
	private String email;
	
	/**
	 * 收货人的最佳送货时间,用户页面填写,默认取值于表user_addr, 默认为空了, 不用管(实体商品字段)
	 */
	@Column("best_time")
	private String bestTime;
	
	/**
	 * 送货人的地址的标志性建筑,用户页面填写,默认取值于表user_address, 默认为空了, 不用管(实体商品字段)
	 */
	@Column("sign_building")
	private String signBuilding;
	
	/**
	 * 订单附言,由用户提交订单前填写
	 */
	@Column("postscript")
	private String postscript;
	
	/**
	 * 用户选择的配送方式id, 取值表es_shipping, 非点卡类默认为13
	 */
	@Column("shipping_id")
	private Integer shippingId;
	
	/**
	 * 用户选择的配送方式的名称,取值表es_shipping, 非点卡类默认为客服发货
	 */
	@Column("shipping_name")
	private String shippingName;
	
	/**
	 * 用户选择的支付方式的id,取值表es_payment, 4为财付通, 5为支付宝
	 */
	@Column("pay_id")
	private Integer payId;
	
	/**
	 * 用户选择的支付方式名称,取值表es_payment
	 */
	@Column("pay_name")
	private String payName;
	
	/**
	 * 缺货处理方式,等待所有商品备齐后再发,取消订单;与店主协商
	 */
	@Column("how_oos")
	private String howOos;
	
	/**
	 * 根据字段猜测应该是余额处理方式,程序未作这部分实现
	 */
	@Column("how_surplus")
	private String howSurplus;
	
	/**
	 * 包装名称,取值表ecs_pack
	 */
	@Column("pack_name")
	private String packName;
	
	/**
	 * 贺卡的名称,取值ecs_card
	 */
	@Column("card_name")
	private String cardName;
	
	/**
	 * 贺卡内容,由用户提交
	 */
	@Column("card_message")
	private String cardMessage;
	
	/**
	 * 发票抬头,用户页面填写
	 */
	@Column("inv_payee")
	private String invPayee;
	
	/**
	 * 发票内容,用户页面选择,取值es_shop_config的code字段的值 为invoice_content的value
	 */
	@Column("inv_content")
	private String invContent;
	
	/**
	 * 商品的总金额
	 */
	@Column("goods_amount")
	private Long goodsAmount;
	
	/**
	 * 配送费用
	 */
	@Column("shipping_fee")
	private Long shippingFee;
	
	/**
	 * 保价费用
	 */
	@Column("insure_fee")
	private Long insureFee;
	
	/**
	 * 支付费用,跟支付方式的配置相关,取值表es_payment
	 */
	@Column("pay_fee")
	private Long payFee;
	
	/**
	 * 包装费用,取值表es_pack
	 */
	@Column("pack_fee")
	private Long packFee;
	
	/**
	 * 贺卡费用,取值ecs_card
	 */
	@Column("card_fee")
	private Long cardFee;
	
	/**
	 * 已付款金额
	 */
	@Column("money_paid")
	private Long moneyPaid;
	
	/**
	 * 该订单使用金额的数量,取用户设定余额,用户可用余额,订单金额中最小者
	 */
	@Column("surplus")
	private Long surplus;
	
	/**
	 * 使用的积分的数量,取用户使用积分,商品可用积分,用户拥有积分中最小者
	 */
	@Column("integral")
	private Integer integral;
	
	/**
	 * 使用积分金额
	 */
	@Column("integral_money")
	private Long integralMoney;
	
	/**
	 * 使用红包金额
	 */
	@Column("bonus")
	private Long bonus;
	
	/**
	 * 应付款金额
	 */
	@Column("order_amount")
	private Long orderAmount;
	
	/**
	 * 订单由某广告带来的广告id,应该取值于es_ad
	 */
	@Column("from_ad")
	private Integer fromAd;
	
	/**
	 * 订单的来源页面
	 */
	@Column("referer")
	private String referer;
	
	/**
	 * 订单生成时间
	 */
	@Column("add_time")
	private Integer addTime;
	
	/**
	 * 订单确认时间
	 */
	@Column("confirm_time")
	private Integer confirmTime;
	
	/**
	 * 订单支付时间
	 */
	@Column("pay_time")
	private Integer payTime;
	
	/**
	 * 订单配送时间
	 */
	@Column("shipping_time")
	private Integer shippingTime;
	
	/**
	 * 包装id,取值表es_pck
	 */
	@Column("pack_id")
	private Integer packId;
	
	/**
	 * 贺卡id,用户在页面选择,取值
	 */
	@Column("card_id")
	private Integer cardId;
	
	/**
	 * 红包id,ecs_user_bonus的bonus_id
	 */
	@Column("bonus_id")
	private Integer bonusId;
	
	/**
	 * 发货时填写, 可在订单查询查看
	 */
	@Column("invoice_no")
	private String invoiceNo;
	
	/**
	 * 通过活动购买的商品的代号,group_buy是团购; auction是拍卖;snatch夺宝奇兵;正常普通产品该处理为空
	 */
	@Column("extension_code")
	private String extensionCode;
	
	/**
	 * 通过活动购买的物品id,取值ecs_good_activity;如果是正常普通商品,该处为0
	 */
	@Column("extension_id")
	private Integer extensionId;
	
	/**
	 * 商家给客户的留言,当该字段值时可以在订单查询看到
	 */
	@Column("to_buyer")
	private String toBuyer;
	
	/**
	 * 付款备注, 在订单管理编辑修改
	 */
	@Column("pay_note")
	private String payNote;
	
	/**
	 * 该笔订单被指派给的办事处的id, 根据订单内容和办事处负责范围自动决定,也可以有管理员修改,取值于表ecs_agency
	 */
	@Column("agency_id")
	private Integer agencyId;
	
	/**
	 * 发票类型,用户页面选择,取值ecs_shop_config的code字段的值invoice_type的value
	 */
	@Column("inv_type")
	private String invType;
	
	/**
	 * 发票税额
	 */
	@Column("tax")
	private Long tax;
	
	/**
	 * 0未分成或等待分成;1已分成;2取消分成
	 */
	@Column("is_separate")
	private Boolean isSeparate;
	
	/**
	 * 能获得推荐分成的用户id, id取值于表es_user
	 */
	@Column("parent_id")
	private Integer parentId;
	
	/**
	 * 折扣金额
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
	
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getOrderSn() {
		return orderSn;
	}
	public void setOrderSn(String orderSn) {
		this.orderSn = orderSn;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Boolean getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(Boolean orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Boolean getShippingStatus() {
		return shippingStatus;
	}
	public void setShippingStatus(Boolean shippingStatus) {
		this.shippingStatus = shippingStatus;
	}
	public Boolean getPayStatus() {
		return payStatus;
	}
	public void setPayStatus(Boolean payStatus) {
		this.payStatus = payStatus;
	}
	public String getConsignee() {
		return consignee;
	}
	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}
	public Integer getCountry() {
		return country;
	}
	public void setCountry(Integer country) {
		this.country = country;
	}
	public Integer getProvince() {
		return province;
	}
	public void setProvince(Integer province) {
		this.province = province;
	}
	public Integer getCity() {
		return city;
	}
	public void setCity(Integer city) {
		this.city = city;
	}
	public Integer getDistrict() {
		return district;
	}
	public void setDistrict(Integer district) {
		this.district = district;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBestTime() {
		return bestTime;
	}
	public void setBestTime(String bestTime) {
		this.bestTime = bestTime;
	}
	public String getSignBuilding() {
		return signBuilding;
	}
	public void setSignBuilding(String signBuilding) {
		this.signBuilding = signBuilding;
	}
	public String getPostscript() {
		return postscript;
	}
	public void setPostscript(String postscript) {
		this.postscript = postscript;
	}
	public Integer getShippingId() {
		return shippingId;
	}
	public void setShippingId(Integer shippingId) {
		this.shippingId = shippingId;
	}
	public String getShippingName() {
		return shippingName;
	}
	public void setShippingName(String shippingName) {
		this.shippingName = shippingName;
	}
	public Integer getPayId() {
		return payId;
	}
	public void setPayId(Integer payId) {
		this.payId = payId;
	}
	public String getPayName() {
		return payName;
	}
	public void setPayName(String payName) {
		this.payName = payName;
	}
	public String getHowOos() {
		return howOos;
	}
	public void setHowOos(String howOos) {
		this.howOos = howOos;
	}
	public String getHowSurplus() {
		return howSurplus;
	}
	public void setHowSurplus(String howSurplus) {
		this.howSurplus = howSurplus;
	}
	public String getPackName() {
		return packName;
	}
	public void setPackName(String packName) {
		this.packName = packName;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getCardMessage() {
		return cardMessage;
	}
	public void setCardMessage(String cardMessage) {
		this.cardMessage = cardMessage;
	}
	public String getInvPayee() {
		return invPayee;
	}
	public void setInvPayee(String invPayee) {
		this.invPayee = invPayee;
	}
	public String getInvContent() {
		return invContent;
	}
	public void setInvContent(String invContent) {
		this.invContent = invContent;
	}
	public Long getGoodsAmount() {
		return goodsAmount;
	}
	public void setGoodsAmount(Long goodsAmount) {
		this.goodsAmount = goodsAmount;
	}
	public Long getShippingFee() {
		return shippingFee;
	}
	public void setShippingFee(Long shippingFee) {
		this.shippingFee = shippingFee;
	}
	public Long getInsureFee() {
		return insureFee;
	}
	public void setInsureFee(Long insureFee) {
		this.insureFee = insureFee;
	}
	public Long getPayFee() {
		return payFee;
	}
	public void setPayFee(Long payFee) {
		this.payFee = payFee;
	}
	public Long getPackFee() {
		return packFee;
	}
	public void setPackFee(Long packFee) {
		this.packFee = packFee;
	}
	public Long getCardFee() {
		return cardFee;
	}
	public void setCardFee(Long cardFee) {
		this.cardFee = cardFee;
	}
	public Long getMoneyPaid() {
		return moneyPaid;
	}
	public void setMoneyPaid(Long moneyPaid) {
		this.moneyPaid = moneyPaid;
	}
	public Long getSurplus() {
		return surplus;
	}
	public void setSurplus(Long surplus) {
		this.surplus = surplus;
	}
	public Integer getIntegral() {
		return integral;
	}
	public void setIntegral(Integer integral) {
		this.integral = integral;
	}
	public Long getIntegralMoney() {
		return integralMoney;
	}
	public void setIntegralMoney(Long integralMoney) {
		this.integralMoney = integralMoney;
	}
	public Long getBonus() {
		return bonus;
	}
	public void setBonus(Long bonus) {
		this.bonus = bonus;
	}
	public Long getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(Long orderAmount) {
		this.orderAmount = orderAmount;
	}
	public Integer getFromAd() {
		return fromAd;
	}
	public void setFromAd(Integer fromAd) {
		this.fromAd = fromAd;
	}
	public String getReferer() {
		return referer;
	}
	public void setReferer(String referer) {
		this.referer = referer;
	}
	public Integer getAddTime() {
		return addTime;
	}
	public void setAddTime(Integer addTime) {
		this.addTime = addTime;
	}
	public Integer getConfirmTime() {
		return confirmTime;
	}
	public void setConfirmTime(Integer confirmTime) {
		this.confirmTime = confirmTime;
	}
	public Integer getPayTime() {
		return payTime;
	}
	public void setPayTime(Integer payTime) {
		this.payTime = payTime;
	}
	public Integer getShippingTime() {
		return shippingTime;
	}
	public void setShippingTime(Integer shippingTime) {
		this.shippingTime = shippingTime;
	}
	public Integer getPackId() {
		return packId;
	}
	public void setPackId(Integer packId) {
		this.packId = packId;
	}
	public Integer getCardId() {
		return cardId;
	}
	public void setCardId(Integer cardId) {
		this.cardId = cardId;
	}
	public Integer getBonusId() {
		return bonusId;
	}
	public void setBonusId(Integer bonusId) {
		this.bonusId = bonusId;
	}
	public String getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public String getExtensionCode() {
		return extensionCode;
	}
	public void setExtensionCode(String extensionCode) {
		this.extensionCode = extensionCode;
	}
	public Integer getExtensionId() {
		return extensionId;
	}
	public void setExtensionId(Integer extensionId) {
		this.extensionId = extensionId;
	}
	public String getToBuyer() {
		return toBuyer;
	}
	public void setToBuyer(String toBuyer) {
		this.toBuyer = toBuyer;
	}
	public String getPayNote() {
		return payNote;
	}
	public void setPayNote(String payNote) {
		this.payNote = payNote;
	}
	public Integer getAgencyId() {
		return agencyId;
	}
	public void setAgencyId(Integer agencyId) {
		this.agencyId = agencyId;
	}
	public String getInvType() {
		return invType;
	}
	public void setInvType(String invType) {
		this.invType = invType;
	}
	public Long getTax() {
		return tax;
	}
	public void setTax(Long tax) {
		this.tax = tax;
	}
	public Boolean getIsSeparate() {
		return isSeparate;
	}
	public void setIsSeparate(Boolean isSeparate) {
		this.isSeparate = isSeparate;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public Long getDiscount() {
		return discount;
	}
	public void setDiscount(Long discount) {
		this.discount = discount;
	}
	public String getGameNickname() {
		return gameNickname;
	}
	public void setGameNickname(String gameNickname) {
		this.gameNickname = gameNickname;
	}
	public String getGameLevel() {
		return gameLevel;
	}
	public void setGameLevel(String gameLevel) {
		this.gameLevel = gameLevel;
	}
	public String getGameJueseid() {
		return gameJueseid;
	}
	public void setGameJueseid(String gameJueseid) {
		this.gameJueseid = gameJueseid;
	}
	public String getGameZhiye() {
		return gameZhiye;
	}
	public void setGameZhiye(String gameZhiye) {
		this.gameZhiye = gameZhiye;
	}
	
}