package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_vote")
@PK({"voteId"})
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
	
	public Integer getVoteId() {
		return voteId;
	}
	public void setVoteId(Integer voteId) {
		this.voteId = voteId;
	}
	public String getVoteName() {
		return voteName;
	}
	public void setVoteName(String voteName) {
		this.voteName = voteName;
	}
	public Integer getStartTime() {
		return startTime;
	}
	public void setStartTime(Integer startTime) {
		this.startTime = startTime;
	}
	public Integer getEndTime() {
		return endTime;
	}
	public void setEndTime(Integer endTime) {
		this.endTime = endTime;
	}
	public Boolean getCanMulti() {
		return canMulti;
	}
	public void setCanMulti(Boolean canMulti) {
		this.canMulti = canMulti;
	}
	public Integer getVoteCount() {
		return voteCount;
	}
	public void setVoteCount(Integer voteCount) {
		this.voteCount = voteCount;
	}
	
}