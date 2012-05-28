package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_user_address")
public class UserAddress {

	/**
	 * 
	 */
	@Id
	@Column("address_id")
	private Integer addressId;
	/**
	 * 
	 */
	@Column("address_name")
	private String addressName;
	/**
	 * 
	 */
	@Column("user_id")
	private Integer userId;
	/**
	 * 
	 */
	@Column("consignee")
	private String consignee;
	/**
	 * 
	 */
	@Column("email")
	private String email;
	/**
	 * 
	 */
	@Column("country")
	private Integer country;
	/**
	 * 
	 */
	@Column("province")
	private Integer province;
	/**
	 * 
	 */
	@Column("city")
	private Integer city;
	/**
	 * 
	 */
	@Column("district")
	private Integer district;
	/**
	 * 
	 */
	@Column("address")
	private String address;
	/**
	 * 
	 */
	@Column("zipcode")
	private String zipcode;
	/**
	 * 
	 */
	@Column("tel")
	private String tel;
	/**
	 * 
	 */
	@Column("mobile")
	private String mobile;
	/**
	 * 
	 */
	@Column("sign_building")
	private String signBuilding;
	/**
	 * 
	 */
	@Column("best_time")
	private String bestTime;
	/**
	 * 游戏角色名称
	 */
	@Column("game_nickname")
	private String gameNickname;
	/**
	 * 游戏等级
	 */
	@Column("game_level")
	private String gameLevel;
	/**
	 * 角色ID
	 */
	@Column("game_jueseid")
	private String gameJueseid;
	/**
	 * 游戏角色职业
	 */
	@Column("game_zhiye")
	private String gameZhiye;
}