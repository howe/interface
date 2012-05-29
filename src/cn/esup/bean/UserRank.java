package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_user_rank")
@PK({"rankId"})
public class UserRank {

	/**
	 * 
	 */
	@Column("rank_id")
	private Integer rankId;
	/**
	 * 
	 */
	@Column("rank_name")
	private String rankName;
	/**
	 * 
	 */
	@Column("min_points")
	private Integer minPoints;
	/**
	 * 
	 */
	@Column("max_points")
	private Integer maxPoints;
	/**
	 * 
	 */
	@Column("discount")
	private Integer discount;
	/**
	 * 
	 */
	@Column("show_price")
	private Boolean showPrice;
	/**
	 * 
	 */
	@Column("special_rank")
	private Boolean specialRank;
	
	public Integer getRankId() {
		return rankId;
	}
	public void setRankId(Integer rankId) {
		this.rankId = rankId;
	}
	public String getRankName() {
		return rankName;
	}
	public void setRankName(String rankName) {
		this.rankName = rankName;
	}
	public Integer getMinPoints() {
		return minPoints;
	}
	public void setMinPoints(Integer minPoints) {
		this.minPoints = minPoints;
	}
	public Integer getMaxPoints() {
		return maxPoints;
	}
	public void setMaxPoints(Integer maxPoints) {
		this.maxPoints = maxPoints;
	}
	public Integer getDiscount() {
		return discount;
	}
	public void setDiscount(Integer discount) {
		this.discount = discount;
	}
	public Boolean getShowPrice() {
		return showPrice;
	}
	public void setShowPrice(Boolean showPrice) {
		this.showPrice = showPrice;
	}
	public Boolean getSpecialRank() {
		return specialRank;
	}
	public void setSpecialRank(Boolean specialRank) {
		this.specialRank = specialRank;
	}
	
}