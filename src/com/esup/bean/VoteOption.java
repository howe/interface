package com.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_vote_option")
@PK({"optionId"})
public class VoteOption {

	/**
	 * 
	 */
	@Column("option_id")
	private Integer optionId;
	/**
	 * 
	 */
	@Column("vote_id")
	private Integer voteId;
	/**
	 * 
	 */
	@Column("option_name")
	private String optionName;
	/**
	 * 
	 */
	@Column("option_count")
	private Integer optionCount;
	/**
	 * 
	 */
	@Column("option_order")
	private Integer optionOrder;
	
	public Integer getOptionId() {
		return optionId;
	}
	public void setOptionId(Integer optionId) {
		this.optionId = optionId;
	}
	public Integer getVoteId() {
		return voteId;
	}
	public void setVoteId(Integer voteId) {
		this.voteId = voteId;
	}
	public String getOptionName() {
		return optionName;
	}
	public void setOptionName(String optionName) {
		this.optionName = optionName;
	}
	public Integer getOptionCount() {
		return optionCount;
	}
	public void setOptionCount(Integer optionCount) {
		this.optionCount = optionCount;
	}
	public Integer getOptionOrder() {
		return optionOrder;
	}
	public void setOptionOrder(Integer optionOrder) {
		this.optionOrder = optionOrder;
	}
	
}