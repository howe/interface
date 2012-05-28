package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_virtual_card")
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
}