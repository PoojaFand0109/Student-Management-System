package com.student_mngt_system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student_mngt_system.entity.Student;
import com.student_mngt_system.repository.StudentRepository;
import com.student_mngt_system.service.StudentService;


@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRepository;
	
	
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}



	@Override
	public List<Student> getAllstudents() {
		
		return studentRepository.findAll() ;
		
	}



	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}



	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}



	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
		
	}



	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);
		
	}
	
	

	
}
