package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_favourable_activity")
public class FavourableActivity {

	/**
	 * 
	 */
	@Column("act_id")
	private Integer actId;
	/**
	 * 
	 */
	@Column("act_name")
	private String actName;
	/**
	 * 
	 */
	@Column("start_time")
	private Integer startTime;
	/**
	 * 
	 */
	@Column("end_time")
	private Integer endTime;
	/**
	 * 
	 */
	@Column("user_rank")
	private String userRank;
	/**
	 * 
	 */
	@Column("act_range")
	private Integer actRange;
	/**
	 * 
	 */
	@Column("act_range_ext")
	private String actRangeExt;
	/**
	 * 
	 */
	@Column("min_amount")
	private Long minAmount;
	/**
	 * 
	 */
	@Column("max_amount")
	private Long maxAmount;
	/**
	 * 
	 */
	@Column("act_type")
	private Integer actType;
	/**
	 * 
	 */
	@Column("act_type_ext")
	private Long actTypeExt;
	/**
	 * 
	 */
	@Column("gift")
	private String gift;
	/**
	 * 
	 */
	@Column("sort_order")
	private Integer sortOrder;
}