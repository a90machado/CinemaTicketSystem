package io.altar.CinemaTicketSystem.Business;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import io.altar.CinemaTicketSystem.Models.Cinema;
import io.altar.CinemaTicketSystem.Models.ExibitionDay;
import io.altar.CinemaTicketSystem.Models.Room;
import io.altar.CinemaTicketSystem.Models.Schedule;
import io.altar.CinemaTicketSystem.Models.TypeOfTicket;
import io.altar.CinemaTicketSystem.ModelsDTO.CinemaDTO;
import io.altar.CinemaTicketSystem.Repositories.CinemaRepository;
import io.altar.CinemaTicketSystem.Repositories.ExibitionDayRepository;
import io.altar.CinemaTicketSystem.Repositories.RoomsRepository;
import io.altar.CinemaTicketSystem.Repositories.ScheduleRepository;
import io.altar.CinemaTicketSystem.Repositories.TypeOfTicketRepository;

public class CinemaBusiness {

	@Inject
	protected CinemaRepository cinemaRepository;
	
	@Inject
	protected RoomsRepository roomRepository;
	
	@Inject
	protected TypeOfTicketRepository typeOfTicketRepository;
	
	@Inject
	protected ExibitionDayRepository exibitionDayRepository;
	
	@Inject
	protected ScheduleRepository scheduleRepository;

	@Transactional
	public void delete(long id) {
		
		Cinema cinema = cinemaRepository.getById(id);
		
		if(cinema.getRooms().size()>0) {
			for(Room room: cinema.getRooms()) {
				room.setCinema(null);
				room.setMovie(null);
				roomRepository.removeByID(room.getId());
			}
		}
		if(cinema.getTypeOfTicket().size()>0) {
			for(TypeOfTicket typeOfticket:cinema.getTypeOfTicket()) {
				typeOfticket.setCinema(null);
				typeOfTicketRepository.removeByID(typeOfticket.getId());
			}	
		}
		cinemaRepository.removeByID(id);


	}

	@Transactional
	public Cinema update(Cinema cinema) {
		Cinema cinemaToBeUpdated = cinemaRepository.getById(cinema.getId());
		
		System.out.println(" teste "+cinema.getTimeOpen()+" "+cinemaToBeUpdated.getTimeOpen()+" "+cinema.getTimeClose()+" "+cinemaToBeUpdated.getTimeClose()+" "+cinema.getPause()+" "+cinemaToBeUpdated.getPause());

		
		if(cinema.getTimeOpen()!=cinemaToBeUpdated.getTimeOpen()||cinema.getTimeClose()!=cinemaToBeUpdated.getTimeClose()||cinema.getPause()!=cinemaToBeUpdated.getPause()) {
			List<Room> rooms = cinemaToBeUpdated.getRooms();
			
			
			for(Room room: rooms) {
				
				List<ExibitionDay> exibitionDays = room.getExibitionDays();
				
				for (ExibitionDay exibitionDay: exibitionDays){
					List<Schedule> schedules =new ArrayList<Schedule>();
					
					for(Schedule schedule:schedules) {
						schedule.setExibitionDay(null);
						scheduleRepository.removeByID(schedule.getId());
					}
					
					//exibitionDay.createSchedule(cinema, exibitionDay.getRoom().getMovie());

				}

			}
		}	
		return cinemaRepository.update(cinema);
	}

	@Transactional
	public Cinema create(Cinema cinema) {
		return cinemaRepository.save(cinema);
	}

	public List<CinemaDTO> getAll() {

		List<Cinema> cinemas = cinemaRepository.getAll();
		List<CinemaDTO> cinemasDTO = new ArrayList<CinemaDTO>();

		for (Cinema cinema : cinemas) {
			cinemasDTO.add(cinema.turnToDTO(cinema));
		}
		return cinemasDTO;
	}

	public CinemaDTO findById(long id) {
		return cinemaRepository.getById(id).turnToDTO(cinemaRepository.getById(id));
	}

	@Transactional
	public List<CinemaDTO> findByMovieId(long id) {
		List<Cinema> cinemas = new ArrayList<Cinema>();
		List<CinemaDTO> cinemasDTO = new ArrayList<CinemaDTO>();
		List<Room> rooms = new ArrayList<Room>();
		
		cinemas = cinemaRepository.getAll();
		
		for (Cinema cinema : cinemas) {
			
			rooms = cinema.getRooms();
			
			for (Room room : rooms) {
				
				if (room.getMovie().getId() == id) {
					
					cinemasDTO.add(cinema.turnToDTO(cinema));
						
					break;			
				}
			}
		}
		return cinemasDTO;
	}
}
