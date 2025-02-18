package com.infodart.jwtapi.service;

import java.util.List;

import com.infodart.jwtapi.dtos.LoginUserDto;
import com.infodart.jwtapi.dtos.RegisterUserDto;
import com.infodart.jwtapi.entity.User;

public interface AuthenticationService {
	
	public User signup(RegisterUserDto input);
	public User authenticate(LoginUserDto input);
	public List<User> allUsers();
}
