package com.ashokit.repo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
	@GetMapping("/welcome")
	public String getWelcome() {
		String tnx = "Welcome to Ashokit!!!!!";
		return tnx;

	}

}
