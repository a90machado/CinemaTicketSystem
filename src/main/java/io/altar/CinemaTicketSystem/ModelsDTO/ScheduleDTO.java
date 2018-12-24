package io.altar.CinemaTicketSystem.ModelsDTO;

public class ScheduleDTO {
private static final long serialVersionUID = 1L;
	
	//Attributes
	private int sessionBegin; // Minutes
	private int sessionEnd; // Minutes
	private int availableSeats;
	private RoomDTO roomDTO;
	
	// ________________________________________________________________________________________________

	// Constructor
	public ScheduleDTO(int sessionBegin, int sessionEnd, int availableSeats, RoomDTO roomDTO) {
		super();
		this.sessionBegin = sessionBegin;
		this.sessionEnd = sessionEnd;
		this.availableSeats = availableSeats;
		this.roomDTO = roomDTO;
	}
	// ________________________________________________________________________________________________

	// Get and Setters
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

	public RoomDTO getRoomDTO() {
		return roomDTO;
	}

	public void setRoomDTO(RoomDTO roomDTO) {
		this.roomDTO = roomDTO;
	}

	
	// ________________________________________________________________________________________________


}
