package com.springmvc.studentmngmnt;

import com.springmvc.studentmngmnt.entity.Student;
import com.springmvc.studentmngmnt.repositpory.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()
public class StudentmngmntApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentmngmntApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("Aditya", "kumar", "ak88564@gmail.com");
//		studentRepository.save(student1);
//
//		Student student2 = new Student("Aman", "kumar", "amank4867@gmail.com");
//		studentRepository.save(student2);
//
//		Student student3 = new Student("Manju", "devi", "queen1@gmail.com");
//		studentRepository.save(student3);


	}
}
