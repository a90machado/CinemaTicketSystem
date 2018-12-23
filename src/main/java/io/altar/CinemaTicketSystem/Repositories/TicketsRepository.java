package io.altar.CinemaTicketSystem.Repositories;

import io.altar.CinemaTicketSystem.Models.Ticket;
import io.altar.CinemaTicketSystem.ModelsDTO.TicketDTO;

public class TicketsRepository extends EntityRepository<Ticket, TicketDTO> {

	private static final TicketsRepository INSTANCE = new TicketsRepository();

	public static TicketsRepository getInstance() {
		return INSTANCE;
	}

	private TicketsRepository() {
	}
	
	protected Class<Ticket> getEntityClass() {
		return Ticket.class;
	}
	
	protected Class<TicketDTO> getEntityClassDTO() {
		return TicketDTO.class;
	}

	protected String getAllEntityQueryName() {
		return Ticket.GET_ALL_TICKETS_QUERY_NAME;
	}

	protected String deleteAllEntityQueryName() {
		return Ticket.DELETE_ALL_TICKETS_QUERY_NAME;
	}
}
