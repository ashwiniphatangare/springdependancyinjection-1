package annotationbasedconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext context = new ClassPathXmlApplicationContext("annotationbasedconfiguration/applicationContext.xml");

		 Student student = (Student) context.getBean("student");
		 System.out.println("Name : " + student.getName() );
		 System.out.println("Age : " + student.getAge() );
		 TextEditor te = (TextEditor) context.getBean("textEditor");
		 te.spellCheck();
	}

}
