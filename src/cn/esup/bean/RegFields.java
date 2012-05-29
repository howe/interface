package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_reg_fields")
@PK({"id"})
public class RegFields {

	/**
	 * 
	 */
	@Column("id")
	private Integer id;
	/**
	 * 
	 */
	@Column("reg_field_name")
	private String regFieldName;
	/**
	 * 
	 */
	@Column("dis_order")
	private Integer disOrder;
	/**
	 * 
	 */
	@Column("display")
	private Boolean display;
	/**
	 * 
	 */
	@Column("type")
	private Boolean type;
	/**
	 * 
	 */
	@Column("is_need")
	private Boolean isNeed;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRegFieldName() {
		return regFieldName;
	}
	public void setRegFieldName(String regFieldName) {
		this.regFieldName = regFieldName;
	}
	public Integer getDisOrder() {
		return disOrder;
	}
	public void setDisOrder(Integer disOrder) {
		this.disOrder = disOrder;
	}
	public Boolean getDisplay() {
		return display;
	}
	public void setDisplay(Boolean display) {
		this.display = display;
	}
	public Boolean getType() {
		return type;
	}
	public void setType(Boolean type) {
		this.type = type;
	}
	public Boolean getIsNeed() {
		return isNeed;
	}
	public void setIsNeed(Boolean isNeed) {
		this.isNeed = isNeed;
	}
	
}