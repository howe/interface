package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_sessions_data")
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
}