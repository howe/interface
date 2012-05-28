package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_feedback")
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
}