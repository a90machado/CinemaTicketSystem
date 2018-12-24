package io.altar.CinemaTicketSystem.Business;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import io.altar.CinemaTicketSystem.Models.Cinema;
import io.altar.CinemaTicketSystem.Models.Movie;
import io.altar.CinemaTicketSystem.Repositories.CinemaRepository;
import io.altar.CinemaTicketSystem.Repositories.MoviesRepository;

public class MovieBusiness{
	
	@Inject
	protected MoviesRepository moviesRepository;

	@Transactional
	public void delete(long id) {
		moviesRepository.removeByID(id);
	}

	@Transactional
	public Movie update(Movie movie) {
		return moviesRepository.update(movie);
	}

	@Transactional
	public Movie create(Movie movie) {
		return moviesRepository.save(movie);
	}

	public List<Movie> getAll() {
		return moviesRepository.getAll();
	}

	public Movie findById(long id) {
		return moviesRepository.getById(id);
	}
}
