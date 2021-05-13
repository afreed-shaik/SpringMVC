package SpringDemo.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import SpringDemo.SpringDemo.model.*;

public class EmpTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("empContext.xml");
		Employee emp = (Employee)context.getBean("empObj");
	     System.out.println(emp);

	}

}
