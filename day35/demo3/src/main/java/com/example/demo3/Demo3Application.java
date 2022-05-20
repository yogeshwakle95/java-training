package com.example.demo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication

public class Demo3Application {

	public static void main(String[] args) {
		//SpringApplication.run(Demo3Application.class, args);
		ApplicationContext context;
		context = SpringApplication.run(Demo3Application.class, args);
		StudentDetails st;
		st=context.getBean(StudentDetails.class);
		st.setdata();
		st.shodata();
	}

}
