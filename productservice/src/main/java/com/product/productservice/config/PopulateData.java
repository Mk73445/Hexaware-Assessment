package com.product.productservice.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.product.productservice.model.Product;
import com.product.productservice.repository.ProductServiceRepository;


@Component
public class PopulateData implements CommandLineRunner {

	@Autowired
	ProductServiceRepository productServiceRepository;
	
	
	@Override
	public void run(String... args) throws Exception {

		// Enter data
		Product p1 = new Product(101, "Galaxy", 1200);
		productServiceRepository.save(p1);
		
		Product p2 = new Product(202, "iphone 13", 1300);
		productServiceRepository.save(p2);
		
		Product p3 = new Product(303, "Pixel", 900);
		productServiceRepository.save(p3);
	}

}
