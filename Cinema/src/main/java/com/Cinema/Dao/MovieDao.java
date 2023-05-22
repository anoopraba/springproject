package com.Cinema.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Cinema.Entity.Movie;
import com.Cinema.Repository.MovieRepository;

@Repository
public class MovieDao {
	@Autowired
	MovieRepository mveRepo;
	public String addMve(Movie m) {
		mveRepo.save(m);
		return "Successfully Saved"; 
	}
	
	public String addallmve(List<Movie> m){
		mveRepo.saveAll(m);
		return "successfully saved";
	}

}
