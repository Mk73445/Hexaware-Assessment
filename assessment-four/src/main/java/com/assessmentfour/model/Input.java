package com.assessmentfour.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class Input {
	
	@Size(min = 4, message="Name should be at least 4 characters")
	private String name;
	
	@Email(message="Please enter valid email")
	private String email;
	
	@Min(value = 1000, message="Salary should be more than 1000")
	private double salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
