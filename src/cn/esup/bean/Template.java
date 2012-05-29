package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
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
	
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getLibrary() {
		return library;
	}
	public void setLibrary(String library) {
		this.library = library;
	}
	public Boolean getSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(Boolean sortOrder) {
		this.sortOrder = sortOrder;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Boolean getNumber() {
		return number;
	}
	public void setNumber(Boolean number) {
		this.number = number;
	}
	public Boolean getType() {
		return type;
	}
	public void setType(Boolean type) {
		this.type = type;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
}