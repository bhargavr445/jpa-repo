package com.midas.serviceI;

import com.midas.model.Student;

public interface StudentI {
	
	public int createStudent(Student student);

	public int updateStudent(Student student);

	public Student getStudentById(int id);

}
