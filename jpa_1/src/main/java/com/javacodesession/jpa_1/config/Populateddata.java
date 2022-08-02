package com.javacodesession.jpa_1.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.javacodesession.jpa_1.model.Product;
import com.javacodesession.jpa_1.repository.ProductRepository;

@Component
public class Populateddata implements CommandLineRunner{

	
	@Autowired
	ProductRepository productRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		Product p1 = new Product();
		p1.setProduct_id(400);
		p1.setName("MacBook");
		p1.setBrand("Apple");
		p1.setPrice(4000);
		productRepository.save(p1);
		
		Product p2 = new Product();
		p2.setProduct_id(401);
		p2.setName("iphone 10");
		p2.setBrand("Apple");
		p2.setPrice(1200);
		productRepository.save(p2);
		
		Product p3 = new Product();
		p3.setProduct_id(100);
		p3.setName("Kindle Fire");
		p3.setBrand("Amazon");
		p3.setPrice(100);
		productRepository.save(p3);
		
		Product p4 = new Product();
		p4.setProduct_id(200);
		p4.setName("inspiron 15");
		p4.setBrand("Dell");
		p4.setPrice(600);
		productRepository.save(p4);
		
		Product p5 = new Product();
		p5.setProduct_id(300);
		p5.setName("Galaxy 10");
		p5.setBrand("Samsung");
		p5.setPrice(700);
		productRepository.save(p5);
		
		Product p6 = new Product();
		p6.setProduct_id(500);
		p6.setName("Mazda 3");
		p6.setBrand("Honda");
		p6.setPrice(13000);
		productRepository.save(p6);
		
	}

}
