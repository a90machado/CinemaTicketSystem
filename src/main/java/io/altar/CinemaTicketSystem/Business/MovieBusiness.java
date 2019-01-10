package io.altar.CinemaTicketSystem.Business;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.BadRequestException;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
import javax.ws.rs.core.Response.Status;

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
	public Response update(Movie movie) {
		if (movie.getReleaseDate().getTime()<=movie.getEndDate().getTime()){
		moviesRepository.update(movie);
		return Response.status(Response.Status.OK).build();}
		else{
			throw new BadRequestException("endDate must be a date equal to releaseDate or after releasedate.");
		}
	}

	@Transactional
	public Response create(Movie movie) {
		if (movie.getReleaseDate().getTime()<=movie.getEndDate().getTime()){
			moviesRepository.save(movie);
			return Response.status(Response.Status.OK).build();
		}
		else{
			throw new BadRequestException("endDate must be a date equal to releaseDate or after releasedate.");
		} 
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

			if (scheduleDto.getExibitionDayDTO().getRoomDto().getId() == roomDto.getId()) {
				schedulesOfRoom.add(scheduleDto);
			}
		}

		return schedulesOfRoom;
	}
}
