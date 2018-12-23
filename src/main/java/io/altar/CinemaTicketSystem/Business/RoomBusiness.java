package io.altar.CinemaTicketSystem.Business;

import javax.transaction.Transactional;
import io.altar.CinemaTicketSystem.Models.Room;
import io.altar.CinemaTicketSystem.ModelsDTO.CinemaDTO;
import io.altar.CinemaTicketSystem.ModelsDTO.MovieDTO;
import io.altar.CinemaTicketSystem.ModelsDTO.RoomDTO;
import io.altar.CinemaTicketSystem.Repositories.RoomsRepository;

public class RoomBusiness extends EntityBusiness<RoomsRepository, Room, RoomDTO> {

	public RoomDTO create(Room room) {
		room = repository.save(room);
		room.createSchedule(room.getCinema(), room.getMovie());
		
		CinemaDTO cDto = new CinemaDTO(room.getCinema().getId(), room.getCinema().getName(), room.getCinema().getTimeOpen(),room.getCinema().getTimeClose(),room.getCinema().getPause());
		MovieDTO mDto = new MovieDTO(room.getMovie().getId(),room.getMovie().getTitle(),room.getMovie().getImage(),room.getMovie().getMinimumAge(),room.getMovie().getDuration(),room.getMovie().getReleaseDate(),room.getMovie().getEndDate(),room.getMovie().getDirector(),room.getMovie().getCast(),room.getMovie().getSynopsis()); 
		RoomDTO dto = new RoomDTO(room.getId(), mDto, cDto, room.getTotalSeats());
		//room.getCinema().addRoom(room);
		return dto;
	}
}
