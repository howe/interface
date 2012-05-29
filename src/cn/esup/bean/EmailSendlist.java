package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_email_sendlist")
@PK({"id"})
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
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getTemplateId() {
		return templateId;
	}
	public void setTemplateId(Integer templateId) {
		this.templateId = templateId;
	}
	public String getEmailContent() {
		return emailContent;
	}
	public void setEmailContent(String emailContent) {
		this.emailContent = emailContent;
	}
	public Boolean getError() {
		return error;
	}
	public void setError(Boolean error) {
		this.error = error;
	}
	public Integer getPri() {
		return pri;
	}
	public void setPri(Integer pri) {
		this.pri = pri;
	}
	public Integer getLastSend() {
		return lastSend;
	}
	public void setLastSend(Integer lastSend) {
		this.lastSend = lastSend;
	}
	
}