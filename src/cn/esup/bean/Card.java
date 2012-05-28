package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_card")
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
}