package io.altar.CinemaTicketSystem.Business;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import io.altar.CinemaTicketSystem.Models.Movie;
import io.altar.CinemaTicketSystem.ModelsDTO.MovieDTO;
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

	public List<MovieDTO> getAll() {
		List<Movie> movies = moviesRepository.getAll();
		List<MovieDTO> moviesDTO = new ArrayList<MovieDTO>();
		
		for (Movie movie: movies) {
			moviesDTO.add(movie.turnToDTO(movie));
		}
		return moviesDTO;
	}

	public MovieDTO findById(long id) {
		return moviesRepository.getById(id).turnToDTO(moviesRepository.getById(id));
	}
}
