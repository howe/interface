package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
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
	
	public Integer getRegionId() {
		return regionId;
	}
	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public String getRegionName() {
		return regionName;
	}
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	public Boolean getRegionType() {
		return regionType;
	}
	public void setRegionType(Boolean regionType) {
		this.regionType = regionType;
	}
	public Integer getAgencyId() {
		return agencyId;
	}
	public void setAgencyId(Integer agencyId) {
		this.agencyId = agencyId;
	}
	
}