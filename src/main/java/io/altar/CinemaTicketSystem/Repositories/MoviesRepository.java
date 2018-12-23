package io.altar.CinemaTicketSystem.Repositories;

import io.altar.CinemaTicketSystem.Models.Movie;
import io.altar.CinemaTicketSystem.ModelsDTO.MovieDTO;

public class MoviesRepository extends EntityRepository<Movie, MovieDTO> {

	private static final MoviesRepository INSTANCE = new MoviesRepository();

	public static MoviesRepository getInstance() {
		return INSTANCE;
	}

	private MoviesRepository() {
	}
	
	protected Class<Movie> getEntityClass() {
		return Movie.class;
	}
	
	protected Class<MovieDTO> getEntityClassDTO() {
		return MovieDTO.class;
	}

	protected String getAllEntityQueryName() {
		return Movie.GET_ALL_MOVIES_QUERY_NAME;
	}

	protected String deleteAllEntityQueryName() {
		return Movie.DELETE_ALL_MOVIES_QUERY_NAME;
	}
}
