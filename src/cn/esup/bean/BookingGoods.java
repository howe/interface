package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_booking_goods")
@PK({"recId"})
public class BookingGoods {

	/**
	 * 
	 */
	@Id
	@Column("rec_id")
	private Integer recId;
	/**
	 * 
	 */
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
	@Column("link_man")
	private String linkMan;
	/**
	 * 
	 */
	@Column("tel")
	private String tel;
	/**
	 * 
	 */
	@Column("goods_id")
	private Integer goodsId;
	/**
	 * 
	 */
	@Column("goods_desc")
	private String goodsDesc;
	/**
	 * 
	 */
	@Column("goods_number")
	private Integer goodsNumber;
	/**
	 * 
	 */
	@Column("booking_time")
	private Integer bookingTime;
	/**
	 * 
	 */
	@Column("is_dispose")
	private Boolean isDispose;
	/**
	 * 
	 */
	@Column("dispose_user")
	private String disposeUser;
	/**
	 * 
	 */
	@Column("dispose_time")
	private Integer disposeTime;
	/**
	 * 
	 */
	@Column("dispose_note")
	private String disposeNote;
	
	public Integer getRecId() {
		return recId;
	}
	public void setRecId(Integer recId) {
		this.recId = recId;
	}
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
	public String getLinkMan() {
		return linkMan;
	}
	public void setLinkMan(String linkMan) {
		this.linkMan = linkMan;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Integer getGoodsId() {
		return goodsId;
	}
	public void setGoodsId(Integer goodsId) {
		this.goodsId = goodsId;
	}
	public String getGoodsDesc() {
		return goodsDesc;
	}
	public void setGoodsDesc(String goodsDesc) {
		this.goodsDesc = goodsDesc;
	}
	public Integer getGoodsNumber() {
		return goodsNumber;
	}
	public void setGoodsNumber(Integer goodsNumber) {
		this.goodsNumber = goodsNumber;
	}
	public Integer getBookingTime() {
		return bookingTime;
	}
	public void setBookingTime(Integer bookingTime) {
		this.bookingTime = bookingTime;
	}
	public Boolean getIsDispose() {
		return isDispose;
	}
	public void setIsDispose(Boolean isDispose) {
		this.isDispose = isDispose;
	}
	public String getDisposeUser() {
		return disposeUser;
	}
	public void setDisposeUser(String disposeUser) {
		this.disposeUser = disposeUser;
	}
	public Integer getDisposeTime() {
		return disposeTime;
	}
	public void setDisposeTime(Integer disposeTime) {
		this.disposeTime = disposeTime;
	}
	public String getDisposeNote() {
		return disposeNote;
	}
	public void setDisposeNote(String disposeNote) {
		this.disposeNote = disposeNote;
	}
	
}