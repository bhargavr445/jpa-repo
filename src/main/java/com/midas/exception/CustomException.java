package com.midas.exception;

import java.util.Date;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.midas.model.ExceptionResponse;
@ControllerAdvice
@RestController
public class CustomException extends ResponseEntityExceptionHandler {

	@ExceptionHandler(UsersListEmpty.class)
	public final ResponseEntity<Object> handleStudentNotFoundException(Exception ex, WebRequest request) {
		ExceptionResponse exceptionResponse = 
				new ExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<Object>(exceptionResponse, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(ValidationError.class)
	public final ResponseEntity<Object> pocValidationException(Exception ex, WebRequest request, List<ObjectError> allErrors) {
		ExceptionResponse exceptionResponse = 
				new ExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false));
		for(ObjectError validationError: allErrors) {
			//int i=0;
			System.out.println(validationError.getDefaultMessage());
		}
		return new ResponseEntity<Object>(exceptionResponse, HttpStatus.NOT_ACCEPTABLE);
	}
	
}
