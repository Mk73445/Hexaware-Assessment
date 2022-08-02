package com.javacodesession.jpa_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javacodesession.jpa_1.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	

}
