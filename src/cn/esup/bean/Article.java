package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

/**
* 
*/
@Table("es_article")
@PK({"articleId"})
public class Article {

	/**
	 * 
	 */
	@Id
	@Column("article_id")
	private Integer articleId;
	/**
	 * 
	 */
	@Column("cat_id")
	private Integer catId;
	/**
	 * 
	 */
	@Column("title")
	private String title;
	/**
	 * 
	 */
	@Column("content")
	private String content;
	/**
	 * 
	 */
	@Column("author")
	private String author;
	/**
	 * 
	 */
	@Column("author_email")
	private String authorEmail;
	/**
	 * 
	 */
	@Column("keywords")
	private String keywords;
	/**
	 * 
	 */
	@Column("article_type")
	private Boolean articleType;
	/**
	 * 
	 */
	@Column("is_open")
	private Boolean isOpen;
	/**
	 * 
	 */
	@Column("add_time")
	private Integer addTime;
	/**
	 * 
	 */
	@Column("file_url")
	private String fileUrl;
	/**
	 * 
	 */
	@Column("open_type")
	private Boolean openType;
	/**
	 * 
	 */
	@Column("link")
	private String link;
	/**
	 * 
	 */
	@Column("description")
	private String description;
	
	public Integer getArticleId() {
		return articleId;
	}
	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}
	public Integer getCatId() {
		return catId;
	}
	public void setCatId(Integer catId) {
		this.catId = catId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthorEmail() {
		return authorEmail;
	}
	public void setAuthorEmail(String authorEmail) {
		this.authorEmail = authorEmail;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public Boolean getArticleType() {
		return articleType;
	}
	public void setArticleType(Boolean articleType) {
		this.articleType = articleType;
	}
	public Boolean getIsOpen() {
		return isOpen;
	}
	public void setIsOpen(Boolean isOpen) {
		this.isOpen = isOpen;
	}
	public Integer getAddTime() {
		return addTime;
	}
	public void setAddTime(Integer addTime) {
		this.addTime = addTime;
	}
	public String getFileUrl() {
		return fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}
	public Boolean getOpenType() {
		return openType;
	}
	public void setOpenType(Boolean openType) {
		this.openType = openType;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}