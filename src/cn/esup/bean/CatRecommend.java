package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_cat_recommend")
@Pk({
"catId" ,
"recommendType" 
})
public class CatRecommend {

	/**
	 * 
	 */
	@Column("cat_id")
	private Integer catId;
	/**
	 * 
	 */
	@Column("recommend_type")
	private Boolean recommendType;
}