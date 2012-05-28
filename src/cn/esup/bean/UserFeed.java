package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_user_feed")
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
}