package com.componant;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class ComponantApplication 
{

	public static void main(String[] args)
	{

		//SpringApplication.run(ComponantApplication.class, args);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.componant");
		context.refresh();

		ComponantDemo componentDemo = context.getBean(ComponantDemo.class);
		componentDemo.demoFunction();
		context.close();
	}
}