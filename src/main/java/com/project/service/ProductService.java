package com.project.service;

import java.util.List;

import com.project.model.Product;

public interface ProductService {

	public Product saveProduct(Product product);
	
	public List<Product> getAllProduct();
	
	public Product getProductById(Integer id);
	
	public void deleteProduct(Integer id);
}
