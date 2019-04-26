package com.src.controller;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.src.model.ErrorDetails;
import com.src.utility.IDNotFoundException;


@ControllerAdvice     //To use controller to handle what kind of exception to be caught customly
@RestController      //To use REST API 
public class ExceptionHandlerClass extends ResponseEntityExceptionHandler {
	@ExceptionHandler(value = IDNotFoundException.class)   //Handles the exception
	 public final ResponseEntity<ErrorDetails> handleNotFoundException(IDNotFoundException ex, WebRequest request) {
		com.src.model.ErrorDetails errorDetails = new ErrorDetails(new Date(), ex.getMessage(),
		        request.getDescription(false));
		    return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
	   }
	
}
