package cn.esup.bean;

import org.nutz.dao.entity.annotation.*;

import lombok.Data;

/**
* 
*/
@Data
@Table("es_package_goods")
@Pk({
"packageId" ,
"goodsId" ,
"productId" ,
"goodsNumber" ,
"adminId" 
})
public class PackageGoods {

	/**
	 * 
	 */
	@Column("package_id")
	private Integer packageId;
	/**
	 * 
	 */
	@Column("goods_id")
	private Integer goodsId;
	/**
	 * 
	 */
	@Column("product_id")
	private Integer productId;
	/**
	 * 
	 */
	@Column("goods_number")
	private Integer goodsNumber;
	/**
	 * 
	 */
	@Column("admin_id")
	private Integer adminId;
}