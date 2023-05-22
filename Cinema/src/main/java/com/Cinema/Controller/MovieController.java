package com.Cinema.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Cinema.Entity.Movie;
import com.Cinema.Service.MovieService;

@RestController
public class MovieController {
	@Autowired
	MovieService mveSer;
	
	@PostMapping(value="/addMve")
	public String addMve(@RequestBody Movie m) {
		return mveSer.addMve(m);
	}
	
	@PostMapping(value="addallmve")
	public String addallmve(@RequestBody List<Movie> m){
		return mveSer.addallmve(m);
	}

}
