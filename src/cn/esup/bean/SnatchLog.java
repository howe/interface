package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_snatch_log")
public class SnatchLog {

	/**
	 * 
	 */
	@Id
	@Column("log_id")
	private Integer logId;
	/**
	 * 
	 */
	@Column("snatch_id")
	private Integer snatchId;
	/**
	 * 
	 */
	@Column("user_id")
	private Integer userId;
	/**
	 * 
	 */
	@Column("bid_price")
	private Long bidPrice;
	/**
	 * 
	 */
	@Column("bid_time")
	private Integer bidTime;
}