package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_exchange_goods")
public class ExchangeGoods {

	/**
	 * 
	 */
	@Id
	@Column("goods_id")
	private Integer goodsId;
	/**
	 * 
	 */
	@Column("exchange_integral")
	private Integer exchangeIntegral;
	/**
	 * 
	 */
	@Column("is_exchange")
	private Boolean isExchange;
	/**
	 * 
	 */
	@Column("is_hot")
	private Boolean isHot;
}