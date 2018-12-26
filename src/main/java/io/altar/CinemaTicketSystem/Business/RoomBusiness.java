package io.altar.CinemaTicketSystem.Business;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import io.altar.CinemaTicketSystem.Models.Queue;
import io.altar.CinemaTicketSystem.Models.Room;
import io.altar.CinemaTicketSystem.ModelsDTO.RoomDTO;
import io.altar.CinemaTicketSystem.Repositories.QueueRepository;
import io.altar.CinemaTicketSystem.Repositories.RoomsRepository;

public class RoomBusiness {
	
	@Inject
	protected RoomsRepository roomsRepository;
	@Inject
	protected QueueRepository queueRepository;

	@Transactional
	public void delete(long id) {
		roomsRepository.removeByID(id);
	}

	@Transactional
	public RoomDTO update(Room room) {
		room = roomsRepository.update(room);
		return room.turnToDTO(room);

	}

	@Transactional
	public RoomDTO create(Room room) {
		room = roomsRepository.save(room);
		room.createSchedule(room.getCinema(), room.getMovie());
		for (int i = 0; i < room.getNumberOfQueues(); i++) {
			Queue queue = new Queue();
			queue.setRoom(room);
			queue.setSeats();
			queueRepository.save(queue);
			room.getStructure().add(queue);
		}
		return room.turnToDTO(room);
	}

	public List<RoomDTO> getAll() {
		
		List<Room> rooms = roomsRepository.getAll();
		List<RoomDTO> roomsDTO = new ArrayList<RoomDTO>();
		
		for (Room room: rooms) {
			roomsDTO.add(room.turnToDTO(room));
		}
		return roomsDTO;
	}

	public RoomDTO findById(long id) {
		return roomsRepository.getById(id).turnToDTO(roomsRepository.getById(id));
	}

	
}
