package com.product.productservice.service;

import java.util.List;

import com.product.productservice.model.Product;

public interface ProductServiceService {

	List<Product> listAllProducts();

	Product listProductById(long id);

}
