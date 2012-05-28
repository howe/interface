package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_reg_extend_info")
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
}