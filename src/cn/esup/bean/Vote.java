package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_vote")
public class Vote {

	/**
	 * 
	 */
	@Column("vote_id")
	private Integer voteId;
	/**
	 * 
	 */
	@Column("vote_name")
	private String voteName;
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
	@Column("can_multi")
	private Boolean canMulti;
	/**
	 * 
	 */
	@Column("vote_count")
	private Integer voteCount;
}