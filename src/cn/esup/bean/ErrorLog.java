package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_error_log")
public class ErrorLog {

	/**
	 * 
	 */
	@Id
	@Column("id")
	private Integer id;
	/**
	 * 
	 */
	@Column("info")
	private String info;
	/**
	 * 
	 */
	@Column("file")
	private String file;
	/**
	 * 
	 */
	@Column("time")
	private Integer time;
}