package com.student_mngt_system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.student_mngt_system.entity.Student;
import com.student_mngt_system.repository.StudentRepository;

@SpringBootApplication
public class ExcelRSpringbootSmsApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ExcelRSpringbootSmsApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
