package com.example.demoEx;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {
	@GetMapping("/")
	public String home() {
		return "index";
	}
	@PostMapping("/createstudent")
	public String creatstudent(@ModelAttribute Student stud) {
		return "result";
	}

}
