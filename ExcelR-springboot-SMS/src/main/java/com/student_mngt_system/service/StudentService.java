package com.student_mngt_system.service;

import java.util.List;

import com.student_mngt_system.entity.Student;

public interface StudentService {
	
	List <Student> getAllstudents();
    public Student saveStudent(Student student);
	
	public Student getStudentById(Long id);
	
	public Student updateStudent(Student student);
	
	public void deleteStudentById(Long id);

}
