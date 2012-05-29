package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_feedback")
@PK({"msgId"})
public class Feedback {

	/**
	 * 
	 */
	@Id
	@Column("msg_id")
	private Integer msgId;
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
	/**
	 * 
	 */
	@Column("user_name")
	private String userName;
	/**
	 * 
	 */
	@Column("user_email")
	private String userEmail;
	/**
	 * 
	 */
	@Column("msg_title")
	private String msgTitle;
	/**
	 * 
	 */
	@Column("msg_type")
	private Boolean msgType;
	/**
	 * 
	 */
	@Column("msg_status")
	private Boolean msgStatus;
	/**
	 * 
	 */
	@Column("msg_content")
	private String msgContent;
	/**
	 * 
	 */
	@Column("msg_time")
	private Integer msgTime;
	/**
	 * 
	 */
	@Column("message_img")
	private String messageImg;
	/**
	 * 
	 */
	@Column("order_id")
	private Integer orderId;
	/**
	 * 
	 */
	@Column("msg_area")
	private Boolean msgArea;
	
	public Integer getMsgId() {
		return msgId;
	}
	public void setMsgId(Integer msgId) {
		this.msgId = msgId;
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getMsgTitle() {
		return msgTitle;
	}
	public void setMsgTitle(String msgTitle) {
		this.msgTitle = msgTitle;
	}
	public Boolean getMsgType() {
		return msgType;
	}
	public void setMsgType(Boolean msgType) {
		this.msgType = msgType;
	}
	public Boolean getMsgStatus() {
		return msgStatus;
	}
	public void setMsgStatus(Boolean msgStatus) {
		this.msgStatus = msgStatus;
	}
	public String getMsgContent() {
		return msgContent;
	}
	public void setMsgContent(String msgContent) {
		this.msgContent = msgContent;
	}
	public Integer getMsgTime() {
		return msgTime;
	}
	public void setMsgTime(Integer msgTime) {
		this.msgTime = msgTime;
	}
	public String getMessageImg() {
		return messageImg;
	}
	public void setMessageImg(String messageImg) {
		this.messageImg = messageImg;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Boolean getMsgArea() {
		return msgArea;
	}
	public void setMsgArea(Boolean msgArea) {
		this.msgArea = msgArea;
	}
	
}