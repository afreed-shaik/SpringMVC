package SpringDemo.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import SpringDemo.SpringDemo.model.Example;

public class ExampleTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ExampleDemo.xml");
		Example ex = (Example)context.getBean("exampleObj");
	     System.out.println(ex);
		

	}

}
