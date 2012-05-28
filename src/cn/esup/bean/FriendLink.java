package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_friend_link")
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
}