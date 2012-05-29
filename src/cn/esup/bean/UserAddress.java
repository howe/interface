package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_user_address")
@PK({"addressId"})
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
	
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	public String getAddressName() {
		return addressName;
	}
	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getConsignee() {
		return consignee;
	}
	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getCountry() {
		return country;
	}
	public void setCountry(Integer country) {
		this.country = country;
	}
	public Integer getProvince() {
		return province;
	}
	public void setProvince(Integer province) {
		this.province = province;
	}
	public Integer getCity() {
		return city;
	}
	public void setCity(Integer city) {
		this.city = city;
	}
	public Integer getDistrict() {
		return district;
	}
	public void setDistrict(Integer district) {
		this.district = district;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getSignBuilding() {
		return signBuilding;
	}
	public void setSignBuilding(String signBuilding) {
		this.signBuilding = signBuilding;
	}
	public String getBestTime() {
		return bestTime;
	}
	public void setBestTime(String bestTime) {
		this.bestTime = bestTime;
	}
	public String getGameNickname() {
		return gameNickname;
	}
	public void setGameNickname(String gameNickname) {
		this.gameNickname = gameNickname;
	}
	public String getGameLevel() {
		return gameLevel;
	}
	public void setGameLevel(String gameLevel) {
		this.gameLevel = gameLevel;
	}
	public String getGameJueseid() {
		return gameJueseid;
	}
	public void setGameJueseid(String gameJueseid) {
		this.gameJueseid = gameJueseid;
	}
	public String getGameZhiye() {
		return gameZhiye;
	}
	public void setGameZhiye(String gameZhiye) {
		this.gameZhiye = gameZhiye;
	}
	
}