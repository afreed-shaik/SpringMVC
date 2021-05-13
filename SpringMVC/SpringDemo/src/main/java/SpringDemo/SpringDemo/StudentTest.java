package SpringDemo.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import SpringDemo.SpringDemo.config.StudentConfig;
import SpringDemo.SpringDemo.model.Employee;
import SpringDemo.SpringDemo.model.Student;

public class StudentTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
		Student student = (Student) context.getBean("myStudent");
	     System.out.println(student);

	}

}
