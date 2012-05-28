package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_pack")
public class Pack {

	/**
	 * 
	 */
	@Column("pack_id")
	private Integer packId;
	/**
	 * 
	 */
	@Column("pack_name")
	private String packName;
	/**
	 * 
	 */
	@Column("pack_img")
	private String packImg;
	/**
	 * 
	 */
	@Column("pack_fee")
	private Long packFee;
	/**
	 * 
	 */
	@Column("free_money")
	private Integer freeMoney;
	/**
	 * 
	 */
	@Column("pack_desc")
	private String packDesc;
}