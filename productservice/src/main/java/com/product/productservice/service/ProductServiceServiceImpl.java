package com.product.productservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.productservice.model.Product;
import com.product.productservice.repository.ProductServiceRepository;

@Service
public class ProductServiceServiceImpl implements ProductServiceService {

		@Autowired
		ProductServiceRepository productServiceRepository;

		@Override
		public List<Product> listAllProducts() {
			List<Product> list = productServiceRepository.findAll();
			return list;
		}

		@Override
		public Product listProductById(long id) {
			//System.out.println("--------------->> : ProductServiceServiceImpl listProductById started");
			Optional<Product> prod = productServiceRepository.findById(id);
			if (prod.isPresent()) {
				Product pt = prod.get();
			//	System.out.println("--------------->> :  ProductServiceServiceImpl listProductById end");
				return pt;
			}
			//System.out.println("--------------->> : ProductServiceServiceImpl listProductById end");
			return prod.orElse(null);
		}

}
