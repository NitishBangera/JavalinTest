package com.test.javalin.service;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Singleton;

@Singleton
public class GreetingService {
	public Map<String, String> hello(final String name) {
		Map<String, String> result = new HashMap<String, String>();
		result.put("message", "Hello " + name);
		return result;
	}
	
	public void hello(final Map<String, String> params) {
		System.out.println(params);
	}
}
