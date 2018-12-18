package io.altar.CinemaTicketSystem.Business;

import java.util.List;
import javax.inject.Inject;
import javax.transaction.Transactional;
import io.altar.CinemaTicketSystem.Models.Movie;
import io.altar.CinemaTicketSystem.Repositories.MoviesRepository;

public class MovieBusiness {

	// Initializing;
	@Inject
	MoviesRepository moviesRepository;

	// Save Product
	@Transactional
	public Movie saveMovie(Movie saveMovie) {
		return moviesRepository.save(saveMovie);
	}

	// Update Product
	@Transactional
	public Movie updateMovie(Movie movie) {
		return moviesRepository.update(movie);
	}

	// Get All Products
	public List<Movie> getAllMovies() {
		return moviesRepository.getAll();
	}

	// Get Product by id
	public Movie getMovieById(long id) {
		return moviesRepository.getById(id);
	}

	// Remove all Products
	@Transactional
	public int removeAllMovies() {
		return moviesRepository.removeAll();
	}

	// Remove Product by id
	@Transactional
	public void removeMovieById(long id) {
		moviesRepository.removeByID(id);
	}

}
