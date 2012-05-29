package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
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
	
	public Integer getAccessTime() {
		return accessTime;
	}
	public void setAccessTime(Integer accessTime) {
		this.accessTime = accessTime;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public Integer getVisitTimes() {
		return visitTimes;
	}
	public void setVisitTimes(Integer visitTimes) {
		this.visitTimes = visitTimes;
	}
	public String getBrowser() {
		return browser;
	}
	public void setBrowser(String browser) {
		this.browser = browser;
	}
	public String getSystem() {
		return system;
	}
	public void setSystem(String system) {
		this.system = system;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getRefererDomain() {
		return refererDomain;
	}
	public void setRefererDomain(String refererDomain) {
		this.refererDomain = refererDomain;
	}
	public String getRefererPath() {
		return refererPath;
	}
	public void setRefererPath(String refererPath) {
		this.refererPath = refererPath;
	}
	public String getAccessUrl() {
		return accessUrl;
	}
	public void setAccessUrl(String accessUrl) {
		this.accessUrl = accessUrl;
	}
	
}