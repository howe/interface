package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_users")
public class Users {

	/**
	 * 
	 */
	@Id
	@Column("user_id")
	private Integer userId;
	/**
	 * 
	 */
	@Column("email")
	private String email;
	/**
	 * 
	 */
	@Column("user_name")
	private String userName;
	/**
	 * 
	 */
	@Column("password")
	private String password;
	/**
	 * 
	 */
	@Column("question")
	private String question;
	/**
	 * 
	 */
	@Column("answer")
	private String answer;
	/**
	 * 
	 */
	@Column("sex")
	private Boolean sex;
	/**
	 * 
	 */
	@Column("birthday")
	private java.util.Date birthday;
	/**
	 * 
	 */
	@Column("user_money")
	private Long userMoney;
	/**
	 * 
	 */
	@Column("frozen_money")
	private Long frozenMoney;
	/**
	 * 
	 */
	@Column("pay_points")
	private Integer payPoints;
	/**
	 * 
	 */
	@Column("rank_points")
	private Integer rankPoints;
	/**
	 * 
	 */
	@Column("address_id")
	private Integer addressId;
	/**
	 * 
	 */
	@Column("reg_time")
	private Integer regTime;
	/**
	 * 
	 */
	@Column("last_login")
	private Integer lastLogin;
	/**
	 * 
	 */
	@Column("last_time")
	private java.util.Date lastTime;
	/**
	 * 
	 */
	@Column("last_ip")
	private String lastIp;
	/**
	 * 
	 */
	@Column("visit_count")
	private Integer visitCount;
	/**
	 * 
	 */
	@Column("user_rank")
	private Integer userRank;
	/**
	 * 
	 */
	@Column("is_special")
	private Integer isSpecial;
	/**
	 * 
	 */
	@Column("ec_salt")
	private String ecSalt;
	/**
	 * 
	 */
	@Column("salt")
	private String salt;
	/**
	 * 
	 */
	@Column("parent_id")
	private Integer parentId;
	/**
	 * 
	 */
	@Column("flag")
	private Integer flag;
	/**
	 * 
	 */
	@Column("alias")
	private String alias;
	/**
	 * 
	 */
	@Column("msn")
	private String msn;
	/**
	 * 
	 */
	@Column("qq")
	private String qq;
	/**
	 * 
	 */
	@Column("office_phone")
	private String officePhone;
	/**
	 * 
	 */
	@Column("home_phone")
	private String homePhone;
	/**
	 * 
	 */
	@Column("mobile_phone")
	private String mobilePhone;
	/**
	 * 
	 */
	@Column("is_validated")
	private Integer isValidated;
	/**
	 * 
	 */
	@Column("credit_line")
	private Long creditLine;
	/**
	 * 
	 */
	@Column("passwd_question")
	private String passwdQuestion;
	/**
	 * 
	 */
	@Column("passwd_answer")
	private String passwdAnswer;
}