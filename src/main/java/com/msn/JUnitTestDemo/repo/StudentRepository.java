package com.msn.JUnitTestDemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.msn.JUnitTestDemo.model.Student;



public interface StudentRepository extends JpaRepository<Student, Integer> {
}
