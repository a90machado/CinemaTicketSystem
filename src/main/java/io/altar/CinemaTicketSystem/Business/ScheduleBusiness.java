package io.altar.CinemaTicketSystem.Business;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import io.altar.CinemaTicketSystem.Models.Schedule;
import io.altar.CinemaTicketSystem.ModelsDTO.ScheduleDTO;
import io.altar.CinemaTicketSystem.Repositories.ExibitionDayRepository;
import io.altar.CinemaTicketSystem.Repositories.ScheduleRepository;

public class ScheduleBusiness {

	@Inject
	protected ScheduleRepository schedulesRepository;

	@Inject
	protected RoomBusiness roomBusiness;

	@Inject
	protected ExibitionDayRepository exibitionDayRepository;

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

		for (Schedule schedule : schedules) {
			schedulesDTO.add(schedule.turnToDTO(schedule));
		}
		return schedulesDTO;
	}

	public ScheduleDTO findById(long id) {
		return schedulesRepository.getById(id).turnToDTO(schedulesRepository.getById(id));
	}

	public int getAvailableSeats(long idC, long idM, long idS) {		
		
		List<Schedule> schedules = schedulesRepository.getAll();
		Schedule scheduleSelecteted = schedulesRepository.getById(idS);
		int availableSeats=0;

		for (Schedule schedule : schedules) {
			if (schedule.getExibitionDay().getRoom().getMovie().getId() == idM
					&& schedule.getExibitionDay().getRoom().getCinema().getId() == idC
					&& schedule.getExibitionDay().getDay() == scheduleSelecteted.getExibitionDay().getDay()
					&& schedule.getExibitionDay().getMonth() == scheduleSelecteted.getExibitionDay().getMonth()
					&& schedule.getExibitionDay().getYear() == scheduleSelecteted.getExibitionDay().getYear()
					&& schedule.getSessionBegin() == scheduleSelecteted.getSessionBegin()) {
				availableSeats+=schedule.getAvailableSeats();
			}
		}

		return availableSeats;
	}

	@Transactional
	public List<Boolean> getStructure(long idC, long idM, long idS) {

		List<Schedule> schedules = schedulesRepository.getAll();
		Schedule scheduleSelecteted = schedulesRepository.getById(idS);
		List<Boolean> structures = new ArrayList<Boolean>();

		for (Schedule schedule : schedules) {
			if (schedule.getExibitionDay().getRoom().getMovie().getId() == idM
					&& schedule.getExibitionDay().getRoom().getCinema().getId() == idC
					&& schedule.getExibitionDay().getDay() == scheduleSelecteted.getExibitionDay().getDay()
					&& schedule.getExibitionDay().getMonth() == scheduleSelecteted.getExibitionDay().getMonth()
					&& schedule.getExibitionDay().getYear() == scheduleSelecteted.getExibitionDay().getYear()
					&& schedule.getSessionBegin() == scheduleSelecteted.getSessionBegin()) {
				structures.addAll(schedule.getStructure());
			}

		}

		return structures;
	}

}
