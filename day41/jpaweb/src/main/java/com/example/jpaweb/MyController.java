package com.example.jpaweb;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {
	@Autowired
	userRepository userrepo;
	
	
	@PostMapping("/creatuser")
	public String Createuser(@ModelAttribute User users) {
	
	userrepo.save(users);
	return "index";	
	}
	@GetMapping("/showall")
	public String show(Model model) {
		List<Users> ob=userrepo.findAll();
		model.addAttribute("user",ob);
		return "result";
	}

}

