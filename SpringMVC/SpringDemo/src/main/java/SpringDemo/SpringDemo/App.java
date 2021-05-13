package SpringDemo.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import SpringDemo.SpringDemo.model.Sample;

public class App {
	
  public static void main(String[] args) {
     ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
     Sample s = (Sample) context.getBean("sampleObj");
     s.display();
     
     Sample s1 = (Sample)context.getBean("sampleObj");
     s1.display();
     
     //((AbstractApplicationContext) context).registerShutdownHook();
     
  }
}
