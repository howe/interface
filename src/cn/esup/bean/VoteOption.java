package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_vote_option")
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
}