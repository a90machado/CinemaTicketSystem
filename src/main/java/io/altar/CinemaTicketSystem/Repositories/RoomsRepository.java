package io.altar.CinemaTicketSystem.Repositories;


import io.altar.CinemaTicketSystem.Models.Room;

public class RoomsRepository extends EntityRepository<Room> {

	private static final RoomsRepository INSTANCE = new RoomsRepository();

	public static RoomsRepository getInstance() {
		return INSTANCE;
	}

	private RoomsRepository() {
	}
	
	protected Class<Room> getEntityClass() {
		return Room.class;
	}

	protected String getAllEntityQueryName() {
		return Room.GET_ALL_ROOMS_QUERY_NAME;
	}

	protected String deleteAllEntityQueryName() {
		return Room.DELETE_ALL_ROOMS_QUERY_NAME;
	}
}
