package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_email_sendlist")
public class EmailSendlist {

	/**
	 * 
	 */
	@Id
	@Column("id")
	private Integer id;
	/**
	 * 
	 */
	@Column("email")
	private String email;
	/**
	 * 
	 */
	@Column("template_id")
	private Integer templateId;
	/**
	 * 
	 */
	@Column("email_content")
	private String emailContent;
	/**
	 * 
	 */
	@Column("error")
	private Boolean error;
	/**
	 * 
	 */
	@Column("pri")
	private Integer pri;
	/**
	 * 
	 */
	@Column("last_send")
	private Integer lastSend;
}