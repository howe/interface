package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_sessions")
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
}