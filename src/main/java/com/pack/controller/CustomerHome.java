package com.pack.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pack.util.PathsClass;

@RestController
@RequestMapping(PathsClass.CUSTOMER_PATH)
public class CustomerHome {

	@RequestMapping("/home")
	public String home() {
		return "home";
	}
}
