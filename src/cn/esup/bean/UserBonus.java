package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_user_bonus")
@PK({"bonusId"})
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
	
	public Integer getBonusId() {
		return bonusId;
	}
	public void setBonusId(Integer bonusId) {
		this.bonusId = bonusId;
	}
	public Integer getBonusTypeId() {
		return bonusTypeId;
	}
	public void setBonusTypeId(Integer bonusTypeId) {
		this.bonusTypeId = bonusTypeId;
	}
	public Long getBonusSn() {
		return bonusSn;
	}
	public void setBonusSn(Long bonusSn) {
		this.bonusSn = bonusSn;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getUsedTime() {
		return usedTime;
	}
	public void setUsedTime(Integer usedTime) {
		this.usedTime = usedTime;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Integer getEmailed() {
		return emailed;
	}
	public void setEmailed(Integer emailed) {
		this.emailed = emailed;
	}
	
}