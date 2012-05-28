package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_user_bonus")
public class UserBonus {

	/**
	 * 
	 */
	@Id
	@Column("bonus_id")
	private Integer bonusId;
	/**
	 * 
	 */
	@Column("bonus_type_id")
	private Integer bonusTypeId;
	/**
	 * 
	 */
	@Column("bonus_sn")
	private Long bonusSn;
	/**
	 * 
	 */
	@Column("user_id")
	private Integer userId;
	/**
	 * 
	 */
	@Column("used_time")
	private Integer usedTime;
	/**
	 * 
	 */
	@Column("order_id")
	private Integer orderId;
	/**
	 * 
	 */
	@Column("emailed")
	private Integer emailed;
}