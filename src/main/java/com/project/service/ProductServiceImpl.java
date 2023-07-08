package com.project.service;

import java.util.List;

import com.project.model.Product;
import com.project.repository.ProductRepository;

public class ProductServiceImpl implements ProductService {
	
	private ProductRepository productRepo;

	@Override
	public Product saveProduct(Product product) {
		
		return productRepo.save(product);
	}

	@Override
	public List<Product> getAllProduct() {
		
		return productRepo.findAll();
	}

	@Override
	public Product getProductById(Integer id) {
		
		return productRepo.findById(id).get();
	}

	@Override
	public void deleteProduct(Integer id) {
		
		
	}

}
