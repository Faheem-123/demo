package com.SpringBootCrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(DemoApplication.class, args);
		StudentRepository sr=context.getBean(StudentRepository.class);
		
		
		//CREATE Operation...........
		
		Student s=new Student();
		
		s.setName("Sonu");
		s.setCity("hyderabad");
		Student result1=sr.save(s);
		System.out.println(result1);
		
		//READ Operation...............
		
		Iterable<Student> itr =sr.findAll();
		itr.forEach(Student->System.out.println(s));
		
		//UPDATE Operation..............
		
		Optional<Student> optional=sr.findById(2);
		Student s1=optional.get();
		s1.setName("Azeem");
		Student result2=sr.save(s1);
		System.out.println(result2);
		
		//DELETE Operation..........
		
		sr.deleteById(3);
		System.out.println("Record has deleted");
		
	}

}
