package io.altar.CinemaTicketSystem.Business;

import java.util.List;
import javax.inject.Inject;
import javax.transaction.Transactional;
import io.altar.CinemaTicketSystem.Models.Room;
import io.altar.CinemaTicketSystem.Repositories.RoomsRepository;

public class RoomBusiness {

	// Initializing;
	@Inject
	RoomsRepository roomsRepository;

	// Save Product
	@Transactional
	public Room saveMovie(Room saveRoom) {
		return roomsRepository.save(saveRoom);
	}

	// Update Product
	@Transactional
	public Room updateMovie(Room room) {
		return roomsRepository.update(room);
	}

	// Get All Products
	public List<Room> getAllMovies() {
		return roomsRepository.getAll();
	}

	// Get Product by id
	public Room getMovieById(long id) {
		return roomsRepository.getById(id);
	}

	// Remove all Products
	@Transactional
	public int removeAllMovies() {
		return roomsRepository.removeAll();
	}

	// Remove Product by id
	@Transactional
	public void removeMovieById(long id) {
		roomsRepository.removeByID(id);
	}

}
