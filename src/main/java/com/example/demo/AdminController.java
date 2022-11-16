package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller

public class AdminController {

	@Autowired
	private AdminAuthenticationService authenticationService;
	@Autowired
	private AdminService adService;
	
	@RequestMapping("admin")
	public String adminpage()
	{
		return "admin";
	}
	@PostMapping("admin")
	public String adminauthpage(@RequestParam String name, @RequestParam String password,Model m)
	{
		if(authenticationService.authenticate(name, password)) {
			
			
			//Authentication 
			//name - in28minutes
			//password - dummy
			
			return "welcome";
		}
		return "adminerror";
	}
	@RequestMapping("addmovie")
	public String addMove()
	{
		
		return "addmovie";
	}
	@PostMapping("addmovie")
	public String addMov(@RequestParam String moviename, ModelMap m)
	{
		List<String> a=adService.addMovie(moviename);
		return "success";
	}
	@RequestMapping("addTheatre")
	public String addT()
	{
		
		return "addtheatre";
	}
	@PostMapping("addTheatre")
	public String addTi(@RequestParam String theatrename)
	{
		adService.addTheatre(theatrename);
		return "success";
	}
}
