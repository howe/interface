package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_reg_fields")
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
}