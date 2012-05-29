package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_virtual_card")
@PK({"cardId"})
public class VirtualCard {

	/**
	 * 
	 */
	@Id
	@Column("card_id")
	private Integer cardId;
	/**
	 * 
	 */
	@Column("goods_id")
	private Integer goodsId;
	/**
	 * 
	 */
	@Column("card_sn")
	private String cardSn;
	/**
	 * 
	 */
	@Column("card_password")
	private String cardPassword;
	/**
	 * 充值链接
	 */
	@Column("card_url")
	private String cardUrl;
	/**
	 * 
	 */
	@Column("add_date")
	private Integer addDate;
	/**
	 * 
	 */
	@Column("end_date")
	private Integer endDate;
	/**
	 * 
	 */
	@Column("is_saled")
	private Boolean isSaled;
	/**
	 * 
	 */
	@Column("order_sn")
	private String orderSn;
	/**
	 * 
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