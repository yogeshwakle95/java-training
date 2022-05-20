package com.example.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {
	@Autowired
	private EmployeeRepository stud;

	@GetMapping("/students")
	public List<employee> getAllStudents() {
		return stud.findAll();
	}

}
