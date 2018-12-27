package com.midas.model;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.util.MultiValueMap;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;

public class ApiErrors {
	
	private List<String> validationErrors;

	public ApiErrors(Errors error) {
		super();
		this.validationErrors = (List<String>) error;
	}

	public List<String> getValidationErrors() {
		return validationErrors;
	}

	public void setValidationErrors(List<String> validationErrors) {
		this.validationErrors = validationErrors;
	}
	
}
