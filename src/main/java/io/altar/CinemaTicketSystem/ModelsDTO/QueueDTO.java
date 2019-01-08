package io.altar.CinemaTicketSystem.ModelsDTO;

import java.util.ArrayList;
import java.util.List;

import io.altar.CinemaTicketSystem.Models.BaseEntity;

public class QueueDTO extends BaseEntity {

	private static final long serialVersionUID = 1L;

	// Attributes
	private RoomDTO roomDTO;
	private List<Boolean> seats = new ArrayList<Boolean>();

	// ________________________________________________________________________________________________

	// Constructor
	public QueueDTO(long id, RoomDTO roomDTO, List<Boolean> seats) {
		super();
		this.setId(id);
		this.roomDTO = roomDTO;
		this.seats = seats;
	}
	// ________________________________________________________________________________________________

	// Get and Setters
	public RoomDTO getRoomDTO() {
		return roomDTO;
	}

	public void setRoomDTO(RoomDTO roomDTO) {
		this.roomDTO = roomDTO;
	}

	public List<Boolean> getSeats() {
		return seats;
	}

	public void setSeats(List<Boolean> seats) {
		this.seats = seats;
	}

}
