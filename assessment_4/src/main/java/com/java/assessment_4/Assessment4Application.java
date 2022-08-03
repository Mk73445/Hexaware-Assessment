package com.java.assessment_4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.java.assessment_4.model.OutPut com.java.assessment_4.controller")
public class Assessment4Application {

	public static void main(String[] args) {
		SpringApplication.run(Assessment4Application.class, args);
	}

}
