package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_vote_log")
public class VoteLog {

	/**
	 * 
	 */
	@Id
	@Column("log_id")
	private Integer logId;
	/**
	 * 
	 */
	@Column("vote_id")
	private Integer voteId;
	/**
	 * 
	 */
	@Column("ip_address")
	private String ipAddress;
	/**
	 * 
	 */
	@Column("vote_time")
	private Integer voteTime;
}