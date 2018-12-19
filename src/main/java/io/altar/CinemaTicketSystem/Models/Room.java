package io.altar.CinemaTicketSystem.Models;

import java.util.Timer;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = Room.GET_ALL_ROOMS_QUERY_NAME, query = "SELECT r FROM Room r"),
		@NamedQuery(name = Room.DELETE_ALL_ROOMS_QUERY_NAME, query = "DELETE FROM Room") })
public class Room extends BaseEntity {
	private static final long serialVersionUID = 1L;

	// Attributes:
	private Movie movie;
	private int availableSeats;
	private int totalSeats;
//	private Timer sessionBegin;
//	private Timer sessionTerminate;
//	private Timer pause;

	// Named Query:
	public static final String GET_ALL_ROOMS_QUERY_NAME = "getAllRooms";
	public static final String DELETE_ALL_ROOMS_QUERY_NAME = "deleteAllRooms";

	// Constructor:
	public Room() {
	}

	// Gets and Setters:	
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
		this.availableSeats = totalSeats;
	}
	
	public void takeASeat() {
		this.availableSeats--;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

//	public Timer getSessionBegin() {
//		return sessionBegin;
//	}
//
//	public void setSessionBegin(Timer sessionBegin) {
//		this.sessionBegin = sessionBegin;
//	}
//
//	public Timer getSessionTerminate() {
//		return sessionTerminate;
//	}
//
//	public void setSessionTerminate(Timer sessionTerminate) {
//		this.sessionTerminate = sessionTerminate;
//	}
//
//	public Timer getPause() {
//		return pause;
//	}
//
//	public void setPause(Timer pause) {
//		this.pause = pause;
//	}

}
