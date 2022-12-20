package com.example;

import com.example.controller.BookController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springboot0102QuickstartApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Springboot0102QuickstartApplication.class, args);
		BookController bean = ctx.getBean(BookController.class);
		System.out.println("bean======>" + bean);
	}

}
