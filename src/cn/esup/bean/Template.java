package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_template")
public class Template {

	/**
	 * 
	 */
	@Column("filename")
	private String filename;
	/**
	 * 
	 */
	@Column("region")
	private String region;
	/**
	 * 
	 */
	@Column("library")
	private String library;
	/**
	 * 
	 */
	@Column("sort_order")
	private Boolean sortOrder;
	/**
	 * 
	 */
	@Column("id")
	private Integer id;
	/**
	 * 
	 */
	@Column("number")
	private Boolean number;
	/**
	 * 
	 */
	@Column("type")
	private Boolean type;
	/**
	 * 
	 */
	@Column("theme")
	private String theme;
	/**
	 * 
	 */
	@Column("remarks")
	private String remarks;
}