package io.altar.CinemaTicketSystem.Repositories;

import io.altar.CinemaTicketSystem.Models.Schedule;
import io.altar.CinemaTicketSystem.ModelsDTO.ScheduleDTO;

public class ScheduleRepository extends EntityRepository<Schedule, ScheduleDTO>{

	private static final ScheduleRepository INSTANCE = new ScheduleRepository();

	public static ScheduleRepository getInstance() {
		return INSTANCE;
	}

	private ScheduleRepository() {
	}

	protected Class<Schedule> getEntityClass() {
		return Schedule.class;
	}
	
	protected Class<ScheduleDTO> getEntityClassDTO() {
		return ScheduleDTO.class;
	}

	protected String getAllEntityQueryName() {
		return Schedule.GET_ALL_SCHEDULES_QUERY_NAME;
	}

	protected String deleteAllEntityQueryName() {
		return Schedule.DELETE_ALL_SCHEDULES_QUERY_NAME;
	}
}
