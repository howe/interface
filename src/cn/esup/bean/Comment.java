package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_comment")
@PK({"commentId"})
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
	
	public Integer getCommentId() {
		return commentId;
	}
	public void setCommentId(Integer commentId) {
		this.commentId = commentId;
	}
	public Integer getCommentType() {
		return commentType;
	}
	public void setCommentType(Integer commentType) {
		this.commentType = commentType;
	}
	public Integer getIdValue() {
		return idValue;
	}
	public void setIdValue(Integer idValue) {
		this.idValue = idValue;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Boolean getCommentRank() {
		return commentRank;
	}
	public void setCommentRank(Boolean commentRank) {
		this.commentRank = commentRank;
	}
	public Integer getAddTime() {
		return addTime;
	}
	public void setAddTime(Integer addTime) {
		this.addTime = addTime;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
}