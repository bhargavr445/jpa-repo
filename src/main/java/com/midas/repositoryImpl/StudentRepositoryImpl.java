package com.midas.repositoryImpl;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.midas.model.Student;
import com.midas.repository.StudentRepositoryI;
@Repository
@Transactional
public class StudentRepositoryImpl implements StudentRepositoryI {
	@Autowired
	EntityManager em;

	@Override
	//@Transactional
	public int createStudent(Student student) {
	//	em.persist(student.getPassport());
		em.persist(student);
		//em.getTransaction( ).commit( );
		System.out.println("Rep executed");
		return 0;
	}
	@Override
	//@Transactional
	public int updateStudent(Student student) {
		em.merge(student);
		//em.getTransaction( ).commit( );
		System.out.println("Rep executed");
		return 0;
	}
	@Override
	@Transactional
	public Student getStudentById(int id) {
		// TODO Auto-generated method stu
			Student stu = em.find(Student.class, id);
		return stu;
	}
	
	
	
}
