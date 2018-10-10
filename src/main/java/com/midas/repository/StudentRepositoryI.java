package com.midas.repository;

import com.midas.model.Student;

public interface StudentRepositoryI {
	
	public int createStudent(Student student);
	
	public int updateStudent(Student student);

	public Student getStudentById(int id);

}
