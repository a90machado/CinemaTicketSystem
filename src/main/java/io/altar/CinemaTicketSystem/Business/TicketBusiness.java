package io.altar.CinemaTicketSystem.Business;

import java.util.List;
import javax.inject.Inject;
import javax.transaction.Transactional;
import io.altar.CinemaTicketSystem.Models.Ticket;
import io.altar.CinemaTicketSystem.Repositories.TicketsRepository;


public class TicketBusiness {

	// Initializing;
	@Inject
	TicketsRepository ticketsRepository;

	// Save Product
	@Transactional
	public Ticket saveMovie(Ticket saveTicket) {
		return ticketsRepository.save(saveTicket);
	}

	// Update Product
	@Transactional
	public Ticket updateMovie(Ticket ticket) {
		return ticketsRepository.update(ticket);
	}

	// Get All Products
	public List<Ticket> getAllMovies() {
		return ticketsRepository.getAll();
	}

	// Get Product by id
	public Ticket getMovieById(long id) {
		return ticketsRepository.getById(id);
	}

	// Remove all Products
	@Transactional
	public int removeAllMovies() {
		return ticketsRepository.removeAll();
	}

	// Remove Product by id
	@Transactional
	public void removeMovieById(long id) {
		ticketsRepository.removeByID(id);
	}
}
