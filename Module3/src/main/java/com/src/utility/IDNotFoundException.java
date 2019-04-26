package com.src.utility;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)   //To understand  the user where the page and status of the application  
public class IDNotFoundException extends Exception {
	
	public IDNotFoundException(String msg) {
		super(msg);
	}

}
