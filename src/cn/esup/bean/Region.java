package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_region")
public class Region {

	/**
	 * 
	 */
	@Column("region_id")
	private Integer regionId;
	/**
	 * 
	 */
	@Column("parent_id")
	private Integer parentId;
	/**
	 * 
	 */
	@Column("region_name")
	private String regionName;
	/**
	 * 
	 */
	@Column("region_type")
	private Boolean regionType;
	/**
	 * 
	 */
	@Column("agency_id")
	private Integer agencyId;
}