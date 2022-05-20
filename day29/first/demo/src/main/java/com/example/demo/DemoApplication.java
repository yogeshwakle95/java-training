package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
	 
		ApplicationContext context;

		context=SpringApplication.run(DemoApplication.class, args);
		//System.out.println("Ok");
		StudenRepositry stud = context.getBean(StudenRepositry.class);
		Student st=new Student(100,"abc");
		stud.save(st);
		System.out.println("Record Saved");
	}

}
