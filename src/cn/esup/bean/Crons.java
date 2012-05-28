package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_crons")
public class Crons {

	/**
	 * 
	 */
	@Column("cron_id")
	private Integer cronId;
	/**
	 * 
	 */
	@Column("cron_code")
	private String cronCode;
	/**
	 * 
	 */
	@Column("cron_name")
	private String cronName;
	/**
	 * 
	 */
	@Column("cron_desc")
	private String cronDesc;
	/**
	 * 
	 */
	@Column("cron_order")
	private Integer cronOrder;
	/**
	 * 
	 */
	@Column("cron_config")
	private String cronConfig;
	/**
	 * 
	 */
	@Column("thistime")
	private Integer thistime;
	/**
	 * 
	 */
	@Column("nextime")
	private Integer nextime;
	/**
	 * 
	 */
	@Column("day")
	private Integer day;
	/**
	 * 
	 */
	@Column("week")
	private String week;
	/**
	 * 
	 */
	@Column("hour")
	private String hour;
	/**
	 * 
	 */
	@Column("minute")
	private String minute;
	/**
	 * 
	 */
	@Column("enable")
	private Boolean enable;
	/**
	 * 
	 */
	@Column("run_once")
	private Boolean runOnce;
	/**
	 * 
	 */
	@Column("allow_ip")
	private String allowIp;
	/**
	 * 
	 */
	@Column("alow_files")
	private String alowFiles;
}