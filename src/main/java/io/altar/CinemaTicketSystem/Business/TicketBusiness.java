package io.altar.CinemaTicketSystem.Business;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import io.altar.CinemaTicketSystem.Models.Movie;
import io.altar.CinemaTicketSystem.Models.Ticket;
import io.altar.CinemaTicketSystem.Repositories.MoviesRepository;
import io.altar.CinemaTicketSystem.Repositories.TicketsRepository;


public class TicketBusiness extends EntityBusiness<TicketsRepository, Ticket> {
	
	@Inject
	protected TicketsRepository ticketsRepository;

	@Transactional
	public void delete(long id) {
		ticketsRepository.removeByID(id);
	}

	@Transactional
	public Ticket update(Ticket ticket) {
		return ticketsRepository.update(ticket);
	}

	@Transactional
	public Ticket create(Ticket ticket) {
		return ticketsRepository.save(ticket);
	}

	public List<Ticket> getAll() {
		return ticketsRepository.getAll();
	}

	public Ticket findById(long id) {
		return ticketsRepository.getById(id);
	}

}
