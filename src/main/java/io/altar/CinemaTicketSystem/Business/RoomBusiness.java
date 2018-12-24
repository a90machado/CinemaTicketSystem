package io.altar.CinemaTicketSystem.Business;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import io.altar.CinemaTicketSystem.Models.Movie;
import io.altar.CinemaTicketSystem.Models.Room;
import io.altar.CinemaTicketSystem.Repositories.MoviesRepository;
import io.altar.CinemaTicketSystem.Repositories.RoomsRepository;

public class RoomBusiness {
	
	@Inject
	protected RoomsRepository roomsRepository;

	@Transactional
	public void delete(long id) {
		roomsRepository.removeByID(id);
	}

	@Transactional
	public Room update(Room room) {
		return roomsRepository.update(room);
	}

	@Transactional
	public Room create(Room room) {
		room = roomsRepository.save(room);
		room.createSchedule(room.getCinema(), room.getMovie());
		//room.getCinema().addRoom(room);
		return room;
	}

	public List<Room> getAll() {
		return roomsRepository.getAll();
	}

	public Room findById(long id) {
		return roomsRepository.getById(id);
	}

	
}
