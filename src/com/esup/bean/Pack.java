package com.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_pack")
@PK({"packId"})
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
	
	public Integer getPackId() {
		return packId;
	}
	public void setPackId(Integer packId) {
		this.packId = packId;
	}
	public String getPackName() {
		return packName;
	}
	public void setPackName(String packName) {
		this.packName = packName;
	}
	public String getPackImg() {
		return packImg;
	}
	public void setPackImg(String packImg) {
		this.packImg = packImg;
	}
	public Long getPackFee() {
		return packFee;
	}
	public void setPackFee(Long packFee) {
		this.packFee = packFee;
	}
	public Integer getFreeMoney() {
		return freeMoney;
	}
	public void setFreeMoney(Integer freeMoney) {
		this.freeMoney = freeMoney;
	}
	public String getPackDesc() {
		return packDesc;
	}
	public void setPackDesc(String packDesc) {
		this.packDesc = packDesc;
	}
	
}