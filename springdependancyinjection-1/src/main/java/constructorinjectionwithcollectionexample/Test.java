package constructorinjectionwithcollectionexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dependantobject.MainTest;

@SpringBootApplication
public class Test {
	public static void main(String[] args) {
	 SpringApplication.run(Test.class, args);

	 ApplicationContext context = new ClassPathXmlApplicationContext(
				"constructorinjectionwithcollectionexample/applicationContext.xml");
	 Question q=(Question)context.getBean("q");
	 q.displayInfo(); 
}
}
