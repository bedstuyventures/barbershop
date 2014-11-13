package com.tjfor.barbershop.utils;

import org.apache.http.Header;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.BinaryHttpResponseHandler;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import android.content.Context;

public class HttpUtil {
	private static AsyncHttpClient client = new AsyncHttpClient(); // 实例话对象
	static {
		client.setTimeout(11000); // 设置链接超时，如果不设置，默认为10s
	}

	public static void get(String urlString, AsyncHttpResponseHandler res) // 用一个完整url获取一个string对象
	{
		client.get(urlString, res);
	}

	public static void get(String urlString, RequestParams params,
			AsyncHttpResponseHandler res) // url里面带参数
	{
		client.get(urlString, params, res);
	}

	public static void get(String urlString, JsonHttpResponseHandler res) // 不带参数，获取json对象或者数组
	{
		client.get(urlString, res);
	}

	public static void get(String urlString, RequestParams params,
			JsonHttpResponseHandler res) // 带参数，获取json对象或者数组
	{
		client.get(urlString, params, res);
	}

	public static void get(String uString, BinaryHttpResponseHandler bHandler) // 下载数据使用，会返回byte数据
	{
		client.get(uString, bHandler);
	}

	public static void post(String url, RequestParams params,
			AsyncHttpResponseHandler res) {
		client.post(url, params, res);
	}

	public static void post(String url, RequestParams params,
			JsonHttpResponseHandler res) {
		client.post(url, params, res);

	}

	public static void post(Context context, String url, Header[] headers,
			RequestParams params, String contentType,
			JsonHttpResponseHandler responseHandler) {
		client.post(context, url, headers, params, contentType, responseHandler);
	}

	public static AsyncHttpClient getClient() {
		return client;
	}

}
