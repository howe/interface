package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_stats")
public class Stats {

	/**
	 * 
	 */
	@Column("access_time")
	private Integer accessTime;
	/**
	 * 
	 */
	@Column("ip_address")
	private String ipAddress;
	/**
	 * 
	 */
	@Column("visit_times")
	private Integer visitTimes;
	/**
	 * 
	 */
	@Column("browser")
	private String browser;
	/**
	 * 
	 */
	@Column("system")
	private String system;
	/**
	 * 
	 */
	@Column("language")
	private String language;
	/**
	 * 
	 */
	@Column("area")
	private String area;
	/**
	 * 
	 */
	@Column("referer_domain")
	private String refererDomain;
	/**
	 * 
	 */
	@Column("referer_path")
	private String refererPath;
	/**
	 * 
	 */
	@Column("access_url")
	private String accessUrl;
}