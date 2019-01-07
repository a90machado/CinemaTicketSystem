package io.altar.CinemaTicketSystem.Repositories;

import io.altar.CinemaTicketSystem.Models.TypeOfTicket;

public class TypeOfTicketRepository extends EntityRepository<TypeOfTicket> {

	private static final TypeOfTicketRepository INSTANCE = new TypeOfTicketRepository();
	
	public static TypeOfTicketRepository getInstance() {
		return INSTANCE;
	}

	private TypeOfTicketRepository() {
	}

	protected Class<TypeOfTicket> getEntityClass() {
		return TypeOfTicket.class;
	}

	protected String getAllEntityQueryName() {
		return TypeOfTicket.GET_ALL_TYPEOFTICKETS_QUERY_NAME;
	}

	protected String deleteAllEntityQueryName() {
		return TypeOfTicket.DELETE_ALL_TYPEOFTICKETS_QUERY_NAME;
	}
}
