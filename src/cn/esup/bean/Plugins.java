package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_plugins")
@PK({"code"})
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
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getLibrary() {
		return library;
	}
	public void setLibrary(String library) {
		this.library = library;
	}
	public Boolean getAssign() {
		return assign;
	}
	public void setAssign(Boolean assign) {
		this.assign = assign;
	}
	public Integer getInstallDate() {
		return installDate;
	}
	public void setInstallDate(Integer installDate) {
		this.installDate = installDate;
	}
	
}