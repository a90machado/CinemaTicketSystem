package io.altar.CinemaTicketSystem.ModelsDTO;

import java.util.ArrayList;
import java.util.List;

import io.altar.CinemaTicketSystem.Models.BaseEntity;

public class QueueDTO extends BaseEntity {

	private static final long serialVersionUID = 1L;

	// Attributes
	private RoomDTO roomDTO;
	private List<Boolean> seatsPerQueue = new ArrayList<Boolean>();
	private List<Boolean> queues = new ArrayList<Boolean>();

	// ________________________________________________________________________________________________

	// Constructor
	public QueueDTO(long id, RoomDTO roomDTO, List<Boolean> seatsPerQueue, List<Boolean> queues) {
		super();
		this.setId(id);
		this.roomDTO = roomDTO;
		this.seatsPerQueue = seatsPerQueue;
		this.queues = queues;
	}
	// ________________________________________________________________________________________________

	// Get and Setters
	public RoomDTO getRoomDTO() {
		return roomDTO;
	}

	public void setRoomDTO(RoomDTO roomDTO) {
		this.roomDTO = roomDTO;
	}

	public List<Boolean> getSeatsPerQueue() {
		return seatsPerQueue;
	}

	public void setSeatsPerQueue(List<Boolean> seatsPerQueue) {
		this.seatsPerQueue = seatsPerQueue;
	}

	public List<Boolean> getQueues() {
		return queues;
	}

	public void setQueues(List<Boolean> queues) {
		this.queues = queues;
	}

}
