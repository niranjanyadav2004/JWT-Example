package com.niranjan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.niranjan.entity.User;
import com.niranjan.repo.userRepository;

@Service
public class CustomUserDetailService implements UserDetailsService{
	
	@Autowired
	private userRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByEmail(username).orElseThrow(()-> new RuntimeException("User not found...!!!"));
		return user;
	}

}
