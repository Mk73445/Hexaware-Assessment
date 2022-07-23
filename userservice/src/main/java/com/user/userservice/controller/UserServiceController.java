package com.user.userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.userservice.model.Product;
import com.user.userservice.service.UserService;

@RestController
@RequestMapping("/userservice")
public class UserServiceController {

	@Autowired
	UserService service;

	@GetMapping("/productsList")
	public List<Product> getListOfProducts() {
		List<Product> products = service.getAllProducts();
		return products;
	}

	@GetMapping("/product/{id}")
	public Product getProduct(@PathVariable Long id) {
		Product products = service.getProductById(id);
		return products;
	}
}
