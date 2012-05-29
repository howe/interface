package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_user_feed")
@PK({"feedId"})
public class UserFeed {

	/**
	 * 
	 */
	@Id
	@Column("feed_id")
	private Integer feedId;
	/**
	 * 
	 */
	@Column("user_id")
	private Integer userId;
	/**
	 * 
	 */
	@Column("value_id")
	private Integer valueId;
	/**
	 * 
	 */
	@Column("goods_id")
	private Integer goodsId;
	/**
	 * 
	 */
	@Column("feed_type")
	private Boolean feedType;
	/**
	 * 
	 */
	@Column("is_feed")
	private Boolean isFeed;
	
	public Integer getFeedId() {
		return feedId;
	}
	public void setFeedId(Integer feedId) {
		this.feedId = feedId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getValueId() {
		return valueId;
	}
	public void setValueId(Integer valueId) {
		this.valueId = valueId;
	}
	public Integer getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}
	public Boolean getFeedType() {
		return feedType;
	}
	public void setFeedType(Boolean feedType) {
		this.feedType = feedType;
	}
	public Boolean getIsFeed() {
		return isFeed;
	}
	public void setIsFeed(Boolean isFeed) {
		this.isFeed = isFeed;
	}
	
}