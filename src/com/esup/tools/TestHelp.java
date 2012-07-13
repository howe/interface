package com.esup.tools;

import java.security.MessageDigest;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

public class TestHelp {

	public static void main(String[] args) throws Exception {
		// userid: 111180770
		// key: 4a11c2f22ea513cec68a0ab795097151

		// G725 暗黑破坏神3
		// G725P004 亚服专家模式

		// 暗黑三 地下城与勇士

		// esup
		// jay123
		// 桂文清

		// sign

		// 签名
		StringBuilder sign = new StringBuilder("111180770").append("88C05Q22")
				.append("4a11c2f22ea513cec68a0ab795097151");

		HttpClient httpclient = new DefaultHttpClient();
		try {
			StringBuilder url = new StringBuilder();
			url.append("http://api.1771.com/goods/json.htm");

			url.append("?gameId=").append("G725");
			url.append("&");
			url.append("groupId=").append("G725P003");
			url.append("&");
			url.append("userId=").append("111180770");
			url.append("&");
			url.append("sign=").append(md5(sign.toString()));
			url.append("&");
			url.append("pageNo=1");
			url.append("&");
			url.append("channelId=18");

			System.out.println(url);

			HttpGet httpget = new HttpGet(url.toString());

			// Execute HTTP request
			System.out.println("executing request " + httpget.getURI());
			HttpResponse response = httpclient.execute(httpget);

			System.out.println("----------------------------------------");
			System.out.println(response.getStatusLine());
			System.out.println("----------------------------------------");

			// Get hold of the response entity
			HttpEntity entity = response.getEntity();

			if (entity != null) {
				System.out.println(EntityUtils.toString(entity));
			}

		} finally {
			// When HttpClient instance is no longer needed,
			// shut down the connection manager to ensure
			// immediate deallocation of all system resources
			httpclient.getConnectionManager().shutdown();
		}
	}

	public final static String md5(String s) {
		char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
				'a', 'b', 'c', 'd', 'e', 'f' };
		try {
			byte[] strTemp = s.getBytes();
			MessageDigest mdTemp = MessageDigest.getInstance("MD5");
			mdTemp.update(strTemp);
			byte[] md = mdTemp.digest();
			int j = md.length;
			char str[] = new char[j * 2];
			int k = 0;
			for (int i = 0; i < j; i++) {
				byte byte0 = md[i];
				str[k++] = hexDigits[byte0 >>> 4 & 0xf];
				str[k++] = hexDigits[byte0 & 0xf];
			}
			return new String(str);
		} catch (Exception e) {
			return null;
		}
	}

}
