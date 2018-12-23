package io.altar.CinemaTicketSystem.ModelsDTO;

import io.altar.CinemaTicketSystem.Models.BaseEntity;

public class ScheduleDTO extends BaseEntity {

	private RoomDTO room;
	private int sessionBegin; // Minutes
	private int sessionEnd; // Minutes
	private int availableSeats;
	
	public ScheduleDTO(long id, RoomDTO room, int sessionBegin, int sessionEnd, int availableSeats) {
		this.setId(id);
		this.room = room;
		this.sessionBegin = sessionBegin;
		this.sessionEnd = sessionEnd;
		this.availableSeats = availableSeats;
	}

	public RoomDTO getRoom() {
		return room;
	}

	public void setRoom(RoomDTO room) {
		this.room = room;
	}

	public int getSessionBegin() {
		return sessionBegin;
	}

	public void setSessionBegin(int sessionBegin) {
		this.sessionBegin = sessionBegin;
	}

	public int getSessionEnd() {
		return sessionEnd;
	}

	public void setSessionEnd(int sessionEnd) {
		this.sessionEnd = sessionEnd;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	
	
	
}
