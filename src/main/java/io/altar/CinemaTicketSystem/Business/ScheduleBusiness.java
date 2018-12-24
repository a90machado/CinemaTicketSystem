package io.altar.CinemaTicketSystem.Business;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import io.altar.CinemaTicketSystem.Models.Movie;
import io.altar.CinemaTicketSystem.Models.Schedule;
import io.altar.CinemaTicketSystem.Models.Ticket;
import io.altar.CinemaTicketSystem.ModelsDTO.ScheduleDTO;
import io.altar.CinemaTicketSystem.ModelsDTO.TicketDTO;
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

	public List<ScheduleDTO> getAll() {
		List<Schedule> schedules = schedulesRepository.getAll();
		List<ScheduleDTO> schedulesDTO = new ArrayList<ScheduleDTO>();
		
		for (Schedule schedule: schedules) {
			schedulesDTO.add(schedule.turnToDTO(schedule));
		}
		return schedulesDTO;
	}

	public ScheduleDTO findById(long id) {
		return schedulesRepository.getById(id).turnToDTO(schedulesRepository.getById(id));
	}
}
