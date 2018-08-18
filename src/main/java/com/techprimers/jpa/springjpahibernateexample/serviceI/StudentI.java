package com.techprimers.jpa.springjpahibernateexample.serviceI;

import com.techprimers.jpa.springjpahibernateexample.model.Student;

public interface StudentI {
	
	public int createStudent(Student student);

	public int updateStudent(Student student);

	public Student getStudentById(int id);

}
