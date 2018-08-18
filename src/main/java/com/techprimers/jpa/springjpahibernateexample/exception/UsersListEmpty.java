package com.techprimers.jpa.springjpahibernateexample.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UsersListEmpty extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UsersListEmpty(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	
}
