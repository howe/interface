package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_goods_activity")
public class GoodsActivity {

	/**
	 * 
	 */
	@Id
	@Column("act_id")
	private Integer actId;
	/**
	 * 
	 */
	@Column("act_name")
	private String actName;
	/**
	 * 
	 */
	@Column("act_desc")
	private String actDesc;
	/**
	 * 
	 */
	@Column("act_type")
	private Integer actType;
	/**
	 * 
	 */
	@Column("goods_id")
	private Integer goodsId;
	/**
	 * 
	 */
	@Column("product_id")
	private Integer productId;
	/**
	 * 
	 */
	@Column("goods_name")
	private String goodsName;
	/**
	 * 
	 */
	@Column("start_time")
	private Integer startTime;
	/**
	 * 
	 */
	@Column("end_time")
	private Integer endTime;
	/**
	 * 
	 */
	@Column("is_finished")
	private Integer isFinished;
	/**
	 * 
	 */
	@Column("ext_info")
	private String extInfo;
}