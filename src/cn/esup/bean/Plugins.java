package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_plugins")
public class Plugins {

	/**
	 * 
	 */
	@Name
	@Column("code")
	private String code;
	/**
	 * 
	 */
	@Column("version")
	private String version;
	/**
	 * 
	 */
	@Column("library")
	private String library;
	/**
	 * 
	 */
	@Column("assign")
	private Boolean assign;
	/**
	 * 
	 */
	@Column("install_date")
	private Integer installDate;
}