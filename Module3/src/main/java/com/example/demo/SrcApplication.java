package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan("com.src.controller")
@ComponentScan("com.src.dao")
@ComponentScan("com.src.service")
@ComponentScan("com.src.model")
@EntityScan(basePackages = {"com.src.model"})
@SpringBootApplication      //to ensure that boot features can be performed
public class SrcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SrcApplication.class, args);
	}

}
