package com.test.javalin.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Hotel {
	private final int id;
	private final String name;
	private final String address;
}
