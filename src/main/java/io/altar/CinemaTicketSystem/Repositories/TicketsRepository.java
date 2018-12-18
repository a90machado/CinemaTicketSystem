package io.altar.CinemaTicketSystem.Repositories;

import io.altar.CinemaTicketSystem.Models.Ticket;

public class TicketsRepository extends EntityRepository<Ticket> {

	private static final TicketsRepository INSTANCE = new TicketsRepository();

	public static TicketsRepository getInstance() {
		return INSTANCE;
	}

	private TicketsRepository() {
	}
}
