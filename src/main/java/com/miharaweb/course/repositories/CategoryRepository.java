package com.miharaweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miharaweb.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
