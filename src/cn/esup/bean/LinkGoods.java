package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_link_goods")
@PK({"goodsId", "linkGoodsId", "adminId"})
public class LinkGoods {

	/**
	 * 
	 */
	@Column("goods_id")
	private Integer goodsId;
	/**
	 * 
	 */
	@Column("link_goods_id")
	private Integer linkGoodsId;
	/**
	 * 
	 */
	@Column("is_double")
	private Boolean isDouble;
	/**
	 * 
	 */
	@Column("admin_id")
	private Integer adminId;
	
	public Integer getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}
	public Integer getLinkGoodsId() {
		return linkGoodsId;
	}
	public void setLinkGoodsId(Integer linkGoodsId) {
		this.linkGoodsId = linkGoodsId;
	}
	public Boolean getIsDouble() {
		return isDouble;
	}
	public void setIsDouble(Boolean isDouble) {
		this.isDouble = isDouble;
	}
	public Integer getAdminId() {
		return adminId;
	}
	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}
	
}