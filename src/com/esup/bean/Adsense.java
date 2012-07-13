package com.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_adsense")
public class Adsense {

	/**
	 * 
	 */
	@Column("from_ad")
	private Integer fromAd;
	/**
	 * 
	 */
	@Column("referer")
	private String referer;
	/**
	 * 
	 */
	@Column("clicks")
	private Integer clicks;
	
	public Integer getFromAd() {
		return fromAd;
	}
	public void setFromAd(Integer fromAd) {
		this.fromAd = fromAd;
	}
	public String getReferer() {
		return referer;
	}
	public void setReferer(String referer) {
		this.referer = referer;
	}
	public Integer getClicks() {
		return clicks;
	}
	public void setClicks(Integer clicks) {
		this.clicks = clicks;
	}
	
}