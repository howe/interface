package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_group_goods")
@PK({"parentId", "goodsId", "adminId"})
public class GroupGoods {

	/**
	 * 
	 */
	@Column("parent_id")
	private Integer parentId;
	/**
	 * 
	 */
	@Column("goods_id")
	private Integer goodsId;
	/**
	 * 
	 */
	@Column("goods_price")
	private Long goodsPrice;
	/**
	 * 
	 */
	@Column("admin_id")
	private Integer adminId;
	
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public Integer getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}
	public Long getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(Long goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	public Integer getAdminId() {
		return adminId;
	}
	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}
	
}
