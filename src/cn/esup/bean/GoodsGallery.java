package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_goods_gallery")
public class GoodsGallery {

	/**
	 * 
	 */
	@Id
	@Column("img_id")
	private Integer imgId;
	/**
	 * 
	 */
	@Column("goods_id")
	private Integer goodsId;
	/**
	 * 
	 */
	@Column("img_url")
	private String imgUrl;
	/**
	 * 
	 */
	@Column("img_desc")
	private String imgDesc;
	/**
	 * 
	 */
	@Column("thumb_url")
	private String thumbUrl;
	/**
	 * 
	 */
	@Column("img_original")
	private String imgOriginal;
}