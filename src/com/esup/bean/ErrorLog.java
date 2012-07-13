package com.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_error_log")
@PK({"id"})
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
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public Integer getTime() {
		return time;
	}
	public void setTime(Integer time) {
		this.time = time;
	}
	
}