package com.midas.exception;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
public class ValidationError extends RuntimeException {

	public ValidationError(List<ObjectError> allErrors) {
		super();
		// TODO Auto-generated constructor stub
		for(ObjectError validationError : allErrors) {
			System.out.println(allErrors.size());
			System.out.println(validationError.getDefaultMessage());
		}
	}
}
