package SpringDemo.SpringDemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import SpringDemo.SpringDemo.model.Student;

@Configuration
public class StudentConfig {
	
	@Bean(value="myStudent")
	public Student createStudent() {
		Student s = new Student();
		s.setName("srinu");
		return s;
	}

}
