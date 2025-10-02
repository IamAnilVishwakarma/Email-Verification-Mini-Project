package com.springboot.security.config;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import com.springboot.security.entity.User;


public class CustomUser implements UserDetails{
	private User user;
	
	public CustomUser(User user) {
		super();
		this.user = user;
	}


	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
	    SimpleGrantedAuthority authority = new SimpleGrantedAuthority(user.getRole());
	    return Arrays.asList(authority);
	}

	

	@Override
	public String getPassword() {
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		return user.getEmail();
	}
	
	public boolean isAccountNonLocked() {
		return true;
	}
	
	public boolean isCredentialsNonExpired() {
		return true;
	}
	
	public boolean isEnabled() {
		return user.isEnable();
		
	}
}
