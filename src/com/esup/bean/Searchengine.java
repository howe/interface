package com.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_searchengine")
@PK({"date", "searchengine"})
public class Searchengine {

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
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	
}