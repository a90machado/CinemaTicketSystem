package io.altar.CinemaTicketSystem.Business;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import io.altar.CinemaTicketSystem.Models.Movie;
import io.altar.CinemaTicketSystem.Models.Room;
import io.altar.CinemaTicketSystem.ModelsDTO.MovieDTO;
import io.altar.CinemaTicketSystem.ModelsDTO.RoomDTO;
import io.altar.CinemaTicketSystem.ModelsDTO.ScheduleDTO;
import io.altar.CinemaTicketSystem.Repositories.MoviesRepository;

public class MovieBusiness {

	@Inject
	protected MoviesRepository moviesRepository;

	@Inject
	protected ScheduleBusiness scheduleBusiness;

	@Transactional
	public void delete(long id) {
		moviesRepository.removeByID(id);
	}

	@Transactional
	public Movie update(Movie movie) {
		return moviesRepository.update(movie);
	}

	@Transactional
	public Movie create(Movie movie) {
		return moviesRepository.save(movie);
	}

	public List<MovieDTO> getAll() {
		List<Movie> movies = moviesRepository.getAll();
		List<MovieDTO> moviesDTO = new ArrayList<MovieDTO>();

		for (Movie movie : movies) {
			moviesDTO.add(movie.turnToDTO(movie));
		}
		return moviesDTO;
	}

	public MovieDTO findById(long id) {
		return moviesRepository.getById(id).turnToDTO(moviesRepository.getById(id));
	}

	public List<RoomDTO> getAllRoomsFromMovieID(long id) {
		Movie movie = moviesRepository.getById(id);
		List<Room> rooms = new ArrayList<Room>();
		rooms=movie.getRooms();
		List<RoomDTO> roomsDTO = new ArrayList<RoomDTO>();
		for (Room room : rooms) {
			roomsDTO.add(room.turnToDTO(room));
		}
		return roomsDTO;
	}
	
	@Transactional
	public List<ScheduleDTO> getSchedulesFromRoom(long id) {

		List<ScheduleDTO> schedulesDto = new ArrayList<ScheduleDTO>();				
		List<ScheduleDTO> schedulesOfRoom = new ArrayList<ScheduleDTO>();
		List<RoomDTO> roomsDto = new ArrayList<RoomDTO>();
		
		schedulesDto=scheduleBusiness.getAll();
		roomsDto = getAllRoomsFromMovieID(id);
		RoomDTO roomDto = roomsDto.get(0);
				
		for (ScheduleDTO scheduleDto : schedulesDto) {

			if (scheduleDto.getRoomDTO().getId() == roomDto.getId()) {
				schedulesOfRoom.add(scheduleDto);
			}
		}

		return schedulesOfRoom;
	}
}
