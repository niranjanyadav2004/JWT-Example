package com.niranjan.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.niranjan.entity.RefreshToken;


public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Integer> {

	Optional<RefreshToken> findByRefresToken(String refresToken);
	
}
