package io.altar.CinemaTicketSystem.Business;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import io.altar.CinemaTicketSystem.Models.Movie;
import io.altar.CinemaTicketSystem.Models.Schedule;
import io.altar.CinemaTicketSystem.Repositories.MoviesRepository;
import io.altar.CinemaTicketSystem.Repositories.ScheduleRepository;

public class ScheduleBusiness {
	
	@Inject
	protected ScheduleRepository schedulesRepository;

	@Transactional
	public void delete(long id) {
		schedulesRepository.removeByID(id);
	}

	@Transactional
	public Schedule update(Schedule schedule) {
		return schedulesRepository.update(schedule);
	}

	@Transactional
	public Schedule create(Schedule schedule) {
		return schedulesRepository.save(schedule);
	}

	public List<Schedule> getAll() {
		return schedulesRepository.getAll();
	}

	public Schedule findById(long id) {
		return schedulesRepository.getById(id);
	}
}
