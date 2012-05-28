package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_group_goods")
@Pk({
"parentId" ,
"goodsId" ,
"goodsPrice" ,
"adminId" 
})
public class GroupGoods {

	/**
	 * 
	 */
	@Column("parent_id")
	private Integer parentId;
	/**
	 * 
	 */
	@Column("goods_id")
	private Integer goodsId;
	/**
	 * 
	 */
	@Column("goods_price")
	private Long goodsPrice;
	/**
	 * 
	 */
	@Column("admin_id")
	private Integer adminId;
}