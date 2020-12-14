package com.appdeveloperblog.ws.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.appdeveloperblog.ws.shared.dto.UserDto;

public interface UserService extends UserDetailsService {
	
	UserDto createUser(UserDto user);
	UserDto getUser(String email);

}
