package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class AdminAuthenticationService {

	public boolean authenticate(String username, String password) {
		
		boolean isValidUserName = username.equalsIgnoreCase("shyam");
		boolean isValidPassword = password.equalsIgnoreCase("shyam123");
		
		return isValidUserName && isValidPassword;
	}

}
