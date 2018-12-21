package io.altar.CinemaTicketSystem.Repositories;

import io.altar.CinemaTicketSystem.Models.Cinema;


public class CinemaRepository extends EntityRepository<Cinema>{
	
	private static final CinemaRepository INSTANCE = new CinemaRepository();

	public static CinemaRepository getInstance() {
		return INSTANCE;
	}

	private CinemaRepository() {
	}

	protected Class<Cinema> getEntityClass() {
		return Cinema.class;
	}

	protected String getAllEntityQueryName() {
		return Cinema.GET_ALL_CINEMAS_QUERY_NAME;
	}

	protected String deleteAllEntityQueryName() {
		return Cinema.DELETE_ALL_CINEMAS_QUERY_NAME;
	}


}
