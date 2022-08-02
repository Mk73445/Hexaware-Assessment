package com.javacodesession.jpa_1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javacodesession.jpa_1.model.Product;
import com.javacodesession.jpa_1.service.ProductServiceImpl;

@RestController
@RequestMapping("/api")
public class ProductController {

	@Autowired
	ProductServiceImpl productServiceImpl;

	@GetMapping("/products")
	public List<Product> getAllProduct() {
		return productServiceImpl.getAllProduct();
	}

	@GetMapping("/prodByName/{name}")
	public Product getProduct(@PathVariable String name) {
		Product proName = productServiceImpl.getProduct(name);
		return proName;
	}

	@GetMapping("/prodbyid/{id}")
	public Product getProductById(@PathVariable long id) {
		Product ptid = productServiceImpl.getById(id);
		return ptid; // return product by id
	}

	@GetMapping("/prodByPrice/{price}")
	public List<Product> getByPrice(@PathVariable double price) {
		List<Product> proPrice = productServiceImpl.getByPrice(price);
		return proPrice;
	}

	@DeleteMapping("/delProd/{id}")
	public List<Product> deleteById(@PathVariable long id) {
		List<Product> prod = productServiceImpl.deleteById(id);
		return prod;

	}
}
