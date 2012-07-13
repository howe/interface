package com.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 管理员用户表
*/
@Table("es_admin_user")
@PK({"userId"})
public class AdminUser {

	/**
	 * 自增id号,管理员代码
	 */
	@Column("user_id")
	private Integer userId;
	
	/**
	 * 管理员登录名
	 */
	@Column("user_name")
	private String userName;
	
	/**
	 * 管理员邮箱
	 */
	@Column("email")
	private String email;
	
	/**
	 * 管理员登录密码
	 */
	@Column("password")
	private String password;
	
	/**
	 * 散列值（6位随机数）
	 */
	@Column("ec_salt")
	private String ecSalt;
	
	/**
	 * 管理员添加时间
	 */
	@Column("add_time")
	private Integer addTime;
	
	/**
	 * 管理员最后一次登录时间
	 */
	@Column("last_login")
	private Integer lastLogin;
	
	/**
	 * 管理员最后一次登录IP
	 */
	@Column("last_ip")
	private String lastIp;
	
	/**
	 * 管理员管理权限列表
	 */
	@Column("action_list")
	private String actionList;
	
	/**
	 * 管理员导航栏配置项
	 */
	@Column("nav_list")
	private String navList;
	
	/**
	 * 语言类型
	 */
	@Column("lang_type")
	private String langType;
	
	/**
	 * 该管理员负责的办事处理的id,同ecs_agency的agency_id字段.如果管理员没有负责办事处,则此处为0
	 */
	@Column("agency_id")
	private Integer agencyId;
	
	/**
	 * 供应商编号
	 */
	@Column("suppliers_id")
	private Integer suppliersId;
	
	/**
	 * 记事本记录的数据
	 */
	@Column("todolist")
	private String todolist;
	
	/**
	 * 登录用户的角色编号
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