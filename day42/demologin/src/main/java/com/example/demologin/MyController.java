package com.example.demologin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {

	@Autowired
	UsersRespository userrepo;

	@PostMapping("/registeruser")
	public String registerUser(@ModelAttribute users user) {
		userrepo.save(user);
		return "index";
	}

	@PostMapping("/check")
	public String loginUser(@ModelAttribute users user) {

		String path="invalid";
		List<users> list1 = userrepo.findAll();
		String uname=user.getUsername();
		String pass=user.getPassword();
		for (users ob : list1) {
			if(ob.getUsername().equals(uname) && ob.getPassword().equals(pass)) {
				path="result";
				break;
			}
		}

		return path;
	}

	@GetMapping("/newuser")
	public String goToRegister() {
		return "register";
	}

}