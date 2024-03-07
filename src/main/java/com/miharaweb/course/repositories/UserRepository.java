package com.miharaweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miharaweb.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
