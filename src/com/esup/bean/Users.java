package com.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_users")
@PK({"userId"})
public class Users {

	/**
	 * 
	 */
	@Id
	@Column("user_id")
	private Integer userId;
	/**
	 * 
	 */
	@Column("email")
	private String email;
	/**
	 * 
	 */
	@Column("user_name")
	private String userName;
	/**
	 * 
	 */
	@Column("password")
	private String password;
	/**
	 * 
	 */
	@Column("question")
	private String question;
	/**
	 * 
	 */
	@Column("answer")
	private String answer;
	/**
	 * 
	 */
	@Column("sex")
	private Boolean sex;
	/**
	 * 
	 */
	@Column("birthday")
	private java.util.Date birthday;
	/**
	 * 
	 */
	@Column("user_money")
	private Long userMoney;
	/**
	 * 
	 */
	@Column("frozen_money")
	private Long frozenMoney;
	/**
	 * 
	 */
	@Column("pay_points")
	private Integer payPoints;
	/**
	 * 
	 */
	@Column("rank_points")
	private Integer rankPoints;
	/**
	 * 
	 */
	@Column("address_id")
	private Integer addressId;
	/**
	 * 
	 */
	@Column("reg_time")
	private Integer regTime;
	/**
	 * 
	 */
	@Column("last_login")
	private Integer lastLogin;
	/**
	 * 
	 */
	@Column("last_time")
	private java.util.Date lastTime;
	/**
	 * 
	 */
	@Column("last_ip")
	private String lastIp;
	/**
	 * 
	 */
	@Column("visit_count")
	private Integer visitCount;
	/**
	 * 
	 */
	@Column("user_rank")
	private Integer userRank;
	/**
	 * 
	 */
	@Column("is_special")
	private Integer isSpecial;
	/**
	 * 
	 */
	@Column("ec_salt")
	private String ecSalt;
	/**
	 * 
	 */
	@Column("salt")
	private String salt;
	/**
	 * 
	 */
	@Column("parent_id")
	private Integer parentId;
	/**
	 * 
	 */
	@Column("flag")
	private Integer flag;
	/**
	 * 
	 */
	@Column("alias")
	private String alias;
	/**
	 * 
	 */
	@Column("msn")
	private String msn;
	/**
	 * 
	 */
	@Column("qq")
	private String qq;
	/**
	 * 
	 */
	@Column("office_phone")
	private String officePhone;
	/**
	 * 
	 */
	@Column("home_phone")
	private String homePhone;
	/**
	 * 
	 */
	@Column("mobile_phone")
	private String mobilePhone;
	/**
	 * 
	 */
	@Column("is_validated")
	private Integer isValidated;
	/**
	 * 
	 */
	@Column("credit_line")
	private Long creditLine;
	/**
	 * 
	 */
	@Column("passwd_question")
	private String passwdQuestion;
	/**
	 * 
	 */
	@Column("passwd_answer")
	private String passwdAnswer;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Boolean getSex() {
		return sex;
	}
	public void setSex(Boolean sex) {
		this.sex = sex;
	}
	public java.util.Date getBirthday() {
		return birthday;
	}
	public void setBirthday(java.util.Date birthday) {
		this.birthday = birthday;
	}
	public Long getUserMoney() {
		return userMoney;
	}
	public void setUserMoney(Long userMoney) {
		this.userMoney = userMoney;
	}
	public Long getFrozenMoney() {
		return frozenMoney;
	}
	public void setFrozenMoney(Long frozenMoney) {
		this.frozenMoney = frozenMoney;
	}
	public Integer getPayPoints() {
		return payPoints;
	}
	public void setPayPoints(Integer payPoints) {
		this.payPoints = payPoints;
	}
	public Integer getRankPoints() {
		return rankPoints;
	}
	public void setRankPoints(Integer rankPoints) {
		this.rankPoints = rankPoints;
	}
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	public Integer getRegTime() {
		return regTime;
	}
	public void setRegTime(Integer regTime) {
		this.regTime = regTime;
	}
	public Integer getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(Integer lastLogin) {
		this.lastLogin = lastLogin;
	}
	public java.util.Date getLastTime() {
		return lastTime;
	}
	public void setLastTime(java.util.Date lastTime) {
		this.lastTime = lastTime;
	}
	public String getLastIp() {
		return lastIp;
	}
	public void setLastIp(String lastIp) {
		this.lastIp = lastIp;
	}
	public Integer getVisitCount() {
		return visitCount;
	}
	public void setVisitCount(Integer visitCount) {
		this.visitCount = visitCount;
	}
	public Integer getUserRank() {
		return userRank;
	}
	public void setUserRank(Integer userRank) {
		this.userRank = userRank;
	}
	public Integer getIsSpecial() {
		return isSpecial;
	}
	public void setIsSpecial(Integer isSpecial) {
		this.isSpecial = isSpecial;
	}
	public String getEcSalt() {
		return ecSalt;
	}
	public void setEcSalt(String ecSalt) {
		this.ecSalt = ecSalt;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public Integer getParentId() {
		return parentId;
	}
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	public Integer getFlag() {
		return flag;
	}
	public void setFlag(Integer flag) {
		this.flag = flag;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getMsn() {
		return msn;
	}
	public void setMsn(String msn) {
		this.msn = msn;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getOfficePhone() {
		return officePhone;
	}
	public void setOfficePhone(String officePhone) {
		this.officePhone = officePhone;
	}
	public String getHomePhone() {
		return homePhone;
	}
	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public Integer getIsValidated() {
		return isValidated;
	}
	public void setIsValidated(Integer isValidated) {
		this.isValidated = isValidated;
	}
	public Long getCreditLine() {
		return creditLine;
	}
	public void setCreditLine(Long creditLine) {
		this.creditLine = creditLine;
	}
	public String getPasswdQuestion() {
		return passwdQuestion;
	}
	public void setPasswdQuestion(String passwdQuestion) {
		this.passwdQuestion = passwdQuestion;
	}
	public String getPasswdAnswer() {
		return passwdAnswer;
	}
	public void setPasswdAnswer(String passwdAnswer) {
		this.passwdAnswer = passwdAnswer;
	}
	
}