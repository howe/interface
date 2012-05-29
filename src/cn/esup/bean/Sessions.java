package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_sessions")
@PK({"sesskey"})
public class Sessions {

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
	@Column("userid")
	private Integer userid;
	/**
	 * 
	 */
	@Column("adminid")
	private Integer adminid;
	/**
	 * 
	 */
	@Column("ip")
	private String ip;
	/**
	 * 
	 */
	@Column("user_name")
	private String userName;
	/**
	 * 
	 */
	@Column("user_rank")
	private Integer userRank;
	/**
	 * 
	 */
	@Column("discount")
	private Long discount;
	/**
	 * 
	 */
	@Column("email")
	private String email;
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
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public Integer getAdminid() {
		return adminid;
	}
	public void setAdminid(Integer adminid) {
		this.adminid = adminid;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getUserRank() {
		return userRank;
	}
	public void setUserRank(Integer userRank) {
		this.userRank = userRank;
	}
	public Long getDiscount() {
		return discount;
	}
	public void setDiscount(Long discount) {
		this.discount = discount;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
}