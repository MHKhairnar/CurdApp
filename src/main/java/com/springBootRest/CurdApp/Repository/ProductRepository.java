package com.springBootRest.CurdApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springBootRest.CurdApp.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	Product findByName(String name);

	
}
