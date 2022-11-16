package com.example.demo.user;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
@Service
public class UserService {
	Map<String,String> map=new HashMap<>();
	public void evaluate(String name,String password)
	{	
		map.put(name, password);
	}
	
	

}
