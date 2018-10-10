package com.midas.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.midas.model.Student;
import com.midas.repository.StudentRepositoryI;
import com.midas.serviceI.StudentI;
@Service
public class StudentServiceImpl implements StudentI {

	@Autowired
	public StudentRepositoryI studentRepositoryI; 
	@Override
	public int createStudent(Student student) {
		System.out.println("Hello service impl");
		studentRepositoryI.createStudent(student);
		return 0;
	}
	@Override
	public int updateStudent(Student student) {
		studentRepositoryI.updateStudent(student);
		return 0;
	}
	@Override
	public Student getStudentById(int id) {
		Student s = studentRepositoryI.getStudentById(id);
		return s;
	}

}
