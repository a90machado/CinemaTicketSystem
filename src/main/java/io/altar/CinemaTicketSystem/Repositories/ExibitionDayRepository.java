package io.altar.CinemaTicketSystem.Repositories;

import io.altar.CinemaTicketSystem.Models.ExibitionDay;

public class ExibitionDayRepository extends EntityRepository<ExibitionDay>{
	
	private static final ExibitionDayRepository INSTANCE = new ExibitionDayRepository();

	public static ExibitionDayRepository getInstance() {
		return INSTANCE;
	}

	private ExibitionDayRepository() {
	}

	protected Class<ExibitionDay> getEntityClass() {
		return ExibitionDay.class;
	}

	protected String getAllEntityQueryName() {
		return ExibitionDay.GET_ALL_EXIBITIONDAYS_QUERY_NAME;
	}

	protected String deleteAllEntityQueryName() {
		return ExibitionDay.DELETE_ALL_EXIBITIONDAYS_QUERY_NAME;
	}

}
