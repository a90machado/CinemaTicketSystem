package io.altar.CinemaTicketSystem.Repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

import io.altar.CinemaTicketSystem.Models.Movie;
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

	// Methods
	public void sessionSchedule(Movie movie, Timer sessionBegin, Timer sessionTerminate, Timer pause) {

		List<Timer> sessionSchedule = new ArrayList<Timer>();

		sessionSchedule.add(sessionBegin);

	}
}
