package com.niranjan.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.niranjan.entity.User;

public interface userRepository extends JpaRepository<User, String> {

	public Optional<User> findByEmail(String email);
	
}
