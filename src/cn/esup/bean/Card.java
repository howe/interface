package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_card")
@PK({"cardId"})
public class Card {

	/**
	 * 
	 */
	@Column("card_id")
	private Integer cardId;
	/**
	 * 
	 */
	@Column("card_name")
	private String cardName;
	/**
	 * 
	 */
	@Column("card_img")
	private String cardImg;
	/**
	 * 
	 */
	@Column("card_fee")
	private Long cardFee;
	/**
	 * 
	 */
	@Column("free_money")
	private Long freeMoney;
	/**
	 * 
	 */
	@Column("card_desc")
	private String cardDesc;
	
	public Integer getCardId() {
		return cardId;
	}
	public void setCardId(Integer cardId) {
		this.cardId = cardId;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getCardImg() {
		return cardImg;
	}
	public void setCardImg(String cardImg) {
		this.cardImg = cardImg;
	}
	public Long getCardFee() {
		return cardFee;
	}
	public void setCardFee(Long cardFee) {
		this.cardFee = cardFee;
	}
	public Long getFreeMoney() {
		return freeMoney;
	}
	public void setFreeMoney(Long freeMoney) {
		this.freeMoney = freeMoney;
	}
	public String getCardDesc() {
		return cardDesc;
	}
	public void setCardDesc(String cardDesc) {
		this.cardDesc = cardDesc;
	}
	
}