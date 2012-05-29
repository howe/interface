package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_vote_log")
@PK({"logId"})
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
	
	public Integer getLogId() {
		return logId;
	}
	public void setLogId(Integer logId) {
		this.logId = logId;
	}
	public Integer getVoteId() {
		return voteId;
	}
	public void setVoteId(Integer voteId) {
		this.voteId = voteId;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public Integer getVoteTime() {
		return voteTime;
	}
	public void setVoteTime(Integer voteTime) {
		this.voteTime = voteTime;
	}
	
}