package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_package_goods")
@PK({"packageId", "goodsId", "productId", "adminId"})
public class PackageGoods {

	/**
	 * 
	 */
	@Column("package_id")
	private Integer packageId;
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
	@Column("goods_number")
	private Integer goodsNumber;
	/**
	 * 
	 */
	@Column("admin_id")
	private Integer adminId;
	
	public Integer getPackageId() {
		return packageId;
	}
	public void setPackageId(Integer packageId) {
		this.packageId = packageId;
	}
	public Integer getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getGoodsNumber() {
		return goodsNumber;
	}
	public void setGoodsNumber(Integer goodsNumber) {
		this.goodsNumber = goodsNumber;
	}
	public Integer getAdminId() {
		return adminId;
	}
	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}
	
}