package com.techxyte;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiWithSpringBootApplication {

	public static void main(String[] args) {
		
		
		
		ApplicationContext context=SpringApplication.run(DiWithSpringBootApplication.class, args);
		
		 Student a=context.getBean(Student.class); 
		
		     a.show1(); 
		
		
		
		
		
		
		
		
	}
	
	

}
