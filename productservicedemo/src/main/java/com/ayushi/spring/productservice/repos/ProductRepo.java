package com.ayushi.spring.productservice.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ayushi.spring.productservice.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
