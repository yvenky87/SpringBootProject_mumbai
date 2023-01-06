package deloitte.spring.SpringProjectWeb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import deloitte.spring.SpringProjectWeb.model.Movie;
import deloitte.spring.SpringProjectWeb.respository.MovieRepository;

@RestController
@RequestMapping("/movie")
public class MovieController {
	@Autowired
	MovieRepository repo;

	@PostMapping("/add")
	public void addMovie(@RequestBody Movie movie) {
			repo.save(movie);
	}
}
