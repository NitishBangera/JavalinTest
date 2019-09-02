package com.test.javalin.service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.inject.Singleton;

import com.test.javalin.model.Hotel;

@Singleton
public class HotelService {
	private Map<Integer, Hotel> storage = new HashMap<>();
	
	public void insert(final List<Hotel> hotels) {
		for (Hotel hotel : hotels) {
			int id = hotel.getId();
			if (!storage.containsKey(id)) {
				storage.put(id, hotel);
			}
		}
	}
	
	public List<Hotel> getHotels(final String ids) {
		List<Hotel> hotels = new LinkedList<>();
		if (ids == null || ids.isEmpty()) {
			hotels.addAll(storage.values());
		} else {
			String[] idVals = ids.split(",");
			for (String idVal : idVals) {
				Hotel hotel = storage.get(Integer.parseInt(idVal));
				if (hotel != null) {
					hotels.add(hotel);
				}
			}
		}
		return hotels;
	}
	
	public void update(final List<Hotel> hotels) {
		insert(hotels);
	}
	
	public void delete(final String ids) {
		String[] idVals = ids.split(",");
		for (String idVal : idVals) {
			storage.remove(Integer.parseInt(idVal));
		}
	}
}
