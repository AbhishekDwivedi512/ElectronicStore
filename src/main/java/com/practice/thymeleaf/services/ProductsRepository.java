package com.practice.thymeleaf.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.thymeleaf.models.Product;

public interface ProductsRepository extends JpaRepository<Product,Integer>
{
	

}
