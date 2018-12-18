package io.altar.CinemaTicketSystem.Models;

import java.util.List;

public class Room extends BaseEntity{
	
	// Attributes:
	private Movie movie;
	private int availableSeats;
	private int totalSeats;
	private List<String> sessions;
	
	// Constructor:
	private Room(Movie movie, int totalSeats, List<String> sessions){
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
		this.availableSeats=totalSeats;
	}

	public void takeASeat(){
		this.availableSeats--;
	}	

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

}
