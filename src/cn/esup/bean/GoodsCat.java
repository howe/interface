package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_goods_cat")
@Pk({
"goodsId" ,
"catId" 
})
public class GoodsCat {

	/**
	 * 
	 */
	@Column("goods_id")
	private Integer goodsId;
	/**
	 * 
	 */
	@Column("cat_id")
	private Integer catId;
}