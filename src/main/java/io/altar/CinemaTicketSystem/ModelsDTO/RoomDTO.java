package io.altar.CinemaTicketSystem.ModelsDTO;

public class RoomDTO {
private static final long serialVersionUID = 1L;
	
	// Attributes
	
	private CinemaDTO cinemaDTO;
	private int totalSeats;
	private MovieDTO movieDTO;
	
	// ________________________________________________________________________________________________
	
	// Constructor
	
	public RoomDTO(CinemaDTO cinemaDTO, int totalSeats, MovieDTO movieDTO) {
		super();
		this.cinemaDTO = cinemaDTO;
		this.totalSeats = totalSeats;
		this.movieDTO = movieDTO;

	}
	// ________________________________________________________________________________________________
	
	// Get and setters

	public CinemaDTO getCinema() {
		return cinemaDTO;
	}

	public void setCinema(CinemaDTO cinemaDTO) {
		this.cinemaDTO = cinemaDTO;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public MovieDTO getMovie() {
		return movieDTO;
	}

	public void setMovie(MovieDTO movie) {
		this.movieDTO = movie;
	}

}
