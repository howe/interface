package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_booking_goods")
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
}