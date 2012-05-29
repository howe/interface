package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_mail_templates")
@PK({"templateId"})
public class MailTemplates {

	/**
	 * 
	 */
	@Column("template_id")
	private Boolean templateId;
	/**
	 * 
	 */
	@Column("template_code")
	private String templateCode;
	/**
	 * 
	 */
	@Column("is_html")
	private Boolean isHtml;
	/**
	 * 
	 */
	@Column("template_subject")
	private String templateSubject;
	/**
	 * 
	 */
	@Column("template_content")
	private String templateContent;
	/**
	 * 
	 */
	@Column("last_modify")
	private Integer lastModify;
	/**
	 * 
	 */
	@Column("last_send")
	private Integer lastSend;
	/**
	 * 
	 */
	@Column("type")
	private String type;
	
	public Boolean getTemplateId() {
		return templateId;
	}
	public void setTemplateId(Boolean templateId) {
		this.templateId = templateId;
	}
	public String getTemplateCode() {
		return templateCode;
	}
	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}
	public Boolean getIsHtml() {
		return isHtml;
	}
	public void setIsHtml(Boolean isHtml) {
		this.isHtml = isHtml;
	}
	public String getTemplateSubject() {
		return templateSubject;
	}
	public void setTemplateSubject(String templateSubject) {
		this.templateSubject = templateSubject;
	}
	public String getTemplateContent() {
		return templateContent;
	}
	public void setTemplateContent(String templateContent) {
		this.templateContent = templateContent;
	}
	public Integer getLastModify() {
		return lastModify;
	}
	public void setLastModify(Integer lastModify) {
		this.lastModify = lastModify;
	}
	public Integer getLastSend() {
		return lastSend;
	}
	public void setLastSend(Integer lastSend) {
		this.lastSend = lastSend;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}