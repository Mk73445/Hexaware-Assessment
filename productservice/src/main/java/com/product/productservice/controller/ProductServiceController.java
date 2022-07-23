package com.product.productservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.productservice.model.Product;
import com.product.productservice.service.ProductServiceService;

@RestController
@RequestMapping("/productservice")
public class ProductServiceController {
	
	@Autowired
	ProductServiceService productServiceService;
	
	@GetMapping("/ProductList")
	public List<Product> listAllProducts(){
		//System.out.println("--------------->> : listAllProducts started");
		return productServiceService.listAllProducts();
	}

	@GetMapping("/byId/{id}")
	public Product listProductById(@PathVariable Long id){
		//System.out.println("--------------->> : listProductById started : "+ id);
		Product pt = productServiceService.listProductById(id);
		//System.out.println("--------------->> : listProductById end");
		return pt;
	}

}
