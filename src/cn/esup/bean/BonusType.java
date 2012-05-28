package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_bonus_type")
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
}