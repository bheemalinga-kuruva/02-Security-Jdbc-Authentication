package com.bhim.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

	@GetMapping( "/admin")
	public String admin() {
		return "Welcome Admin";
	}

	@GetMapping("/user")
	public String user() {
		return "Hello User :";
	}

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome ";
	}

}
