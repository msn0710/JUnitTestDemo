package com.msn.JUnitTestDemo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msn.JUnitTestDemo.model.Student;
import com.msn.JUnitTestDemo.repo.StudentRepository;

@RestController
@RequestMapping(value = "/student")
public class StudentController {

    @Autowired
	StudentRepository repo;

	@GetMapping(value = "/getallstudent")
	public List<Student> getAllStudent() {
		return repo.findAll();
	}

	@PostMapping(value = "/addstudent")
	public List<Student> saveStudent(@RequestBody final Student student) {
		repo.save(student);
		return repo.findAll();
	}

}
