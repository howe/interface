package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_link_goods")
@Pk({
"goodsId" ,
"linkGoodsId" ,
"isDouble" ,
"adminId" 
})
public class LinkGoods {

	/**
	 * 
	 */
	@Column("goods_id")
	private Integer goodsId;
	/**
	 * 
	 */
	@Column("link_goods_id")
	private Integer linkGoodsId;
	/**
	 * 
	 */
	@Column("is_double")
	private Boolean isDouble;
	/**
	 * 
	 */
	@Column("admin_id")
	private Integer adminId;
}