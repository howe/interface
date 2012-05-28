package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_category")
public class Category {

	/**
	 * 
	 */
	@Column("cat_id")
	private Integer catId;
	/**
	 * 
	 */
	@Column("cat_name")
	private String catName;
	/**
	 * 
	 */
	@Column("keywords")
	private String keywords;
	/**
	 * 
	 */
	@Column("cat_desc")
	private String catDesc;
	/**
	 * 
	 */
	@Column("parent_id")
	private Integer parentId;
	/**
	 * 
	 */
	@Column("sort_order")
	private Boolean sortOrder;
	/**
	 * 
	 */
	@Column("template_file")
	private String templateFile;
	/**
	 * 
	 */
	@Column("measure_unit")
	private String measureUnit;
	/**
	 * 
	 */
	@Column("show_in_nav")
	private Boolean showInNav;
	/**
	 * 
	 */
	@Column("style")
	private String style;
	/**
	 * 
	 */
	@Column("is_show")
	private Boolean isShow;
	/**
	 * 
	 */
	@Column("grade")
	private Integer grade;
	/**
	 * 
	 */
	@Column("filter_attr")
	private String filterAttr;
}