package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_admin_message")
@PK({"messageId"})
public class AdminMessage {

	/**
	 * 
	 */
	@Column("message_id")
	private Integer messageId;
	/**
	 * 
	 */
	@Column("sender_id")
	private Integer senderId;
	/**
	 * 
	 */
	@Column("receiver_id")
	private Integer receiverId;
	/**
	 * 
	 */
	@Column("sent_time")
	private Integer sentTime;
	/**
	 * 
	 */
	@Column("read_time")
	private Integer readTime;
	/**
	 * 
	 */
	@Column("readed")
	private Boolean readed;
	/**
	 * 
	 */
	@Column("deleted")
	private Boolean deleted;
	/**
	 * 
	 */
	@Column("title")
	private String title;
	/**
	 * 
	 */
	@Column("message")
	private String message;
	
	public Integer getMessageId() {
		return messageId;
	}
	public void setMessageId(Integer messageId) {
		this.messageId = messageId;
	}
	public Integer getSenderId() {
		return senderId;
	}
	public void setSenderId(Integer senderId) {
		this.senderId = senderId;
	}
	public Integer getReceiverId() {
		return receiverId;
	}
	public void setReceiverId(Integer receiverId) {
		this.receiverId = receiverId;
	}
	public Integer getSentTime() {
		return sentTime;
	}
	public void setSentTime(Integer sentTime) {
		this.sentTime = sentTime;
	}
	public Integer getReadTime() {
		return readTime;
	}
	public void setReadTime(Integer readTime) {
		this.readTime = readTime;
	}
	public Boolean getReaded() {
		return readed;
	}
	public void setReaded(Boolean readed) {
		this.readed = readed;
	}
	public Boolean getDeleted() {
		return deleted;
	}
	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}