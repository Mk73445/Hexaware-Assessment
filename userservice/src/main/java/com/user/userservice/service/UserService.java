package com.user.userservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.userservice.feignclient.ProductServiceClient;
import com.user.userservice.model.Product;

@Service
public class UserService {

	@Autowired
	ProductServiceClient productServiceFeignClient;

	public List<Product> getAllProducts() {
		List<Product> productList = productServiceFeignClient.getListOfProducts();
		return productList;
	}
	
	public Product getProductById(Long id) {
		Product product = productServiceFeignClient.getProductById(id);
		return product;
	}

}
