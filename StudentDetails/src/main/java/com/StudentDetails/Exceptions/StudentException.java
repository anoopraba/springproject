package com.StudentDetails.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class StudentException {
	
	@org.springframework.web.bind.annotation.ExceptionHandler(StudentAgeIsBelow18.class)
	public ResponseEntity<Object> ageExceptionHandler(){
		return new ResponseEntity<Object>("Below 18 age found",HttpStatus.BAD_REQUEST);

}
}