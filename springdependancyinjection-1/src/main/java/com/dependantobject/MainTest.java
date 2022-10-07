package com.dependantobject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



@SpringBootApplication
public class MainTest {
	public static void main(String[] args) {
		 SpringApplication.run(MainTest.class, args);
		 ApplicationContext context = new ClassPathXmlApplicationContext(
					"com/dependantobject/applicationContext.xml");
	 Employee1 s=(Employee1)context.getBean("e");
	 s.show();

	 }
}
