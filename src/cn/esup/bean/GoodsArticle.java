package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_goods_article")
@Pk({
"goodsId" ,
"articleId" ,
"adminId" 
})
public class GoodsArticle {

	/**
	 * 
	 */
	@Column("goods_id")
	private Integer goodsId;
	/**
	 * 
	 */
	@Column("article_id")
	private Integer articleId;
	/**
	 * 
	 */
	@Column("admin_id")
	private Integer adminId;
}