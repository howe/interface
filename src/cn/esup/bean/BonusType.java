package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_bonus_type")
@PK({"typeId"})
public class BonusType {

	/**
	 * 
	 */
	@Column("type_id")
	private Integer typeId;
	/**
	 * 
	 */
	@Column("type_name")
	private String typeName;
	/**
	 * 
	 */
	@Column("type_money")
	private Long typeMoney;
	/**
	 * 
	 */
	@Column("send_type")
	private Integer sendType;
	/**
	 * 
	 */
	@Column("min_amount")
	private Long minAmount;
	/**
	 * 
	 */
	@Column("max_amount")
	private Long maxAmount;
	/**
	 * 
	 */
	@Column("send_start_date")
	private Integer sendStartDate;
	/**
	 * 
	 */
	@Column("send_end_date")
	private Integer sendEndDate;
	/**
	 * 
	 */
	@Column("use_start_date")
	private Integer useStartDate;
	/**
	 * 
	 */
	@Column("use_end_date")
	private Integer useEndDate;
	/**
	 * 
	 */
	@Column("min_goods_amount")
	private Long minGoodsAmount;
	
	public Integer getTypeId() {
		return typeId;
	}
	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public Long getTypeMoney() {
		return typeMoney;
	}
	public void setTypeMoney(Long typeMoney) {
		this.typeMoney = typeMoney;
	}
	public Integer getSendType() {
		return sendType;
	}
	public void setSendType(Integer sendType) {
		this.sendType = sendType;
	}
	public Long getMinAmount() {
		return minAmount;
	}
	public void setMinAmount(Long minAmount) {
		this.minAmount = minAmount;
	}
	public Long getMaxAmount() {
		return maxAmount;
	}
	public void setMaxAmount(Long maxAmount) {
		this.maxAmount = maxAmount;
	}
	public Integer getSendStartDate() {
		return sendStartDate;
	}
	public void setSendStartDate(Integer sendStartDate) {
		this.sendStartDate = sendStartDate;
	}
	public Integer getSendEndDate() {
		return sendEndDate;
	}
	public void setSendEndDate(Integer sendEndDate) {
		this.sendEndDate = sendEndDate;
	}
	public Integer getUseStartDate() {
		return useStartDate;
	}
	public void setUseStartDate(Integer useStartDate) {
		this.useStartDate = useStartDate;
	}
	public Integer getUseEndDate() {
		return useEndDate;
	}
	public void setUseEndDate(Integer useEndDate) {
		this.useEndDate = useEndDate;
	}
	public Long getMinGoodsAmount() {
		return minGoodsAmount;
	}
	public void setMinGoodsAmount(Long minGoodsAmount) {
		this.minGoodsAmount = minGoodsAmount;
	}
	
}