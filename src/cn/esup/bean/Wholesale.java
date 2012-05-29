package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_wholesale")
@PK({"actId"})
public class Wholesale {

	/**
	 * 
	 */
	@Id
	@Column("act_id")
	private Integer actId;
	/**
	 * 
	 */
	@Column("goods_id")
	private Integer goodsId;
	/**
	 * 
	 */
	@Column("goods_name")
	private String goodsName;
	/**
	 * 
	 */
	@Column("rank_ids")
	private String rankIds;
	/**
	 * 
	 */
	@Column("prices")
	private String prices;
	/**
	 * 
	 */
	@Column("enabled")
	private Integer enabled;
	
	public Integer getActId() {
		return actId;
	}
	public void setActId(Integer actId) {
		this.actId = actId;
	}
	public Integer getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getRankIds() {
		return rankIds;
	}
	public void setRankIds(String rankIds) {
		this.rankIds = rankIds;
	}
	public String getPrices() {
		return prices;
	}
	public void setPrices(String prices) {
		this.prices = prices;
	}
	public Integer getEnabled() {
		return enabled;
	}
	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}
	
}