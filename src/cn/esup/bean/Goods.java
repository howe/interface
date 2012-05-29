package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_goods")
@PK({"goodsId"})
public class Goods {

	/**
	 * 
	 */
	@Id
	@Column("goods_id")
	private Integer goodsId;
	/**
	 * 
	 */
	@Column("cat_id")
	private Integer catId;
	/**
	 * 
	 */
	@Column("goods_sn")
	private String goodsSn;
	/**
	 * 
	 */
	@Column("goods_name")
	private String goodsName;
	/**
	 * 
	 */
	@Column("goods_name_style")
	private String goodsNameStyle;
	/**
	 * 
	 */
	@Column("click_count")
	private Integer clickCount;
	/**
	 * 
	 */
	@Column("brand_id")
	private Integer brandId;
	/**
	 * 
	 */
	@Column("provider_name")
	private String providerName;
	/**
	 * 
	 */
	@Column("goods_number")
	private Integer goodsNumber;
	/**
	 * 
	 */
	@Column("goods_weight")
	private Long goodsWeight;
	/**
	 * 
	 */
	@Column("market_price")
	private Long marketPrice;
	/**
	 * 
	 */
	@Column("shop_price")
	private Long shopPrice;
	/**
	 * 
	 */
	@Column("promote_price")
	private Long promotePrice;
	/**
	 * 
	 */
	@Column("promote_start_date")
	private Integer promoteStartDate;
	/**
	 * 
	 */
	@Column("promote_end_date")
	private Integer promoteEndDate;
	/**
	 * 
	 */
	@Column("warn_number")
	private Integer warnNumber;
	/**
	 * 
	 */
	@Column("keywords")
	private String keywords;
	/**
	 * 
	 */
	@Column("goods_brief")
	private String goodsBrief;
	/**
	 * 
	 */
	@Column("goods_desc")
	private String goodsDesc;
	/**
	 * 
	 */
	@Column("goods_thumb")
	private String goodsThumb;
	/**
	 * 
	 */
	@Column("goods_img")
	private String goodsImg;
	/**
	 * 
	 */
	@Column("original_img")
	private String originalImg;
	/**
	 * 
	 */
	@Column("is_real")
	private Integer isReal;
	/**
	 * 
	 */
	@Column("extension_code")
	private String extensionCode;
	/**
	 * 
	 */
	@Column("is_on_sale")
	private Boolean isOnSale;
	/**
	 * 
	 */
	@Column("is_alone_sale")
	private Boolean isAloneSale;
	/**
	 * 
	 */
	@Column("is_shipping")
	private Boolean isShipping;
	/**
	 * 
	 */
	@Column("integral")
	private Integer integral;
	/**
	 * 
	 */
	@Column("add_time")
	private Integer addTime;
	/**
	 * 
	 */
	@Column("sort_order")
	private Integer sortOrder;
	/**
	 * 
	 */
	@Column("is_delete")
	private Boolean isDelete;
	/**
	 * 
	 */
	@Column("is_best")
	private Boolean isBest;
	/**
	 * 
	 */
	@Column("is_new")
	private Boolean isNew;
	/**
	 * 
	 */
	@Column("is_hot")
	private Boolean isHot;
	/**
	 * 
	 */
	@Column("is_promote")
	private Boolean isPromote;
	/**
	 * 
	 */
	@Column("bonus_type_id")
	private Integer bonusTypeId;
	/**
	 * 
	 */
	@Column("last_update")
	private Integer lastUpdate;
	/**
	 * 
	 */
	@Column("goods_type")
	private Integer goodsType;
	/**
	 * 
	 */
	@Column("seller_note")
	private String sellerNote;
	/**
	 * 
	 */
	@Column("give_integral")
	private Integer giveIntegral;
	/**
	 * 
	 */
	@Column("rank_integral")
	private Integer rankIntegral;
	/**
	 * 供应商ID, 自供品为0
	 */
	@Column("suppliers_id")
	private Integer suppliersId;
	/**
	 * 
	 */
	@Column("is_check")
	private Boolean isCheck;
	/**
	 * 单位
	 */
	@Column("danwei")
	private String danwei;
	/**
	 * 单价
	 */
	@Column("danjia")
	private Long danjia;
	/**
	 * 游戏币数量
	 */
	@Column("yxsl")
	private Long yxsl;
	/**
	 * 阵营
	 */
	@Column("zhenying")
	private String zhenying;
	/**
	 * 游戏名
	 */
	@Column("yxm")
	private String yxm;
	/**
	 * 游戏服名
	 */
	@Column("yxqm")
	private String yxqm;
	/**
	 * 游戏服名
	 */
	@Column("yxfm")
	private String yxfm;
	/**
	 * 供货商商品ID
	 */
	@Column("ghsp_id")
	private String ghspId;
	
	public Integer getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}
	public Integer getCatId() {
		return catId;
	}
	public void setCatId(Integer catId) {
		this.catId = catId;
	}
	public String getGoodsSn() {
		return goodsSn;
	}
	public void setGoodsSn(String goodsSn) {
		this.goodsSn = goodsSn;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getGoodsNameStyle() {
		return goodsNameStyle;
	}
	public void setGoodsNameStyle(String goodsNameStyle) {
		this.goodsNameStyle = goodsNameStyle;
	}
	public Integer getClickCount() {
		return clickCount;
	}
	public void setClickCount(Integer clickCount) {
		this.clickCount = clickCount;
	}
	public Integer getBrandId() {
		return brandId;
	}
	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}
	public String getProviderName() {
		return providerName;
	}
	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}
	public Integer getGoodsNumber() {
		return goodsNumber;
	}
	public void setGoodsNumber(Integer goodsNumber) {
		this.goodsNumber = goodsNumber;
	}
	public Long getGoodsWeight() {
		return goodsWeight;
	}
	public void setGoodsWeight(Long goodsWeight) {
		this.goodsWeight = goodsWeight;
	}
	public Long getMarketPrice() {
		return marketPrice;
	}
	public void setMarketPrice(Long marketPrice) {
		this.marketPrice = marketPrice;
	}
	public Long getShopPrice() {
		return shopPrice;
	}
	public void setShopPrice(Long shopPrice) {
		this.shopPrice = shopPrice;
	}
	public Long getPromotePrice() {
		return promotePrice;
	}
	public void setPromotePrice(Long promotePrice) {
		this.promotePrice = promotePrice;
	}
	public Integer getPromoteStartDate() {
		return promoteStartDate;
	}
	public void setPromoteStartDate(Integer promoteStartDate) {
		this.promoteStartDate = promoteStartDate;
	}
	public Integer getPromoteEndDate() {
		return promoteEndDate;
	}
	public void setPromoteEndDate(Integer promoteEndDate) {
		this.promoteEndDate = promoteEndDate;
	}
	public Integer getWarnNumber() {
		return warnNumber;
	}
	public void setWarnNumber(Integer warnNumber) {
		this.warnNumber = warnNumber;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getGoodsBrief() {
		return goodsBrief;
	}
	public void setGoodsBrief(String goodsBrief) {
		this.goodsBrief = goodsBrief;
	}
	public String getGoodsDesc() {
		return goodsDesc;
	}
	public void setGoodsDesc(String goodsDesc) {
		this.goodsDesc = goodsDesc;
	}
	public String getGoodsThumb() {
		return goodsThumb;
	}
	public void setGoodsThumb(String goodsThumb) {
		this.goodsThumb = goodsThumb;
	}
	public String getGoodsImg() {
		return goodsImg;
	}
	public void setGoodsImg(String goodsImg) {
		this.goodsImg = goodsImg;
	}
	public String getOriginalImg() {
		return originalImg;
	}
	public void setOriginalImg(String originalImg) {
		this.originalImg = originalImg;
	}
	public Integer getIsReal() {
		return isReal;
	}
	public void setIsReal(Integer isReal) {
		this.isReal = isReal;
	}
	public String getExtensionCode() {
		return extensionCode;
	}
	public void setExtensionCode(String extensionCode) {
		this.extensionCode = extensionCode;
	}
	public Boolean getIsOnSale() {
		return isOnSale;
	}
	public void setIsOnSale(Boolean isOnSale) {
		this.isOnSale = isOnSale;
	}
	public Boolean getIsAloneSale() {
		return isAloneSale;
	}
	public void setIsAloneSale(Boolean isAloneSale) {
		this.isAloneSale = isAloneSale;
	}
	public Boolean getIsShipping() {
		return isShipping;
	}
	public void setIsShipping(Boolean isShipping) {
		this.isShipping = isShipping;
	}
	public Integer getIntegral() {
		return integral;
	}
	public void setIntegral(Integer integral) {
		this.integral = integral;
	}
	public Integer getAddTime() {
		return addTime;
	}
	public void setAddTime(Integer addTime) {
		this.addTime = addTime;
	}
	public Integer getSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(Integer sortOrder) {
		this.sortOrder = sortOrder;
	}
	public Boolean getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(Boolean isDelete) {
		this.isDelete = isDelete;
	}
	public Boolean getIsBest() {
		return isBest;
	}
	public void setIsBest(Boolean isBest) {
		this.isBest = isBest;
	}
	public Boolean getIsNew() {
		return isNew;
	}
	public void setIsNew(Boolean isNew) {
		this.isNew = isNew;
	}
	public Boolean getIsHot() {
		return isHot;
	}
	public void setIsHot(Boolean isHot) {
		this.isHot = isHot;
	}
	public Boolean getIsPromote() {
		return isPromote;
	}
	public void setIsPromote(Boolean isPromote) {
		this.isPromote = isPromote;
	}
	public Integer getBonusTypeId() {
		return bonusTypeId;
	}
	public void setBonusTypeId(Integer bonusTypeId) {
		this.bonusTypeId = bonusTypeId;
	}
	public Integer getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(Integer lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	public Integer getGoodsType() {
		return goodsType;
	}
	public void setGoodsType(Integer goodsType) {
		this.goodsType = goodsType;
	}
	public String getSellerNote() {
		return sellerNote;
	}
	public void setSellerNote(String sellerNote) {
		this.sellerNote = sellerNote;
	}
	public Integer getGiveIntegral() {
		return giveIntegral;
	}
	public void setGiveIntegral(Integer giveIntegral) {
		this.giveIntegral = giveIntegral;
	}
	public Integer getRankIntegral() {
		return rankIntegral;
	}
	public void setRankIntegral(Integer rankIntegral) {
		this.rankIntegral = rankIntegral;
	}
	public Integer getSuppliersId() {
		return suppliersId;
	}
	public void setSuppliersId(Integer suppliersId) {
		this.suppliersId = suppliersId;
	}
	public Boolean getIsCheck() {
		return isCheck;
	}
	public void setIsCheck(Boolean isCheck) {
		this.isCheck = isCheck;
	}
	public String getDanwei() {
		return danwei;
	}
	public void setDanwei(String danwei) {
		this.danwei = danwei;
	}
	public Long getDanjia() {
		return danjia;
	}
	public void setDanjia(Long danjia) {
		this.danjia = danjia;
	}
	public Long getYxsl() {
		return yxsl;
	}
	public void setYxsl(Long yxsl) {
		this.yxsl = yxsl;
	}
	public String getZhenying() {
		return zhenying;
	}
	public void setZhenying(String zhenying) {
		this.zhenying = zhenying;
	}
	public String getYxm() {
		return yxm;
	}
	public void setYxm(String yxm) {
		this.yxm = yxm;
	}
	public String getYxqm() {
		return yxqm;
	}
	public void setYxqm(String yxqm) {
		this.yxqm = yxqm;
	}
	public String getYxfm() {
		return yxfm;
	}
	public void setYxfm(String yxfm) {
		this.yxfm = yxfm;
	}
	public String getGhspId() {
		return ghspId;
	}
	public void setGhspId(String ghspId) {
		this.ghspId = ghspId;
	}
	
}