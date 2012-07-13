package com.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 商品表
*/
@Table("es_goods")
@PK({"goodsId"})
public class Goods {

	/**
	 * 商品编号（自增id）
	 */
	@Id
	@Column("goods_id")
	private Integer goodsId;
	
	/**
	 * 商品所属商品分类id，取值es_category的cat_id
	 */
	@Column("cat_id")
	private Integer catId;
	
	/**
	 * 商品的唯一货号
	 */
	@Column("goods_sn")
	private String goodsSn;
	
	/**
	 * 商品的名称
	 */
	@Column("goods_name")
	private String goodsName;
	
	/**
	 * 商品名称显示的样式；包括颜色和字体样式；格式如#ff00ff+strong
	 */
	@Column("goods_name_style")
	private String goodsNameStyle;
	
	/**
	 * 商品点击数
	 */
	@Column("click_count")
	private Integer clickCount;
	
	/**品牌id，取值于es_brand 的brand_id
	 * 
	 */
	@Column("brand_id")
	private Integer brandId;
	
	/**
	 * 供货人的名称，程序还没实现该功能
	 */
	@Column("provider_name")
	private String providerName;
	
	/**
	 * 商品库存数量
	 */
	@Column("goods_number")
	private Integer goodsNumber;
	
	/**
	 * 商品的重量，以千克为单位
	 */
	@Column("goods_weight")
	private Long goodsWeight;
	
	/**
	 * 市场售价
	 */
	@Column("market_price")
	private Long marketPrice;
	
	/**
	 * 本店售价
	 */
	@Column("shop_price")
	private Long shopPrice;
	
	/**
	 * 促销价格
	 */
	@Column("promote_price")
	private Long promotePrice;
	
	/**
	 * 促销价格开始日期
	 */
	@Column("promote_start_date")
	private Integer promoteStartDate;
	
	/**
	 * 促销价格结束日期
	 */
	@Column("promote_end_date")
	private Integer promoteEndDate;
	
	/**
	 * 商品报警数量
	 */
	@Column("warn_number")
	private Integer warnNumber;
	
	/**
	 * 商品关键字，放在商品页的关键字中，为搜索引擎收录用
	 */
	@Column("keywords")
	private String keywords;
	
	/**
	 * 商品的简短描述
	 */
	@Column("goods_brief")
	private String goodsBrief;
	
	/**商品的详细描述
	 * 
	 */
	@Column("goods_desc")
	private String goodsDesc;
	
	/**
	 * 商品在前台显示的微缩图片，如在分类筛选时显示的小图片
	 */
	@Column("goods_thumb")
	private String goodsThumb;
	
	/**
	 * 商品的实际大小图片，如进入该商品页时介绍商品属性所显示的大图片
	 */
	@Column("goods_img")
	private String goodsImg;
	
	/**
	 * 上传的商品的原始图片
	 */
	@Column("original_img")
	private String originalImg;
	
	/**
	 * 是否是实物，1，是；0，否；比如虚拟卡就为0，不是实物
	 */
	@Column("is_real")
	private Integer isReal;
	
	/**
	 * 商品的扩展属性，比如像虚拟卡
	 */
	@Column("extension_code")
	private String extensionCode;
	
	/**
	 * 该商品是否开放销售，1，是；0，否
	 */
	@Column("is_on_sale")
	private Boolean isOnSale;
	
	/**
	 * 是否能单独销售，1，是；0，否；如果不能单独销售，则只能作为某商品的配件或者赠品销售
	 */
	@Column("is_alone_sale")
	private Boolean isAloneSale;
	
	/**
	 * 是否配送, 0
	 */
	@Column("is_shipping")
	private Boolean isShipping;
	
	/**
	 * 购买该商品可以使用的积分数量，估计应该是用积分代替金额消费；但程序好像还没有实现该功能
	 */
	@Column("integral")
	private Integer integral;
	
	/**
	 * 商品的添加时间
	 */
	@Column("add_time")
	private Integer addTime;
	
	/**
	 * 应该是商品的显示顺序，不过该版程序中没实现该功能
	 */
	@Column("sort_order")
	private Integer sortOrder;
	
	/**
	 * 商品是否已经删除，0，否；1，已删除
	 */
	@Column("is_delete")
	private Boolean isDelete;
	
	/**
	 * 是否是精品；0，否；1，是
	 */
	@Column("is_best")
	private Boolean isBest;
	
	/**
	 * 是否是新品
	 */
	@Column("is_new")
	private Boolean isNew;
	
	/**
	 * 是否热销，0，否；1，是
	 */
	@Column("is_hot")
	private Boolean isHot;
	
	/**
	 * 是否特价促销；0，否；1，是
	 */
	@Column("is_promote")
	private Boolean isPromote;
	
	/**
	 * 购买该商品所能领到的红包类型
	 */
	@Column("bonus_type_id")
	private Integer bonusTypeId;
	
	/**
	 * 最近一次更新商品配置的时间
	 */
	@Column("last_update")
	private Integer lastUpdate;
	
	/**
	 * 商品所属类型id，取值表es_goods_type的cat_id
	 */
	@Column("goods_type")
	private Integer goodsType;
	
	/**
	 * 商品的商家备注，仅商家可见
	 */
	@Column("seller_note")
	private String sellerNote;
	
	/**
	 * 赠送消费积分数
	 */
	@Column("give_integral")
	private Integer giveIntegral;
	
	/**
	 * 赠送等级积分数
	 */
	@Column("rank_integral")
	private Integer rankIntegral;
	
	/**
	 * 供应商ID, 自供品为0
	 */
	@Column("suppliers_id")
	private Integer suppliersId;
	
	/**
	 * 是否检查
	 */
	@Column("is_check")
	private Boolean isCheck;
	
	/**
	 * 游戏币单位
	 */
	@Column("danwei")
	private String danwei;
	
	/**
	 * 游戏币单价
	 */
	@Column("danjia")
	private Long danjia;
	
	/**
	 * 单份游戏币的销售数量
	 */
	@Column("yxsl")
	private Long yxsl;
	
	/**
	 * 游戏的阵营
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
	 * 供货商的商品ID
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