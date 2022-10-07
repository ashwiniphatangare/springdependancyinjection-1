package com.dependancyinjection;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class SpringDependancyInjectionApplication {
	
		 public static void main(String[] args) {
			 SpringApplication.run(SpringDependancyInjectionApplication.class, args);
			 ApplicationContext context = new ClassPathXmlApplicationContext(
						"com/dependancyinjection"
						+ "/applicationContext.xml");
		 Employee s=(Employee)context.getBean("e");
		 s.show();

		 }
		} 

