package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_friend_link")
@PK({"linkId"})
public class FriendLink {

	/**
	 * 
	 */
	@Column("link_id")
	private Integer linkId;
	/**
	 * 
	 */
	@Column("link_name")
	private String linkName;
	/**
	 * 
	 */
	@Column("link_url")
	private String linkUrl;
	/**
	 * 
	 */
	@Column("link_logo")
	private String linkLogo;
	/**
	 * 
	 */
	@Column("show_order")
	private Integer showOrder;
	
	public Integer getLinkId() {
		return linkId;
	}
	public void setLinkId(Integer linkId) {
		this.linkId = linkId;
	}
	public String getLinkName() {
		return linkName;
	}
	public void setLinkName(String linkName) {
		this.linkName = linkName;
	}
	public String getLinkUrl() {
		return linkUrl;
	}
	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}
	public String getLinkLogo() {
		return linkLogo;
	}
	public void setLinkLogo(String linkLogo) {
		this.linkLogo = linkLogo;
	}
	public Integer getShowOrder() {
		return showOrder;
	}
	public void setShowOrder(Integer showOrder) {
		this.showOrder = showOrder;
	}
	
}