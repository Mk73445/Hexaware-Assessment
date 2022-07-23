package com.user.userservice.feignclient;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.user.userservice.model.Product;

@FeignClient(value = "productservice", url = "http://localhost:2220/productservice")
public interface ProductServiceClient {

	@GetMapping("/ProductList")
	List<Product> getListOfProducts();

	@GetMapping("/byId/{id}")
	Product getProductById(@PathVariable Long id);
}
