package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_admin_user")
@PK({"userId"})
public class AdminUser {

	/**
	 * 
	 */
	@Column("user_id")
	private Integer userId;
	/**
	 * 
	 */
	@Column("user_name")
	private String userName;
	/**
	 * 
	 */
	@Column("email")
	private String email;
	/**
	 * 
	 */
	@Column("password")
	private String password;
	/**
	 * 
	 */
	@Column("ec_salt")
	private String ecSalt;
	/**
	 * 
	 */
	@Column("add_time")
	private Integer addTime;
	/**
	 * 
	 */
	@Column("last_login")
	private Integer lastLogin;
	/**
	 * 
	 */
	@Column("last_ip")
	private String lastIp;
	/**
	 * 
	 */
	@Column("action_list")
	private String actionList;
	/**
	 * 
	 */
	@Column("nav_list")
	private String navList;
	/**
	 * 
	 */
	@Column("lang_type")
	private String langType;
	/**
	 * 
	 */
	@Column("agency_id")
	private Integer agencyId;
	/**
	 * 
	 */
	@Column("suppliers_id")
	private Integer suppliersId;
	/**
	 * 
	 */
	@Column("todolist")
	private String todolist;
	/**
	 * 
	 */
	@Column("role_id")
	private Integer roleId;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEcSalt() {
		return ecSalt;
	}
	public void setEcSalt(String ecSalt) {
		this.ecSalt = ecSalt;
	}
	public Integer getAddTime() {
		return addTime;
	}
	public void setAddTime(Integer addTime) {
		this.addTime = addTime;
	}
	public Integer getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(Integer lastLogin) {
		this.lastLogin = lastLogin;
	}
	public String getLastIp() {
		return lastIp;
	}
	public void setLastIp(String lastIp) {
		this.lastIp = lastIp;
	}
	public String getActionList() {
		return actionList;
	}
	public void setActionList(String actionList) {
		this.actionList = actionList;
	}
	public String getNavList() {
		return navList;
	}
	public void setNavList(String navList) {
		this.navList = navList;
	}
	public String getLangType() {
		return langType;
	}
	public void setLangType(String langType) {
		this.langType = langType;
	}
	public Integer getAgencyId() {
		return agencyId;
	}
	public void setAgencyId(Integer agencyId) {
		this.agencyId = agencyId;
	}
	public Integer getSuppliersId() {
		return suppliersId;
	}
	public void setSuppliersId(Integer suppliersId) {
		this.suppliersId = suppliersId;
	}
	public String getTodolist() {
		return todolist;
	}
	public void setTodolist(String todolist) {
		this.todolist = todolist;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	
}