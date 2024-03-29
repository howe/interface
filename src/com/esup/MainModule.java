package com.esup;

import org.nutz.mvc.annotation.Encoding;
import org.nutz.mvc.annotation.Fail;
import org.nutz.mvc.annotation.IocBy;
import org.nutz.mvc.annotation.Localization;
import org.nutz.mvc.annotation.Modules;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.ioc.provider.ComboIocProvider;

/**
 * 对接公司货物平台
 * 
 * @author yangq(qi.yang.cn@gmail.com) 2012-7-16
 */
@IocBy(type = ComboIocProvider.class, args = {	"*org.nutz.ioc.loader.json.JsonLoader",
												"ioc/",
												"*org.nutz.ioc.loader.annotation.AnnotationIocLoader",
												"com.esup"})
@Encoding(input = "utf8", output = "utf8")
@Modules(scanPackage = true)
@Localization("msg")
@Ok("ioc:json")
@Fail("json")
public class MainModule {}
