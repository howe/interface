package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_goods_attr")
@PK({"goodsAttrId"})
public class GoodsAttr {

	/**
	 * 
	 */
	@Id
	@Column("goods_attr_id")
	private Integer goodsAttrId;
	/**
	 * 
	 */
	@Column("goods_id")
	private Integer goodsId;
	/**
	 * 
	 */
	@Column("attr_id")
	private Integer attrId;
	/**
	 * 
	 */
	@Column("attr_value")
	private String attrValue;
	/**
	 * 
	 */
	@Column("attr_price")
	private String attrPrice;
	
	public Integer getGoodsAttrId() {
		return goodsAttrId;
	}
	public void setGoodsAttrId(Integer goodsAttrId) {
		this.goodsAttrId = goodsAttrId;
	}
	public Integer getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}
	public Integer getAttrId() {
		return attrId;
	}
	public void setAttrId(Integer attrId) {
		this.attrId = attrId;
	}
	public String getAttrValue() {
		return attrValue;
	}
	public void setAttrValue(String attrValue) {
		this.attrValue = attrValue;
	}
	public String getAttrPrice() {
		return attrPrice;
	}
	public void setAttrPrice(String attrPrice) {
		this.attrPrice = attrPrice;
	}
	
}