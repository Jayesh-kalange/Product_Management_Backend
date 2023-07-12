package com.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.model.Product;
import com.project.repository.ProductRepository;

@Service
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
	public String deleteProduct(Integer id) {
		
		Product product = productRepo.findById(id).get();
		
		if(product != null)
		{
			productRepo.delete(product);
			return "Product Deleted Sucessfully";
		}
		
		return "Something Wrong On Server";	
	}

}
