package SpringDemo.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import SpringDemo.SpringDemo.model.Customer;

public class CustomerAddHas_A {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("hasArela.xml");
		Customer s = (Customer)ac.getBean("custObj");
		System.out.println(s);

	}

}
