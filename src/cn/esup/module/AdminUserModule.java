package cn.esup.module;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.nutz.dao.pager.Pager;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.log.Log;
import org.nutz.log.Logs;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Param;
import org.nutz.service.EntityService;

import cn.esup.bean.AdminUser;

@At("/AdminUser")
@IocBean(fields = {"dao"})
public class AdminUserModule extends EntityService<AdminUser> {

	private static final Log log = Logs.get();

	@At
	public Object list(@Param("page") int page, @Param("rows") int rows) {
		if (rows < 1)
			rows = 10;
		Pager pager = dao().createPager(page, rows);
		List<AdminUser> list = dao().query(AdminUser.class, null, pager);
		Map<String, Object> map = new HashMap<String, Object>();
		if (pager != null) {
			pager.setRecordCount(dao().count(AdminUser.class));
			map.put("pager", pager);
		}
		map.put("list", list);
		return map;
	}

	@At
	public boolean add(@Param("..") AdminUser obj) {
		try {
			dao().insert(obj);
			return true;
		}
		catch (Throwable e) {
			if (log.isDebugEnabled())
				log.debug("E!!", e);
			return false;
		}
	}

	@At
	public boolean delete(@Param("..") AdminUser obj) {
		try {
			dao().delete(obj);
			return true;
		}
		catch (Throwable e) {
			if (log.isDebugEnabled())
				log.debug("E!!", e);
			return false;
		}
	}

	@At
	public boolean update(@Param("..") AdminUser obj) {
		try {
			dao().update(obj);
			return true;
		}
		catch (Throwable e) {
			if (log.isDebugEnabled())
				log.debug("E!!", e);
			return false;
		}
	}
}