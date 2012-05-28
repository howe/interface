package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_user_account")
public class UserAccount {

	/**
	 * 
	 */
	@Id
	@Column("id")
	private Integer id;
	/**
	 * 
	 */
	@Column("user_id")
	private Integer userId;
	/**
	 * 
	 */
	@Column("admin_user")
	private String adminUser;
	/**
	 * 
	 */
	@Column("amount")
	private Long amount;
	/**
	 * 
	 */
	@Column("add_time")
	private Integer addTime;
	/**
	 * 
	 */
	@Column("paid_time")
	private Integer paidTime;
	/**
	 * 
	 */
	@Column("admin_note")
	private String adminNote;
	/**
	 * 
	 */
	@Column("user_note")
	private String userNote;
	/**
	 * 
	 */
	@Column("process_type")
	private Boolean processType;
	/**
	 * 
	 */
	@Column("payment")
	private String payment;
	/**
	 * 
	 */
	@Column("is_paid")
	private Boolean isPaid;
}