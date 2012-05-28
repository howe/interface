package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_user_rank")
public class UserRank {

	/**
	 * 
	 */
	@Column("rank_id")
	private Integer rankId;
	/**
	 * 
	 */
	@Column("rank_name")
	private String rankName;
	/**
	 * 
	 */
	@Column("min_points")
	private Integer minPoints;
	/**
	 * 
	 */
	@Column("max_points")
	private Integer maxPoints;
	/**
	 * 
	 */
	@Column("discount")
	private Integer discount;
	/**
	 * 
	 */
	@Column("show_price")
	private Boolean showPrice;
	/**
	 * 
	 */
	@Column("special_rank")
	private Boolean specialRank;
}