package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserAuthenticationService {
	@Autowired
	private UserService userservice;
public boolean authenticate(String username, String password) {
			int length=userservice.map.size();
			for(String str: userservice.map.keySet())
			{	
				if(username.equalsIgnoreCase(str))
				{
				boolean isValidUserName = username.equalsIgnoreCase(str);
				boolean isValidPassword = password.equalsIgnoreCase(userservice.map.get(str));
				return isValidUserName && isValidPassword;
				}
				
			}
	
		if(username.equalsIgnoreCase("shyam"))
		{
		boolean isValidUserName = username.equalsIgnoreCase("shyam");
		boolean isValidPassword = password.equalsIgnoreCase("123");
		return isValidUserName && isValidPassword;
		}
		if(username.equalsIgnoreCase("bhanu"))
		{
		boolean isValidUserName = username.equalsIgnoreCase("bhanu");
		boolean isValidPassword = password.equalsIgnoreCase("456");
		return isValidUserName && isValidPassword;
		}
		if(username.equalsIgnoreCase("anvesh"))
		{
		boolean isValidUserName = username.equalsIgnoreCase("anvesh");
		boolean isValidPassword = password.equalsIgnoreCase("789");
		return isValidUserName && isValidPassword;
		}
		if(username.equalsIgnoreCase("niru"))
		{
		boolean isValidUserName = username.equalsIgnoreCase("niru");
		boolean isValidPassword = password.equalsIgnoreCase("000");
		return isValidUserName && isValidPassword;
		}
		 return false;
		
	}


}
