package com.techprimers.jpa.springjpahibernateexample.repository;

import com.techprimers.jpa.springjpahibernateexample.model.Student;

public interface StudentRepositoryI {
	
	public int createStudent(Student student);
	
	public int updateStudent(Student student);

	public Student getStudentById(int id);

}
