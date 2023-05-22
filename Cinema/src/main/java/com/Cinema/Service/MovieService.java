package com.Cinema.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Cinema.Dao.MovieDao;
import com.Cinema.Entity.Movie;

@Service
public class MovieService {
	@Autowired
	MovieDao mveDao;
	
	public String addMve(Movie m) {
		return mveDao.addMve(m);
	}
	
	public String addallmve(List<Movie> m){
		return mveDao.addallmve(m);
	}
	

}
