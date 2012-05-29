package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_shipping")
@PK({"shippingId"})
public class Shipping {

	/**
	 * 
	 */
	@Column("shipping_id")
	private Integer shippingId;
	/**
	 * 
	 */
	@Column("shipping_code")
	private String shippingCode;
	/**
	 * 
	 */
	@Column("shipping_name")
	private String shippingName;
	/**
	 * 
	 */
	@Column("shipping_desc")
	private String shippingDesc;
	/**
	 * 
	 */
	@Column("insure")
	private String insure;
	/**
	 * 
	 */
	@Column("support_cod")
	private Boolean supportCod;
	/**
	 * 
	 */
	@Column("enabled")
	private Boolean enabled;
	/**
	 * 
	 */
	@Column("shipping_print")
	private String shippingPrint;
	/**
	 * 
	 */
	@Column("print_bg")
	private String printBg;
	/**
	 * 
	 */
	@Column("config_lable")
	private String configLable;
	/**
	 * 
	 */
	@Column("print_model")
	private Boolean printModel;
	/**
	 * 
	 */
	@Column("shipping_order")
	private Integer shippingOrder;
	
	public Integer getShippingId() {
		return shippingId;
	}
	public void setShippingId(Integer shippingId) {
		this.shippingId = shippingId;
	}
	public String getShippingCode() {
		return shippingCode;
	}
	public void setShippingCode(String shippingCode) {
		this.shippingCode = shippingCode;
	}
	public String getShippingName() {
		return shippingName;
	}
	public void setShippingName(String shippingName) {
		this.shippingName = shippingName;
	}
	public String getShippingDesc() {
		return shippingDesc;
	}
	public void setShippingDesc(String shippingDesc) {
		this.shippingDesc = shippingDesc;
	}
	public String getInsure() {
		return insure;
	}
	public void setInsure(String insure) {
		this.insure = insure;
	}
	public Boolean getSupportCod() {
		return supportCod;
	}
	public void setSupportCod(Boolean supportCod) {
		this.supportCod = supportCod;
	}
	public Boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}
	public String getShippingPrint() {
		return shippingPrint;
	}
	public void setShippingPrint(String shippingPrint) {
		this.shippingPrint = shippingPrint;
	}
	public String getPrintBg() {
		return printBg;
	}
	public void setPrintBg(String printBg) {
		this.printBg = printBg;
	}
	public String getConfigLable() {
		return configLable;
	}
	public void setConfigLable(String configLable) {
		this.configLable = configLable;
	}
	public Boolean getPrintModel() {
		return printModel;
	}
	public void setPrintModel(Boolean printModel) {
		this.printModel = printModel;
	}
	public Integer getShippingOrder() {
		return shippingOrder;
	}
	public void setShippingOrder(Integer shippingOrder) {
		this.shippingOrder = shippingOrder;
	}
	
}