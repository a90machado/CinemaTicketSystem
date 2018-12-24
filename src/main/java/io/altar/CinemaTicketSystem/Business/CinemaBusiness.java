package io.altar.CinemaTicketSystem.Business;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import io.altar.CinemaTicketSystem.Models.Cinema;
import io.altar.CinemaTicketSystem.Repositories.CinemaRepository;

public class CinemaBusiness{
	
	@Inject
	protected CinemaRepository cinemaRepository;

	@Transactional
	public void delete(long id) {
		cinemaRepository.removeByID(id);
	}

	@Transactional
	public Cinema update(Cinema cinema) {
		return cinemaRepository.update(cinema);
	}

	@Transactional
	public Cinema create(Cinema cinema) {
		return cinemaRepository.save(cinema);
	}

	public List<Cinema> getAll() {
		return cinemaRepository.getAll();
	}

	public Cinema findById(long id) {
		return cinemaRepository.getById(id);
	}
}
