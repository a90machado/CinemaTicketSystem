package io.altar.CinemaTicketSystem.ModelsDTO;

public class ScheduleDTO {
private static final long serialVersionUID = 1L;
	
	//Attributes
	private int sessionBegin; // Minutes
	private int sessionEnd; // Minutes
	private int availableSeats;
	private String nameOfMovie;
	
	// ________________________________________________________________________________________________

	// Constructor
	public ScheduleDTO(int sessionBegin, int sessionEnd, int availableSeats, String nameOfMovie) {
		super();
		this.sessionBegin = sessionBegin;
		this.sessionEnd = sessionEnd;
		this.availableSeats = availableSeats;
		this.nameOfMovie = nameOfMovie;
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

	public String getNameOfMovie() {
		return nameOfMovie;
	}

	public void setNameOfMovie(String nameOfMovie) {
		this.nameOfMovie = nameOfMovie;
	}
	// ________________________________________________________________________________________________


}
