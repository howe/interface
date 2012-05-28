package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_mail_templates")
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
}