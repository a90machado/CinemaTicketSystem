package io.altar.CinemaTicketSystem.Repositories;

import io.altar.CinemaTicketSystem.Models.Room;
import io.altar.CinemaTicketSystem.ModelsDTO.RoomDTO;

public class RoomsRepository extends EntityRepository<Room, RoomDTO> {

	private static final RoomsRepository INSTANCE = new RoomsRepository();

	public static RoomsRepository getInstance() {
		return INSTANCE;
	}

	private RoomsRepository() {
	}

	protected Class<Room> getEntityClass() {
		return Room.class;
	}
	
	protected Class<RoomDTO> getEntityClassDTO() {
		return RoomDTO.class;
	}

	protected String getAllEntityQueryName() {
		return Room.GET_ALL_ROOMS_QUERY_NAME;
	}

	protected String deleteAllEntityQueryName() {
		return Room.DELETE_ALL_ROOMS_QUERY_NAME;
	}
	
}
