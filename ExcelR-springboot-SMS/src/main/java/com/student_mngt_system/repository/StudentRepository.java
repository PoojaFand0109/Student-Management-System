package com.student_mngt_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.student_mngt_system.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {

}
