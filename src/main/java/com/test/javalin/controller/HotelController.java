package com.test.javalin.controller;

import java.util.List;

import javax.inject.Inject;

import com.test.javalin.model.Hotel;
import com.test.javalin.service.HotelService;

import io.dinject.controller.Controller;
import io.dinject.controller.Get;
import io.dinject.controller.Path;
import io.dinject.controller.Post;
import io.dinject.controller.QueryParam;

@Controller
@Path("/hotel")
public class HotelController {
	private HotelService hotelService;
	
	@Inject
	public HotelController(final HotelService hotelService) {
		this.hotelService = hotelService;
	}
	
	@Post("insert")
	public void insert(Hotel hotel) {
		hotelService.insert(hotel);
	}
	
	@Get("get")
	public List<Hotel> get(@QueryParam("ids") String ids) {
		return hotelService.getHotels(ids);
	}
}
