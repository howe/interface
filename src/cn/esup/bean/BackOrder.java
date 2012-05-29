package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_back_order")
@PK({"backId"})
public class BackOrder {

	/**
	 * 
	 */
	@Id
	@Column("back_id")
	private Integer backId;
	/**
	 * 
	 */
	@Column("delivery_sn")
	private String deliverySn;
	/**
	 * 
	 */
	@Column("order_sn")
	private String orderSn;
	/**
	 * 
	 */
	@Column("order_id")
	private Integer orderId;
	/**
	 * 
	 */
	@Column("invoice_no")
	private String invoiceNo;
	/**
	 * 
	 */
	@Column("add_time")
	private Integer addTime;
	/**
	 * 
	 */
	@Column("shipping_id")
	private Integer shippingId;
	/**
	 * 
	 */
	@Column("shipping_name")
	private String shippingName;
	/**
	 * 
	 */
	@Column("user_id")
	private Integer userId;
	/**
	 * 
	 */
	@Column("action_user")
	private String actionUser;
	/**
	 * 
	 */
	@Column("consignee")
	private String consignee;
	/**
	 * 
	 */
	@Column("address")
	private String address;
	/**
	 * 
	 */
	@Column("country")
	private Integer country;
	/**
	 * 
	 */
	@Column("province")
	private Integer province;
	/**
	 * 
	 */
	@Column("city")
	private Integer city;
	/**
	 * 
	 */
	@Column("district")
	private Integer district;
	/**
	 * 
	 */
	@Column("sign_building")
	private String signBuilding;
	/**
	 * 
	 */
	@Column("email")
	private String email;
	/**
	 * 
	 */
	@Column("zipcode")
	private String zipcode;
	/**
	 * 
	 */
	@Column("tel")
	private String tel;
	/**
	 * 
	 */
	@Column("mobile")
	private String mobile;
	/**
	 * 
	 */
	@Column("best_time")
	private String bestTime;
	/**
	 * 
	 */
	@Column("postscript")
	private String postscript;
	/**
	 * 
	 */
	@Column("how_oos")
	private String howOos;
	/**
	 * 
	 */
	@Column("insure_fee")
	private Long insureFee;
	/**
	 * 
	 */
	@Column("shipping_fee")
	private Long shippingFee;
	/**
	 * 
	 */
	@Column("update_time")
	private Integer updateTime;
	/**
	 * 
	 */
	@Column("suppliers_id")
	private Integer suppliersId;
	/**
	 * 
	 */
	@Column("status")
	private Boolean status;
	/**
	 * 
	 */
	@Column("return_time")
	private Integer returnTime;
	/**
	 * 
	 */
	@Column("agency_id")
	private Integer agencyId;
	
	public Integer getBackId() {
		return backId;
	}
	public void setBackId(Integer backId) {
		this.backId = backId;
	}
	public String getDeliverySn() {
		return deliverySn;
	}
	public void setDeliverySn(String deliverySn) {
		this.deliverySn = deliverySn;
	}
	public String getOrderSn() {
		return orderSn;
	}
	public void setOrderSn(String orderSn) {
		this.orderSn = orderSn;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public Integer getAddTime() {
		return addTime;
	}
	public void setAddTime(Integer addTime) {
		this.addTime = addTime;
	}
	public Integer getShippingId() {
		return shippingId;
	}
	public void setShippingId(Integer shippingId) {
		this.shippingId = shippingId;
	}
	public String getShippingName() {
		return shippingName;
	}
	public void setShippingName(String shippingName) {
		this.shippingName = shippingName;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getActionUser() {
		return actionUser;
	}
	public void setActionUser(String actionUser) {
		this.actionUser = actionUser;
	}
	public String getConsignee() {
		return consignee;
	}
	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getCountry() {
		return country;
	}
	public void setCountry(Integer country) {
		this.country = country;
	}
	public Integer getProvince() {
		return province;
	}
	public void setProvince(Integer province) {
		this.province = province;
	}
	public Integer getCity() {
		return city;
	}
	public void setCity(Integer city) {
		this.city = city;
	}
	public Integer getDistrict() {
		return district;
	}
	public void setDistrict(Integer district) {
		this.district = district;
	}
	public String getSignBuilding() {
		return signBuilding;
	}
	public void setSignBuilding(String signBuilding) {
		this.signBuilding = signBuilding;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getBestTime() {
		return bestTime;
	}
	public void setBestTime(String bestTime) {
		this.bestTime = bestTime;
	}
	public String getPostscript() {
		return postscript;
	}
	public void setPostscript(String postscript) {
		this.postscript = postscript;
	}
	public String getHowOos() {
		return howOos;
	}
	public void setHowOos(String howOos) {
		this.howOos = howOos;
	}
	public Long getInsureFee() {
		return insureFee;
	}
	public void setInsureFee(Long insureFee) {
		this.insureFee = insureFee;
	}
	public Long getShippingFee() {
		return shippingFee;
	}
	public void setShippingFee(Long shippingFee) {
		this.shippingFee = shippingFee;
	}
	public Integer getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Integer updateTime) {
		this.updateTime = updateTime;
	}
	public Integer getSuppliersId() {
		return suppliersId;
	}
	public void setSuppliersId(Integer suppliersId) {
		this.suppliersId = suppliersId;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Integer getReturnTime() {
		return returnTime;
	}
	public void setReturnTime(Integer returnTime) {
		this.returnTime = returnTime;
	}
	public Integer getAgencyId() {
		return agencyId;
	}
	public void setAgencyId(Integer agencyId) {
		this.agencyId = agencyId;
	}
	
}