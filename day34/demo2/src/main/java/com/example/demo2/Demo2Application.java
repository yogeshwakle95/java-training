package com.example.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Sp
public class Demo2Application {

	public static void main(String[] args) {
		//SpringApplication.run(Demo2Application.class, args);
		ApplicationContext context;
		context=SpringApplication.run(Demo2Application.class, args);
 
		MyRepository stud;
		stud=context.getBean(MyRepository.class);
		stud.getData();
	}

	}

}
