package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebServices {

	@GetMapping("/rest")
	public String rest_get() {
		return "Rest Web Service is called";
	}
}
