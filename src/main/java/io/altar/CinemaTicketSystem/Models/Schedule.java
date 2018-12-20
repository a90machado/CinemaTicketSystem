package io.altar.CinemaTicketSystem.Models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;


@Entity
@NamedQueries({ @NamedQuery(name = Schedule.GET_ALL_SCHEDULES_QUERY_NAME, query = "SELECT s FROM Schedule s"),
		@NamedQuery(name = Schedule.DELETE_ALL_SCHEDULES_QUERY_NAME, query = "DELETE FROM Schedule") })
public class Schedule extends BaseEntity {

	private static final long serialVersionUID = 1L;

	private int inicioSesion; // Minutes
	private int fimSession; // Minutes
	private int pause; // Minutes
	
	
	// Named Query:
		public static final String GET_ALL_SCHEDULES_QUERY_NAME = "getAllSchedules";
		public static final String DELETE_ALL_SCHEDULES_QUERY_NAME = "deleteAllSchedules";

	// Constructor
	public Schedule() {
	}

	public Schedule(int cinemaOpen, int cinemaClose, int pause) {
		super();
		this.cinemaOpen = cinemaOpen;
		this.cinemaClose = cinemaClose;
		this.pause = pause;
	}

	// Gets and Setters:
	public int getCinemaOpen() {
		return cinemaOpen;
	}

	public void setCinemaOpen(int cinemaOpen) {
		this.cinemaOpen = cinemaOpen;
	}

	public int getCinemaClose() {
		return cinemaClose;
	}

	public void setCinemaClose(int cinemaClose) {
		this.cinemaClose = cinemaClose;
	}

	public int getPause() {
		return pause;
	}

	public void setPause(int pause) {
		this.pause = pause;
	}

}
