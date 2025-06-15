package com.niranjan.entity;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class User implements UserDetails {
  
	private static final long serialVersionUID = 1L;
	
	@Id
	private String userID;
	private String name;
	private String email;
	private String password;
	private String about;
	
	@OneToOne(mappedBy = "user")
	@JsonIgnore
	private RefreshToken refreshToken;
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}

	 @Override
	 public String getUsername() {
	 	return this.email;
	 }

	 @Override
	 public boolean isAccountNonLocked() {
	        return true;
	 }

	 @Override
	 public boolean isAccountNonExpired() {
	      return true; 
	 }

	 @Override
	 public boolean isCredentialsNonExpired() {
	     return true;
	 }

	 @Override
	 public boolean isEnabled() {
	     return true;
	 }
	
}
