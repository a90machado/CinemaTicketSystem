package io.altar.CinemaTicketSystem.ModelsDTO;

public class RoomDTO {
private static final long serialVersionUID = 1L;
	
	// Attributes
	
	private String cinemaName;
	private int totalSeats;
	private String movie;
	
	// ________________________________________________________________________________________________
	
	// Constructor
	
	public RoomDTO(String cinemaName, int totalSeats, String movie) {
		super();
		this.cinemaName = cinemaName;
		this.totalSeats = totalSeats;
		this.movie = movie;

	}
	// ________________________________________________________________________________________________
	
	// Get and setters

	public String getCinemaName() {
		return cinemaName;
	}

	public void setCinemaName(String cinemaName) {
		this.cinemaName = cinemaName;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public String getMovie() {
		return movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}

}
