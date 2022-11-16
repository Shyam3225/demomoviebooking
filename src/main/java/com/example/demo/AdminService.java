package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class AdminService {
	 public static List<String> movies = new ArrayList<>();
	public static List<String> theatres = new ArrayList<>();

	static {
		movies.add("Pokiri");
		movies.add("Baahubali");
		movies.add("RRR");
		movies.add("Jalsa");
		theatres.add("Sandhya 70mm");
		theatres.add("Sudarshan 35mm");
		theatres.add("PVR");
		theatres.add("INOX");
		
	}
	public List<String> addMovie(String moviename){
		movies.add(moviename);
		return movies;
	}
	public void addTheatre(String tname){
		theatres.add(tname);
	}
	public List<String> findMovies()
	{
		return movies;
	}
	public List<String> findTheatres()
	{
		return theatres;
	}
	
	
}
