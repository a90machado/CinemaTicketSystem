package io.altar.CinemaTicketSystem.Repositories;

import io.altar.CinemaTicketSystem.Models.Room;

public class RoomsRepository extends EntityRepository<Room> {

	private static final RoomsRepository INSTANCE = new RoomsRepository();

	public static RoomsRepository getInstance() {
		return INSTANCE;
	}

	private RoomsRepository() {
	}
}
