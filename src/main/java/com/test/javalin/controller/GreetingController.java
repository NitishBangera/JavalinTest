package com.test.javalin.controller;

import java.util.Map;

import javax.inject.Inject;

import com.test.javalin.service.GreetingService;

import io.dinject.controller.Controller;
import io.dinject.controller.Get;
import io.dinject.controller.Path;
import io.dinject.controller.Post;

@Controller
@Path("/hello")
public class GreetingController {
	private GreetingService greetingService;
	
	@Inject
	public GreetingController(final GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	@Get(":name")
	public Map<String, String> hello(final String name) {
		return greetingService.hello(name);
	}
	
	@Post
	public void hello(final Map<String, String> params) {
		greetingService.hello(params);
	}
}
