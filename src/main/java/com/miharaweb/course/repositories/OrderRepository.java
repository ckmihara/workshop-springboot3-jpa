package com.miharaweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miharaweb.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
