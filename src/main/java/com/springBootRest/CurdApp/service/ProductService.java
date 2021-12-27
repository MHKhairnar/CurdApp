package com.springBootRest.CurdApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBootRest.CurdApp.Repository.ProductRepository;
import com.springBootRest.CurdApp.entity.Product;



@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public Product saveProduct(Product product) {
		
	return	repository.save(product);
		
	}
	
	
	public  List<Product> saveProducts(List<Product>  products) {
		
		return	repository.saveAll(products);
			
		}
	
	public List<Product> getProducts(){
		
		return repository.findAll();
	}
	
	
public Optional<Product> getProductById(int id){
		
		return repository.findById(id);
	}


public Product getProductByName(String name){
	
	return repository.findByName(name);
}
	
	public String deleteProduct(int id) {
		
		repository.deleteById(id);
		return "product removed !! "+id;
	}
	
	
	public Product updateProduct(Product product) {
		
		Product existingProduct=repository.findById(product.getId()).orElse(product);
		
		existingProduct.setName(product.getName());
		existingProduct.setQuntity(product.getQuntity());
		existingProduct.setPrice(product.getPrice());
		
		return repository.save(existingProduct);
	}
	
	
}

