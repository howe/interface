package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_cat_recommend")
@PK({"catId", "recommendType"})
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
	
	public Integer getCatId() {
		return catId;
	}
	public void setCatId(Integer catId) {
		this.catId = catId;
	}
	public Boolean getRecommendType() {
		return recommendType;
	}
	public void setRecommendType(Boolean recommendType) {
		this.recommendType = recommendType;
	}
	
}