package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 虚拟卡信息表
*/
@Table("es_virtual_card")
@PK({"cardId"})
public class VirtualCard {

	/**
	 * 虚拟卡卡号自增id
	 */
	@Id
	@Column("card_id")
	private Integer cardId;
	
	/**
	 * 该虚拟卡对应的商品id，取值于表es_goods
	 */
	@Column("goods_id")
	private Integer goodsId;
	
	/**
	 * 加密后的卡号
	 */
	@Column("card_sn")
	private String cardSn;
	
	/**
	 * 加密后的密码
	 */
	@Column("card_password")
	private String cardPassword;
	
	/**
	 * 充值链接
	 */
	@Column("card_url")
	private String cardUrl;
	
	/**
	 * 虚拟卡添加日期
	 */
	@Column("add_date")
	private Integer addDate;
	
	/**
	 * 虚拟卡截至使用日期
	 */
	@Column("end_date")
	private Integer endDate;
	
	/**
	 * 是否卖出，0，否；1，是
	 */
	@Column("is_saled")
	private Boolean isSaled;
	
	/**
	 * 卖出该卡号的交易号，取值表es_order_info
	 */
	@Column("order_sn")
	private String orderSn;
	
	/**
	 * crc32后的key
	 */
	@Column("crc32")
	private String crc32;
	
	public Integer getCardId() {
		return cardId;
	}
	public void setCardId(Integer cardId) {
		this.cardId = cardId;
	}
	public Integer getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}
	public String getCardSn() {
		return cardSn;
	}
	public void setCardSn(String cardSn) {
		this.cardSn = cardSn;
	}
	public String getCardPassword() {
		return cardPassword;
	}
	public void setCardPassword(String cardPassword) {
		this.cardPassword = cardPassword;
	}
	public String getCardUrl() {
		return cardUrl;
	}
	public void setCardUrl(String cardUrl) {
		this.cardUrl = cardUrl;
	}
	public Integer getAddDate() {
		return addDate;
	}
	public void setAddDate(Integer addDate) {
		this.addDate = addDate;
	}
	public Integer getEndDate() {
		return endDate;
	}
	public void setEndDate(Integer endDate) {
		this.endDate = endDate;
	}
	public Boolean getIsSaled() {
		return isSaled;
	}
	public void setIsSaled(Boolean isSaled) {
		this.isSaled = isSaled;
	}
	public String getOrderSn() {
		return orderSn;
	}
	public void setOrderSn(String orderSn) {
		this.orderSn = orderSn;
	}
	public String getCrc32() {
		return crc32;
	}
	public void setCrc32(String crc32) {
		this.crc32 = crc32;
	}
	
}