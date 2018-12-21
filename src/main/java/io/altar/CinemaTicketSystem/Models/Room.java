package io.altar.CinemaTicketSystem.Models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQueries({ @NamedQuery(name = Room.GET_ALL_ROOMS_QUERY_NAME, query = "SELECT r FROM Room r"),
		@NamedQuery(name = Room.DELETE_ALL_ROOMS_QUERY_NAME, query = "DELETE FROM Room") })
// ________________________________________________________________________________________________

public class Room extends BaseEntity {
	private static final long serialVersionUID = 1L;

	// Attributes:
	private Movie movie;
	@ManyToOne(cascade = CascadeType.ALL)
	private Cinema cinema;
	private int totalSeats;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "room")
	List<Schedule> schedules = new ArrayList<Schedule>();

	// ________________________________________________________________________________________________

	// NamedQuerys
	public static final String GET_ALL_ROOMS_QUERY_NAME = "getAllRooms";
	public static final String DELETE_ALL_ROOMS_QUERY_NAME = "deleteAllRooms";

	// ________________________________________________________________________________________________

	// Constructor
	public Room() {
	}

	// ________________________________________________________________________________________________

	// Gets and Setters:
	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Cinema getCinema() {
		return cinema;
	}

	public void setCinema(Cinema cinema) {
		this.cinema = cinema;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public List<Schedule> getSchedules() {
		return schedules;
	}

	public void setSchedules(List<Schedule> schedules) {
		this.schedules = schedules;
	}

	// ________________________________________________________________________________________________
	// Extra Methods
	public void createSchedule(Cinema cinema, Movie movie) {
		int openTime;
		int numberOfSessions;
		int sessionBegin = cinema.getTimeOpen();
		int sessionEnd = 0;

		if (cinema.getTimeClose() < cinema.getTimeOpen()) {
			openTime = ((24 * 60) - cinema.getTimeOpen()) + cinema.getTimeClose();
		} else {
			openTime = cinema.getTimeClose() - cinema.getTimeOpen();
		}

		numberOfSessions = (int) (openTime / (movie.getDuration() + cinema.getPause()));

		for (int i = 1; i < numberOfSessions; i++) {
			sessionEnd = sessionEnd + (movie.getDuration() + cinema.getPause());
			schedules.add(new Schedule(sessionBegin, sessionEnd));
			sessionBegin = sessionEnd;
		}

	}

	// ________________________________________________________________________________________________
}
