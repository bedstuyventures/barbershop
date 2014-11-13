package com.tjfor.barbershop.utils;

import com.google.gson.Gson;

public class JsonUtil {
	public static Gson gson = new Gson();
	
	public static String toJson(Object obj){
	    return gson.toJson(obj);
	}
	
	public static <T> T json2Bean(String json,Class<T> classOfT){
		return gson.fromJson(json, classOfT);
	}

}
