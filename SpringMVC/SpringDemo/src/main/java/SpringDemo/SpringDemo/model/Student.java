package SpringDemo.SpringDemo.model;

import org.springframework.stereotype.Component;

@Component
public class Student {
	
	 	String name;


		public void setName(String name) {
			this.name = name;
		}
		
		public String toString() {
			return "Welcome  To " +name;
		}

}
