package com.msn.JUnitTestDemo.Controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.msn.JUnitTestDemo.model.Student;
import com.msn.JUnitTestDemo.repo.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentControllerTest {

	@MockBean
	StudentRepository repo;

	@Test
	public void getAllStudentTest() {
		when(repo.findAll()).thenReturn(Stream.of(new Student(1, "Ajay", "java")).collect(Collectors.toList()));
		assertEquals(1, repo.findAll().size());

	}
	
	@Test
	public void saveStudentTest() {
		Student student = new Student(1,"Ashish","Ruby");
		when(repo.save(student)).thenReturn(student);
		assertEquals(student, repo.save(student));

	}
 

}
