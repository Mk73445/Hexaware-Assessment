package com.javacodesession.jpa_1.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javacodesession.jpa_1.model.Product;
import com.javacodesession.jpa_1.repository.ProductRepository;

@Service
public class ProductServiceImpl {

	@Autowired
	ProductRepository productRepository;

	// @Override
	public List<Product> getAllProduct() {
		return productRepository.findAll();
	}

	// @Override
	public Product getProduct(String name) {
		List<Product> productsList = productRepository.findAll();
		Optional<Product> product = productsList.stream().filter(p -> p.getName().equals(name)).findFirst();
		return product.orElse(null);
	}

	// @Override
	public Product getById(long id) {
		Optional<Product> product = productRepository.findById(id);
		if (product.isPresent()) {
			Product p = product.get();
			return p;
		}
		return product.orElse(null);
	}

	// @Override
	public List<Product> getByPrice(double price) {
		List<Product> prodList = productRepository.findAll();
		List<Product> proPrice = prodList.stream().filter(p -> p.getPrice() < 1000).collect(Collectors.toList());
		                            // findFirst();
		return proPrice;
	}

	// @Override
	public List<Product> deleteById(long id) {
		List<Product> pList = productRepository.findAll();
		for (Product pro : pList) {
			if (pro.getProduct_id() == id) {
				pList.remove(pro);
			}
		}
		return pList;
	}
	/*
	 * List<Product> productsList = productRepository.findAll(); Optional<Product>
	 * product = productsList.removeIf(t -> t.getId().equals(id)); Optional<Product>
	 * product = productsList.stream().filter(p -> p.getId(). //.findFirst(); return
	 * product.orElse(null);
	 * 
	 * //productRepository.deleteById(id); // call a method from CrudRepository
	 * interface //Optional<Product> product = Optional.empty(); //return product; }
	 */

}
