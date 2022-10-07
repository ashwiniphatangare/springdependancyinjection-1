package dependancyinjectionusingfatorymethod;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@SpringBootApplication
public class Test2 {
	public static void main(String[] args) {
		 ApplicationContext context=new ClassPathXmlApplicationContext("dependancyinjectionusingfatorymethod/applicationContext.xml");
		 A a=(A)context.getBean("a");
		 a.msg();
		}
}
