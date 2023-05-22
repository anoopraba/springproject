package com.Employee;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class EmployeeException {
	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<Object> idNotHere(){
		return new ResponseEntity<>("No employee is present",HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(EmployeeNameNotFoundException.class)
	public ResponseEntity<Object> nameNotHere(){
		return new ResponseEntity<>("this name is not available",HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(AgeNotFoundException.class)
	public ResponseEntity<Object> ageNotHere(){
		return new ResponseEntity<>("no such age",HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(SalaryNotFoundException.class)
	public ResponseEntity<Object> salaryNotHere(){
		return new ResponseEntity<>("Salary is not available in this id",HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(GenderNotFoundException.class)
	public ResponseEntity<Object> genderNotHere(){
		return new ResponseEntity<>("Gender is not available in this id",HttpStatus.NOT_FOUND);
	}


}
