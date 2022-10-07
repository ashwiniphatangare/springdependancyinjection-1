package com.pnamespace;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@SpringBootApplication
public class PnamespaceTest {

	
		@SuppressWarnings("resource")
		 public static void main(String[] args) {
		 String configFile =
		"/com/pnamespace/applicationContext.xml";
		 ApplicationContext context = new ClassPathXmlApplicationContext(configFile);
		 Employee emp = (Employee) context.getBean("emp");
		 System.out.println(emp);

	}

}
