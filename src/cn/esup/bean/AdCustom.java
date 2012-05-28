package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_ad_custom")
@PK({"adId"})
public class AdCustom {

	/**
	 * 
	 */
	@Id
	@Column("ad_id")
	private Integer adId;
	/**
	 * 
	 */
	@Column("ad_type")
	private Boolean adType;
	/**
	 * 
	 */
	@Column("ad_name")
	private String adName;
	/**
	 * 
	 */
	@Column("add_time")
	private Integer addTime;
	/**
	 * 
	 */
	@Column("content")
	private String content;
	/**
	 * 
	 */
	@Column("url")
	private String url;
	/**
	 * 
	 */
	@Column("ad_status")
	private Integer adStatus;
	
	public Integer getAdId() {
		return adId;
	}
	public void setAdId(Integer adId) {
		this.adId = adId;
	}
	public Boolean getAdType() {
		return adType;
	}
	public void setAdType(Boolean adType) {
		this.adType = adType;
	}
	public String getAdName() {
		return adName;
	}
	public void setAdName(String adName) {
		this.adName = adName;
	}
	public Integer getAddTime() {
		return addTime;
	}
	public void setAddTime(Integer addTime) {
		this.addTime = addTime;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Integer getAdStatus() {
		return adStatus;
	}
	public void setAdStatus(Integer adStatus) {
		this.adStatus = adStatus;
	}
	
}