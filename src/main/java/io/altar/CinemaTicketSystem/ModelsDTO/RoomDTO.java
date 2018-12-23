package io.altar.CinemaTicketSystem.ModelsDTO;

import io.altar.CinemaTicketSystem.Models.BaseEntity;

public class RoomDTO extends BaseEntity {
	
	private MovieDTO movie;
	private CinemaDTO cinema;
	private int totalSeats;
	
	public RoomDTO(long id, MovieDTO movie, CinemaDTO cinema, int totalSeats) {
		this.setId(id);
		this.cinema = cinema;
		this.totalSeats = totalSeats;
	}

	public MovieDTO getMovie() {
		return movie;
	}

	public void setMovie(MovieDTO movie) {
		this.movie = movie;
	}

	public CinemaDTO getCinema() {
		return cinema;
	}

	public void setCinema(CinemaDTO cinema) {
		this.cinema = cinema;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	
	

}
