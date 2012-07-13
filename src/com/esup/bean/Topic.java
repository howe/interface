package com.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
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
	
	public Integer getTopicId() {
		return topicId;
	}
	public void setTopicId(Integer topicId) {
		this.topicId = topicId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	public Integer getStartTime() {
		return startTime;
	}
	public void setStartTime(Integer startTime) {
		this.startTime = startTime;
	}
	public Integer getEndTime() {
		return endTime;
	}
	public void setEndTime(Integer endTime) {
		this.endTime = endTime;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getTemplate() {
		return template;
	}
	public void setTemplate(String template) {
		this.template = template;
	}
	public String getCss() {
		return css;
	}
	public void setCss(String css) {
		this.css = css;
	}
	public String getTopicImg() {
		return topicImg;
	}
	public void setTopicImg(String topicImg) {
		this.topicImg = topicImg;
	}
	public String getTitlePic() {
		return titlePic;
	}
	public void setTitlePic(String titlePic) {
		this.titlePic = titlePic;
	}
	public String getBaseStyle() {
		return baseStyle;
	}
	public void setBaseStyle(String baseStyle) {
		this.baseStyle = baseStyle;
	}
	public String getHtmls() {
		return htmls;
	}
	public void setHtmls(String htmls) {
		this.htmls = htmls;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}