package com.tjfor.barbershop.utils;

import org.apache.http.Header;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.BinaryHttpResponseHandler;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import android.content.Context;

public class HttpUtil {
	private static AsyncHttpClient client = new AsyncHttpClient(); // ʵ��������
	static {
		client.setTimeout(11000); // �������ӳ�ʱ����������ã�Ĭ��Ϊ10s
	}

	public static void get(String urlString, AsyncHttpResponseHandler res) // ��һ������url��ȡһ��string����
	{
		client.get(urlString, res);
	}

	public static void get(String urlString, RequestParams params,
			AsyncHttpResponseHandler res) // url���������
	{
		client.get(urlString, params, res);
	}

	public static void get(String urlString, JsonHttpResponseHandler res) // ������������ȡjson�����������
	{
		client.get(urlString, res);
	}

	public static void get(String urlString, RequestParams params,
			JsonHttpResponseHandler res) // ����������ȡjson�����������
	{
		client.get(urlString, params, res);
	}

	public static void get(String uString, BinaryHttpResponseHandler bHandler) // ��������ʹ�ã��᷵��byte����
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
