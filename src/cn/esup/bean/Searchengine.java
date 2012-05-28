package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_searchengine")
@Pk({
"date" ,
"searchengine" ,
"count" 
})
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
}