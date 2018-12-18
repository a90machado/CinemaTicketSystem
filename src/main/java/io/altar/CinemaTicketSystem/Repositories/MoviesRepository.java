package io.altar.CinemaTicketSystem.Repositories;

import io.altar.CinemaTicketSystem.Models.Movie;

public class MoviesRepository extends EntityRepository<Movie> {

	private static final MoviesRepository INSTANCE = new MoviesRepository();

	public static MoviesRepository getInstance() {
		return INSTANCE;
	}

	private MoviesRepository() {
	}
}
