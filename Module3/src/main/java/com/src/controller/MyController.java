package com.src.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.src.model.TdsMaster;
import com.src.service.IncomeTaxService;
import com.src.utility.IDNotFoundException;


@RestController    //Used to use REST API like POSTMAN to convert into JSON 
public class MyController {

	
	@Autowired     //Used to call the methods by the help of objects
	IncomeTaxService incomeTaxService;
	
	@GetMapping("/user/tds/{id}")    //method for fetching the data 
	public TdsMaster getByPid(@PathVariable int id) throws IDNotFoundException {
		
		TdsMaster t = incomeTaxService.getById(id);
		if(t==null) {
			throw new IDNotFoundException("ID not found Wrong ID:  "+id);
		}
		else
			return t;
		
	}

	
	
}
