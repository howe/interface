package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_back_goods")
@PK({"recId"})
public class BackGoods {

	/**
	 * 
	 */
	@Id
	@Column("rec_id")
	private Integer recId;
	/**
	 * 
	 */
	@Column("back_id")
	private Integer backId;
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
	@Column("product_sn")
	private String productSn;
	/**
	 * 
	 */
	@Column("goods_name")
	private String goodsName;
	/**
	 * 
	 */
	@Column("brand_name")
	private String brandName;
	/**
	 * 
	 */
	@Column("goods_sn")
	private String goodsSn;
	/**
	 * 
	 */
	@Column("is_real")
	private Boolean isReal;
	/**
	 * 
	 */
	@Column("send_number")
	private Integer sendNumber;
	/**
	 * 
	 */
	@Column("goods_attr")
	private String goodsAttr;
	
	public Integer getRecId() {
		return recId;
	}
	public void setRecId(Integer recId) {
		this.recId = recId;
	}
	public Integer getBackId() {
		return backId;
	}
	public void setBackId(Integer backId) {
		this.backId = backId;
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
	public String getProductSn() {
		return productSn;
	}
	public void setProductSn(String productSn) {
		this.productSn = productSn;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getGoodsSn() {
		return goodsSn;
	}
	public void setGoodsSn(String goodsSn) {
		this.goodsSn = goodsSn;
	}
	public Boolean getIsReal() {
		return isReal;
	}
	public void setIsReal(Boolean isReal) {
		this.isReal = isReal;
	}
	public Integer getSendNumber() {
		return sendNumber;
	}
	public void setSendNumber(Integer sendNumber) {
		this.sendNumber = sendNumber;
	}
	public String getGoodsAttr() {
		return goodsAttr;
	}
	public void setGoodsAttr(String goodsAttr) {
		this.goodsAttr = goodsAttr;
	}
	
}