package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_suppliers")
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
}