package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.demo.AdminAuthenticationService;
import com.example.demo.AdminService;

import java.util.*;
import java.util .List;

@Controller
public class UserController {
	//Map<String,String> map=new HashMap<>();
	@Autowired
	private UserAuthenticationService authenticationService;
	@Autowired
	private AdminService addedService;
	@Autowired
	private UserService userservice;
	@RequestMapping("user")
	public String adminpage()
	{
		return "user";
	}
	@PostMapping("user")
	public String adminauthpage(@RequestParam String name, @RequestParam String password,Model m)
	{
		
		
		if(authenticationService.authenticate(name, password)) {
			

			//Authentication 
			//name - in28minutes
			//password - dummy
			
			return "view";
		}
		return "usererror";
	}
	
	
	
	@RequestMapping("signup")
	public String registrationpage()
	{
		
		return "register";
	}
	
	@PostMapping("signup")
	public String signuppage(@RequestParam String name, @RequestParam String password)
	{
			userservice.evaluate(name,password);
			//System.out.print(userservice.map);
		
		return "redirect:user";
	}
	
	
	
	
	
	@RequestMapping("showmovie")
	public String userpage(ModelMap model)
	{

		List<String> a= addedService.findMovies();
		model.addAttribute("moov", a);
		return "showmovie";
	}
	@RequestMapping("showtheatre")
	public String theatrepage(ModelMap model)
	{

		List<String> a= addedService.findTheatres();
		model.addAttribute("moov", a);
		return "showtheatre";
	}

}
