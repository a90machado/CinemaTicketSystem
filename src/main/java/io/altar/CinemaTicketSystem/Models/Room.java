package io.altar.CinemaTicketSystem.Models;

public class Room extends BaseEntity{
	
	// Attributes:
	private Movie movie;
	private int availableSeats;
	private int totalSeats;
	
	// Constructor:
	private Room(Movie movie, int totalSeats){
		this.movie = movie;
		this.totalSeats = totalSeats;
		this.availableSeats = totalSeats;
	}
	
	// Getters and Setters:
	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats() {
		this.availableSeats--;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

}
