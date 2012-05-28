package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_collect_goods")
public class CollectGoods {

	/**
	 * 
	 */
	@Id
	@Column("rec_id")
	private Integer recId;
	/**
	 * 
	 */
	@Column("user_id")
	private Integer userId;
	/**
	 * 
	 */
	@Column("goods_id")
	private Integer goodsId;
	/**
	 * 
	 */
	@Column("add_time")
	private Integer addTime;
	/**
	 * 
	 */
	@Column("is_attention")
	private Boolean isAttention;
}