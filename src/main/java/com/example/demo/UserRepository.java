package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public class UserRepository {
	public interface TodoRepository extends JpaRepository<UserDetails, String>{
		
	}


}
