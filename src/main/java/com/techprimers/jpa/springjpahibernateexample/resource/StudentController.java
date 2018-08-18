package com.techprimers.jpa.springjpahibernateexample.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techprimers.jpa.springjpahibernateexample.exception.UsersListEmpty;
import com.techprimers.jpa.springjpahibernateexample.model.Student;
import com.techprimers.jpa.springjpahibernateexample.serviceI.StudentI;

@RestController
@RequestMapping(value="/student")
public class StudentController {
	
	@Autowired
	public StudentI studentI;
	
	@GetMapping(value="getStudentById/{id}")
	public Student getStudent(@PathVariable(value="id") final int id, 
							 @RequestParam(value="param1", required=true) String param1) {
		String s = param1;
		System.out.println(s);
		Student student = studentI.getStudentById(id);
		if(student == null) {
			throw new  UsersListEmpty("exception");
		}
		return student;
	}
	
	@PostMapping(value="/cerateStudent")
	public int cerateStudent(@RequestBody Student student) {
		studentI.createStudent(student);
		return 1;
	}
	
	@PutMapping(value="/updateStudent")
	public int updateStudent(@RequestBody Student student) {
		studentI.updateStudent(student);
		return 1;
	}
	
}
