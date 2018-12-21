package io.altar.CinemaTicketSystem.Models;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;


@Entity
@NamedQueries({ @NamedQuery(name = Schedule.GET_ALL_SCHEDULES_QUERY_NAME, query = "SELECT s FROM Schedule s"),
		@NamedQuery(name = Schedule.DELETE_ALL_SCHEDULES_QUERY_NAME, query = "DELETE FROM Schedule") })
public class Schedule extends BaseEntity {

	private static final long serialVersionUID = 1L;

	private int sessionBegin; // Minutes
	private int sessionENd; // Minutes
		
	
	// Named Query:
		public static final String GET_ALL_SCHEDULES_QUERY_NAME = "getAllSchedules";
		public static final String DELETE_ALL_SCHEDULES_QUERY_NAME = "deleteAllSchedules";

	// Constructor
	public Schedule() {
	}

	public Schedule(int sessionBegin, int sessionENd, int pause) {
		super();
		this.sessionBegin = sessionBegin;
		this.sessionENd = sessionENd;		
	}

	// Gets and Setters:
	public int getSessionBegin() {
		return sessionBegin;
	}

	public void setSessionBegin(int sessionBegin) {
		this.sessionBegin = sessionBegin;
	}

	public int getSessionENd() {
		return sessionENd;
	}

	public void setSessionENd(int sessionENd) {
		this.sessionENd = sessionENd;
	}
}
