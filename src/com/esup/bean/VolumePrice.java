package com.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_volume_price")
@PK({"priceType", "goodsId", "volumeNumber"})
public class VolumePrice {

	/**
	 * 
	 */
	@Column("price_type")
	private Boolean priceType;
	/**
	 * 
	 */
	@Column("goods_id")
	private Integer goodsId;
	/**
	 * 
	 */
	@Column("volume_number")
	private Integer volumeNumber;
	/**
	 * 
	 */
	@Column("volume_price")
	private Long volumePrice;
	
	public Boolean getPriceType() {
		return priceType;
	}
	public void setPriceType(Boolean priceType) {
		this.priceType = priceType;
	}
	public Integer getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}
	public Integer getVolumeNumber() {
		return volumeNumber;
	}
	public void setVolumeNumber(Integer volumeNumber) {
		this.volumeNumber = volumeNumber;
	}
	public Long getVolumePrice() {
		return volumePrice;
	}
	public void setVolumePrice(Long volumePrice) {
		this.volumePrice = volumePrice;
	}
	
}