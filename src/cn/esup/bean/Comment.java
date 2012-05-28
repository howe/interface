package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_comment")
public class Comment {

	/**
	 * 
	 */
	@Id
	@Column("comment_id")
	private Integer commentId;
	/**
	 * 
	 */
	@Column("comment_type")
	private Integer commentType;
	/**
	 * 
	 */
	@Column("id_value")
	private Integer idValue;
	/**
	 * 
	 */
	@Column("email")
	private String email;
	/**
	 * 
	 */
	@Column("user_name")
	private String userName;
	/**
	 * 
	 */
	@Column("content")
	private String content;
	/**
	 * 
	 */
	@Column("comment_rank")
	private Boolean commentRank;
	/**
	 * 
	 */
	@Column("add_time")
	private Integer addTime;
	/**
	 * 
	 */
	@Column("ip_address")
	private String ipAddress;
	/**
	 * 
	 */
	@Column("status")
	private Integer status;
	/**
	 * 
	 */
	@Column("parent_id")
	private Integer parentId;
	/**
	 * 
	 */
	@Column("user_id")
	private Integer userId;
}