package com.techprimers.jpa.springjpahibernateexample.exception;

import java.util.Date;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.techprimers.jpa.springjpahibernateexample.model.ExceptionResponse;
@ControllerAdvice
@RestController
public class CustomException extends ResponseEntityExceptionHandler {

	@ExceptionHandler(UsersListEmpty.class)
	public final ResponseEntity<Object> handleStudentNotFoundException(Exception ex, WebRequest request) {
		ExceptionResponse exceptionResponse = 
				new ExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<Object>(exceptionResponse, HttpStatus.BAD_REQUEST);
	}
}
