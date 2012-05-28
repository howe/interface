package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_member_price")
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
}