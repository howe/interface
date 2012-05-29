package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_member_price")
@PK({"priceId"})
public class MemberPrice {

	/**
	 * 
	 */
	@Id
	@Column("price_id")
	private Integer priceId;
	/**
	 * 
	 */
	@Column("goods_id")
	private Integer goodsId;
	/**
	 * 
	 */
	@Column("user_rank")
	private Integer userRank;
	/**
	 * 
	 */
	@Column("user_price")
	private Long userPrice;
	public Integer getPriceId() {
		return priceId;
	}
	public void setPriceId(Integer priceId) {
		this.priceId = priceId;
	}
	public Integer getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}
	public Integer getUserRank() {
		return userRank;
	}
	public void setUserRank(Integer userRank) {
		this.userRank = userRank;
	}
	public Long getUserPrice() {
		return userPrice;
	}
	public void setUserPrice(Long userPrice) {
		this.userPrice = userPrice;
	}
	
}