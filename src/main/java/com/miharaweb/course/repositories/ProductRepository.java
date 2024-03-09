package com.miharaweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miharaweb.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
