package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_nav")
public class Nav {

	/**
	 * 
	 */
	@Id
	@Column("id")
	private Integer id;
	/**
	 * 
	 */
	@Column("ctype")
	private String ctype;
	/**
	 * 
	 */
	@Column("cid")
	private Integer cid;
	/**
	 * 
	 */
	@Column("name")
	private String name;
	/**
	 * 
	 */
	@Column("ifshow")
	private Boolean ifshow;
	/**
	 * 
	 */
	@Column("vieworder")
	private Boolean vieworder;
	/**
	 * 
	 */
	@Column("opennew")
	private Boolean opennew;
	/**
	 * 
	 */
	@Column("url")
	private String url;
	/**
	 * 
	 */
	@Column("type")
	private String type;
}