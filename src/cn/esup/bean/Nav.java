package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_nav")
@PK({"id"})
public class Nav {

	/**
	 * 
	 */
	@Id
	@Column("id")
	private Integer id;
	/**
	 * 
	 */
	@Column("ctype")
	private String ctype;
	/**
	 * 
	 */
	@Column("cid")
	private Integer cid;
	/**
	 * 
	 */
	@Column("name")
	private String name;
	/**
	 * 
	 */
	@Column("ifshow")
	private Boolean ifshow;
	/**
	 * 
	 */
	@Column("vieworder")
	private Boolean vieworder;
	/**
	 * 
	 */
	@Column("opennew")
	private Boolean opennew;
	/**
	 * 
	 */
	@Column("url")
	private String url;
	/**
	 * 
	 */
	@Column("type")
	private String type;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCtype() {
		return ctype;
	}
	public void setCtype(String ctype) {
		this.ctype = ctype;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getIfshow() {
		return ifshow;
	}
	public void setIfshow(Boolean ifshow) {
		this.ifshow = ifshow;
	}
	public Boolean getVieworder() {
		return vieworder;
	}
	public void setVieworder(Boolean vieworder) {
		this.vieworder = vieworder;
	}
	public Boolean getOpennew() {
		return opennew;
	}
	public void setOpennew(Boolean opennew) {
		this.opennew = opennew;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}