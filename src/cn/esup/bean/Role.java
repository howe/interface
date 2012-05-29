package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_role")
@PK({"roleId"})
public class Role {

	/**
	 * 
	 */
	@Column("role_id")
	private Integer roleId;
	/**
	 * 
	 */
	@Column("role_name")
	private String roleName;
	/**
	 * 
	 */
	@Column("action_list")
	private String actionList;
	/**
	 * 
	 */
	@Column("role_describe")
	private String roleDescribe;
	
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getActionList() {
		return actionList;
	}
	public void setActionList(String actionList) {
		this.actionList = actionList;
	}
	public String getRoleDescribe() {
		return roleDescribe;
	}
	public void setRoleDescribe(String roleDescribe) {
		this.roleDescribe = roleDescribe;
	}
	
}