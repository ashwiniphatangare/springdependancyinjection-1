package com.injectingcollection;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@SpringBootApplication
public class MainJava {
	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("com/injectingcollection"
					+ "/applicationContext.xml");
		 JavaCollection jc=(JavaCollection)context.getBean("javaCollection");
		 jc.getAddressList();
		 jc.getAddressSet();
		 jc.getAddressMap();
		 jc.getAddressProp();
		 }
}
