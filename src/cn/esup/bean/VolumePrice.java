package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_volume_price")
@Pk({
"priceType" ,
"goodsId" ,
"volumeNumber" ,
"volumePrice" 
})
public class VolumePrice {

	/**
	 * 
	 */
	@Column("price_type")
	private Boolean priceType;
	/**
	 * 
	 */
	@Column("goods_id")
	private Integer goodsId;
	/**
	 * 
	 */
	@Column("volume_number")
	private Integer volumeNumber;
	/**
	 * 
	 */
	@Column("volume_price")
	private Long volumePrice;
}