package io.altar.CinemaTicketSystem.Business;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;
import io.altar.CinemaTicketSystem.Models.Room;
import io.altar.CinemaTicketSystem.ModelsDto.RoomDTO;
import io.altar.CinemaTicketSystem.Repositories.RoomsRepository;

public class RoomBusiness extends EntityBusiness<RoomsRepository, Room> {

	@Transactional
	public void create(Room room) {
		room = repository.save(room);
		room.createSchedule(room.getCinema(), room.getMovie());
		room.getCinema().addRoom(room);
	}
	
	public List<RoomDTO> consultRooms() {

		List<Room> rooms= repository.getAll();
		List<RoomDTO> roomsDTO=new ArrayList<>();

		for (Room room :rooms) {
			room.turnToDTO(room);
		}
		return roomsDTO;	
	}
}