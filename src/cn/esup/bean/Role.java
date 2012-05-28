package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_role")
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
}