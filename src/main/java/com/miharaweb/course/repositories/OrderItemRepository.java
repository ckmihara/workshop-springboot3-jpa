package com.miharaweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miharaweb.course.entities.OrderItem;
import com.miharaweb.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	
}
