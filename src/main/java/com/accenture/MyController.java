package com.accenture;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping("/")
	public String welcome() { 
		return "welcome.....(original)";
	}
	@RequestMapping("/home")
	public String home() {
		return "home.....";
	}
}
