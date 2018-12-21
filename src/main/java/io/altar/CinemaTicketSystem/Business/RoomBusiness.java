package io.altar.CinemaTicketSystem.Business;

import javax.transaction.Transactional;
import io.altar.CinemaTicketSystem.Models.Room;
import io.altar.CinemaTicketSystem.Repositories.RoomsRepository;

public class RoomBusiness extends EntityBusiness<RoomsRepository, Room> {

	@Transactional
	public Room create(Room room) {
		room = repository.save(room);
		room.createSchedule(room.getCinema(), room.getMovie());
		//room.getCinema().addRoom(room);
		return room;
	}
}
