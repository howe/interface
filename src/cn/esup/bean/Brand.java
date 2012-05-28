package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_brand")
public class Brand {

	/**
	 * 
	 */
	@Column("brand_id")
	private Integer brandId;
	/**
	 * 
	 */
	@Column("brand_name")
	private String brandName;
	/**
	 * 
	 */
	@Column("brand_logo")
	private String brandLogo;
	/**
	 * 
	 */
	@Column("brand_desc")
	private String brandDesc;
	/**
	 * 
	 */
	@Column("site_url")
	private String siteUrl;
	/**
	 * 
	 */
	@Column("sort_order")
	private Integer sortOrder;
	/**
	 * 
	 */
	@Column("is_show")
	private Boolean isShow;
}