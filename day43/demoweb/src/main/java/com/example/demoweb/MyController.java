package com.example.demoweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class MyController {
	@GetMapping("/main")
	public String goTomain() {
		return "main";
	}
	@GetMapping("/movie")
	public String goTomovie() {
		return "Movie";	
	}
	@GetMapping("/sport")
	public String goTosport() {
		return "Sport";
	}

}
