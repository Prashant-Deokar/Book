package com.books.Book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BookApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext =SpringApplication.run(BookApplication.class, args);
		 
		for(String name :applicationContext.getBeanDefinitionNames() ) {
			
			System.out.println(name);
		}
		

		System.out.println("Application started....");
	}

}
