package com.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_sessions_data")
@PK({"sesskey"})
public class SessionsData {

	/**
	 * 
	 */
	@Name
	@Column("sesskey")
	private String sesskey;
	/**
	 * 
	 */
	@Column("expiry")
	private Integer expiry;
	/**
	 * 
	 */
	@Column("data")
	private String data;
	public String getSesskey() {
		return sesskey;
	}
	public void setSesskey(String sesskey) {
		this.sesskey = sesskey;
	}
	public Integer getExpiry() {
		return expiry;
	}
	public void setExpiry(Integer expiry) {
		this.expiry = expiry;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
}