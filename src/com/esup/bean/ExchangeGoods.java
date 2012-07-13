package com.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_exchange_goods")
@PK({"goodsId"})
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
	
	public Integer getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}
	public Integer getExchangeIntegral() {
		return exchangeIntegral;
	}
	public void setExchangeIntegral(Integer exchangeIntegral) {
		this.exchangeIntegral = exchangeIntegral;
	}
	public Boolean getIsExchange() {
		return isExchange;
	}
	public void setIsExchange(Boolean isExchange) {
		this.isExchange = isExchange;
	}
	public Boolean getIsHot() {
		return isHot;
	}
	public void setIsHot(Boolean isHot) {
		this.isHot = isHot;
	}
	
}