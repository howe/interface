package com.esup.module;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.nutz.dao.Sqls;
import org.nutz.dao.pager.Pager;
import org.nutz.dao.sql.Sql;
import org.nutz.dao.sql.SqlCallback;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.log.Log;
import org.nutz.log.Logs;
import org.nutz.mvc.annotation.At;
import org.nutz.mvc.annotation.Param;
import org.nutz.service.EntityService;
import org.nutz.trans.Atom;
import org.nutz.trans.Trans;

import com.esup.bean.Users;

@At("/Users")
@IocBean(fields = {"dao"})
public class UsersModule extends EntityService<Users> {

	private static final Log log = Logs.get();

	@At
	public Object list(@Param("page") int page, @Param("rows") int rows) {
		if (rows < 1)
			rows = 10;
		Pager pager = dao().createPager(page, rows);
		List<Users> list = dao().query(Users.class, null, pager);
		Map<String, Object> map = new HashMap<String, Object>();
		if (pager != null) {
			pager.setRecordCount(dao().count(Users.class));
			map.put("pager", pager);
		}
		map.put("list", list);
		return map;
	}

	@At
	public boolean add(@Param("..") Users obj) {
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
	public boolean delete(@Param("..") Users obj) {
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
	public boolean update(@Param("..") Users obj) {
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

	/** 通过账户查询用户 */
	@At
	public boolean queryUserByAccount(String account) {
		Sql sql = Sqls.create("select count(t.user_id) num from es_users t where t.user_name = @name");
		sql.params().set("name", account);

		sql.setCallback(new SqlCallback() {
			public Object invoke(Connection conn, ResultSet rs, Sql sql) throws SQLException {
				rs.next();
				return rs.getInt("num");
			}
		});
		dao().execute(sql);

		int i = sql.getInt();

		if (i == 1) {
			return true;
		} else {
			return false;
		}
	}

	/** 通过账户给用户加款 */
	@At
	public boolean addMoneyByAccount(String account, String received_payment, String tid) {

		// update es_users t set t.user_money= t.user_money + 1 where
		// t.user_name = 'howechiang'

		final Sql sql = Sqls.create("update es_users t set t.user_money= t.user_money + @money where t.user_name = @name ");
		sql.params().set("money", received_payment);
		sql.params().set("name", account);

		// insert into
		// es_account_log(user_id,user_money,frozen_money,rank_points,pay_points,change_time,change_desc,change_type)
		// values((select user_id from es_users where
		// user_name='howechiang'),2,0,0,0,unix_timestamp(sysdate()),'支付宝',99)

		StringBuilder memo = new StringBuilder("淘宝加款卡充值，淘宝订单号为：");
		memo.append(tid);

		final Sql sql2 = Sqls.create("insert into es_account_log(user_id,user_money,frozen_money,rank_points,pay_points,change_time,change_desc,change_type) values((select user_id from es_users where user_name=@name),@money,0,0,0,unix_timestamp(sysdate()),@memo,0) ");
		sql2.params().set("name", account);
		sql2.params().set("money", received_payment);
		sql2.params().set("memo", memo.toString());

		Trans.exec(new Atom() {
			public void run() {
				dao().execute(sql);
				dao().execute(sql2);
			}
		});

		return true;
	}

	/** 加款日志 */
	@At
	public boolean addMoneyLog(	String account,
								Long tid,
								String alipay_no,
								String buyer_nick,
								Date created,
								Date pay_time,
								Date end_time,
								String received_payment) {

		// insert into
		// es_jiakuan_log(payment_from,buyer_nick,user_name,trade_number,payment_number,order_date,payment_date,confirm_date,amount,account_id)
		// values ('taobao', 'lee_carefree', 'howechiang', '147584462880806',
		// '2012072376671007', '2012-07-23 11:07:46','2012-07-23 11:07:46',
		// '2012-07-23 11:33:35', '4.0', '72'));

		final Sql sql = Sqls.create("insert into es_jiakuan_log(payment_from,buyer_nick,user_name,order_number,trade_number,order_date,payment_date,confirm_date,amount,account_id) values ('taobao', @buyer_nick, @account, @tid, @alipay_no, @created, @pay_time, @end_time, @received_payment, (select user_id from es_users where user_name = @name)) ");
		sql.params().set("buyer_nick", buyer_nick);
		sql.params().set("account", account);
		sql.params().set("tid", tid);
		sql.params().set("alipay_no", alipay_no);
		sql.params().set("created", created);
		sql.params().set("pay_time", pay_time);
		sql.params().set("end_time", end_time);
		sql.params().set("received_payment", received_payment);
		sql.params().set("name", account);

		// insert into
		// es_user_account(user_id,admin_user,amount,add_time,paid_time,admin_note,user_note,process_type,payment,is_paid)
		// values ('30', 'jiakuan', '1.00', '1342737314', '1342737314',
		// '淘宝订单号：xxxxx', '支付宝流水号：xxxxx', '0', '淘宝加款卡', '1');

		final Sql sql2 = Sqls.create("insert into es_user_account(user_id,admin_user,amount,add_time,paid_time,admin_note,user_note,process_type,payment,is_paid) values ((select user_id from es_users where user_name = @name), 'jiakuan', @received_payment, unix_timestamp(@created), unix_timestamp(@pay_time), @tid, @alipay_no, '0', '淘宝加款卡', '1') ");
		sql2.params().set("name", account);
		sql2.params().set("received_payment", received_payment);
		sql2.params().set("created", created);
		sql2.params().set("pay_time", pay_time);
		sql2.params().set("tid", "淘宝流水号：" + tid);
		sql2.params().set("alipay_no", alipay_no);

		System.out.println(sql.toString());
		System.out.println(sql2.toString());

		Trans.exec(new Atom() {
			public void run() {
				dao().execute(sql);
				dao().execute(sql2);
			}
		});

		return true;
	}

	/** 通过支付宝交易流水号判断账户是否重复加款 */
	@At
	public boolean isRepeatAddMoney(String trade_no) throws Exception {
		// SELECT * from es_user_account t WHERE t.user_note='2012072303977307';

		Sql sql = Sqls.create("select count(t.user_id) num from es_user_account t WHERE t.user_note = @trade_no");
		sql.params().set("trade_no", trade_no);

		sql.setCallback(new SqlCallback() {
			public Object invoke(Connection conn, ResultSet rs, Sql sql) throws SQLException {
				rs.next();
				return rs.getInt("num");
			}
		});
		dao().execute(sql);

		int i = sql.getInt();

		if (i == 1) {
			return true;
		} else {
			return false;
		}
	}

}