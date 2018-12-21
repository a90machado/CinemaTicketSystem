package io.altar.CinemaTicketSystem.Business;

import javax.inject.Inject;
import javax.transaction.Transactional;

import io.altar.CinemaTicketSystem.Models.Room;
import io.altar.CinemaTicketSystem.Repositories.RoomsRepository;

public class RoomBusiness extends EntityBusiness<RoomsRepository, Room> {
	@Inject
	ScheduleBusiness business;

	@Transactional
	public Room create(Room room) {
		repository.save(room);
		room.createSchedule(room.getCinema(), room.getMovie());
		return room;
	}
}
