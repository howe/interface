package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_suppliers")
@PK({"suppliersId"})
public class Suppliers {

	/**
	 * 
	 */
	@Column("suppliers_id")
	private Integer suppliersId;
	/**
	 * 
	 */
	@Column("suppliers_name")
	private String suppliersName;
	/**
	 * 
	 */
	@Column("suppliers_desc")
	private String suppliersDesc;
	/**
	 * 
	 */
	@Column("is_check")
	private Boolean isCheck;
	
	public Integer getSuppliersId() {
		return suppliersId;
	}
	public void setSuppliersId(Integer suppliersId) {
		this.suppliersId = suppliersId;
	}
	public String getSuppliersName() {
		return suppliersName;
	}
	public void setSuppliersName(String suppliersName) {
		this.suppliersName = suppliersName;
	}
	public String getSuppliersDesc() {
		return suppliersDesc;
	}
	public void setSuppliersDesc(String suppliersDesc) {
		this.suppliersDesc = suppliersDesc;
	}
	public Boolean getIsCheck() {
		return isCheck;
	}
	public void setIsCheck(Boolean isCheck) {
		this.isCheck = isCheck;
	}
	
}