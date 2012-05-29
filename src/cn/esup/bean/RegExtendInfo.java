package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_reg_extend_info")
@PK({"id"})
public class RegExtendInfo {

	/**
	 * 
	 */
	@Id
	@Column("Id")
	private Integer id;
	/**
	 * 
	 */
	@Column("user_id")
	private Integer userId;
	/**
	 * 
	 */
	@Column("reg_field_id")
	private Integer regFieldId;
	/**
	 * 
	 */
	@Column("content")
	private String content;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getRegFieldId() {
		return regFieldId;
	}
	public void setRegFieldId(Integer regFieldId) {
		this.regFieldId = regFieldId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}