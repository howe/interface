package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_keywords")
@Pk({
"date" ,
"searchengine" ,
"keyword" ,
"count" 
})
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
}