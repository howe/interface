package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_wholesale")
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
}