package io.altar.CinemaTicketSystem.Models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = Room.GET_ALL_ROOMS_QUERY_NAME, query = "SELECT r FROM Room r"),
		@NamedQuery(name = Room.DELETE_ALL_ROOMS_QUERY_NAME, query = "DELETE FROM Room") })

public class Room extends BaseEntity {
	private static final long serialVersionUID = 1L;

	// Attributes:
	@ManyToOne(cascade = CascadeType.ALL)
	private Movie movie;
	private int availableSeats;
	private int totalSeats;	
	
	List<Schedule> schedule = new ArrayList<Schedule>();

	// Named Query:
	public static final String GET_ALL_ROOMS_QUERY_NAME = "getAllRooms";
	public static final String DELETE_ALL_ROOMS_QUERY_NAME = "deleteAllRooms";

	public void addShedules(int cinemaOpen, int cinemaClose, int pause) {
		Schedule s= new Schedule(cinemaOpen,  cinemaClose, pause);
		this.schedule.add(s);
	}
	
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

}
