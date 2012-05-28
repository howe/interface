package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_topic")
public class Topic {

	/**
	 * 
	 */
	@Column("topic_id")
	private Integer topicId;
	/**
	 * 
	 */
	@Column("title")
	private String title;
	/**
	 * 
	 */
	@Column("intro")
	private String intro;
	/**
	 * 
	 */
	@Column("start_time")
	private Integer startTime;
	/**
	 * 
	 */
	@Column("end_time")
	private Integer endTime;
	/**
	 * 
	 */
	@Column("data")
	private String data;
	/**
	 * 
	 */
	@Column("template")
	private String template;
	/**
	 * 
	 */
	@Column("css")
	private String css;
	/**
	 * 
	 */
	@Column("topic_img")
	private String topicImg;
	/**
	 * 
	 */
	@Column("title_pic")
	private String titlePic;
	/**
	 * 
	 */
	@Column("base_style")
	private String baseStyle;
	/**
	 * 
	 */
	@Column("htmls")
	private String htmls;
	/**
	 * 
	 */
	@Column("keywords")
	private String keywords;
	/**
	 * 
	 */
	@Column("description")
	private String description;
}