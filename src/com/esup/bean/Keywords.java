package com.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_keywords")
@PK({"date", "searchengine", "keyword"})
public class Keywords {

	/**
	 * 
	 */
	@Column("date")
	private java.util.Date date;
	/**
	 * 
	 */
	@Column("searchengine")
	private String searchengine;
	/**
	 * 
	 */
	@Column("keyword")
	private String keyword;
	/**
	 * 
	 */
	@Column("count")
	private Integer count;
	
	public java.util.Date getDate() {
		return date;
	}
	public void setDate(java.util.Date date) {
		this.date = date;
	}
	public String getSearchengine() {
		return searchengine;
	}
	public void setSearchengine(String searchengine) {
		this.searchengine = searchengine;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	
}