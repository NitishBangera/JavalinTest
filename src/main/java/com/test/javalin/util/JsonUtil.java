package com.test.javalin.util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class JsonUtil {
	private static final Gson GSON = new Gson();
	
	public static <T> T fromJson(final String json, TypeToken<T> typeToken) {
		return GSON.fromJson(json, typeToken.getType());
	}
	
	public static String toJson(Object object) {
		return GSON.toJson(object);
	}
	
	public static <T> T convert(Object object, TypeToken<T> typeToken) {
		return fromJson(toJson(object), typeToken);
	}
}
