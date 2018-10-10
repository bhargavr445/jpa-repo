package com.midas.resource;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.midas.exception.UsersListEmpty;
import com.midas.model.Student;
import com.midas.serviceI.StudentI;

@RestController
@RequestMapping(value="/student")
public class StudentController {
	
	@Autowired
	public StudentI studentI;


	@GetMapping(value="getStudentById/{id}")
	@ApiOperation(value = "Student Controller", nickname = "Student Controller")
	//swagger documentation
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success"),
			@ApiResponse(code = 400, message = "Bad Request"),
			@ApiResponse(code = 500, message = "Failure")
	})
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
//	@ApiResponses(value = {
//			@ApiResponse(code = 200, message = "Success", response = StudentController.class),
//			@ApiResponse(code = 400, message = "Bad Request", response = StudentController.class),
//			@ApiResponse(code = 500, message = "Failure", response = StudentController.class)
//	})
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
