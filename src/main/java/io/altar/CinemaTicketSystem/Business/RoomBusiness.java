package io.altar.CinemaTicketSystem.Business;

import javax.transaction.Transactional;

import io.altar.CinemaTicketSystem.Models.Room;
import io.altar.CinemaTicketSystem.Repositories.RoomsRepository;

public class RoomBusiness extends EntityBusiness<RoomsRepository, Room> {

	@Transactional
	public Room create(Room room) {
		room.setAvailableSeats();	
		return repository.save(room);		
	}
}
