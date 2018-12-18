package io.altar.CinemaTicketSystem.Repositories;

import io.altar.CinemaTicketSystem.Models.Movie;

public class MoviesRepository extends EntityRepository<Movie> {

	private static final MoviesRepository INSTANCE = new MoviesRepository();

	public static MoviesRepository getInstance() {
		return INSTANCE;
	}

	private MoviesRepository() {
	}
	
	protected Class<Movie> getEntityClass() {
		return Movie.class;
	}

	protected String getAllEntityQueryName() {
		return Movie.GET_ALL_MOVIES_QUERY_NAME;
	}

	protected String deleteAllEntityQueryName() {
		return Movie.DELETE_ALL_MOVIES_QUERY_NAME;
	}
}
