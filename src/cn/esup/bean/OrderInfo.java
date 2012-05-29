package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_order_info")
@PK({"orderId"})
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