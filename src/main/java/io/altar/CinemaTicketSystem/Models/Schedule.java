package io.altar.CinemaTicketSystem.Models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import io.altar.CinemaTicketSystem.ModelsDto.ScheduleDTO;

@Entity
@NamedQueries({ @NamedQuery(name = Schedule.GET_ALL_SCHEDULES_QUERY_NAME, query = "SELECT s FROM Schedule s"),
		@NamedQuery(name = Schedule.DELETE_ALL_SCHEDULES_QUERY_NAME, query = "DELETE FROM Schedule") })
//________________________________________________________________________________________________

public class Schedule extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	//Attributes
	@ManyToOne(cascade=CascadeType.ALL)
	private Room room;
	private int sessionBegin; // Minutes
	private int sessionEnd; // Minutes
	private int availableSeats;
	
	// ________________________________________________________________________________________________

	// NamedQuerys
	public static final String GET_ALL_SCHEDULES_QUERY_NAME = "getAllSchedules";
	public static final String DELETE_ALL_SCHEDULES_QUERY_NAME = "deleteAllSchedules";

	// ________________________________________________________________________________________________

	// Constructor
	public Schedule() {
	}

	public Schedule(int sessionBegin, int sessionENd, Room room) {		
		this.sessionBegin = sessionBegin;
		this.sessionEnd = sessionENd;	
		this.room = room;
	}

	// ________________________________________________________________________________________________

	// Get and Setters
	public int getSessionBegin() {
		return sessionBegin;
	}

	public void setSessionBegin(int sessionBegin) {
		this.sessionBegin = sessionBegin;
	}

	public int getsessionEnd() {
		return sessionEnd;
	}

	public void setsessionEnd(int sessionEnd) {
		this.sessionEnd = sessionEnd;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = this.room.getTotalSeats();
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}
		
	// ________________________________________________________________________________________________	
	
	//Extra Methods
	public void takeASeat() {
		this.availableSeats--;
	}	
	
	public ScheduleDTO turnToDTO(Schedule schedule) {
		
		return new ScheduleDTO(schedule.getSessionBegin(),schedule.getsessionEnd(),schedule.getAvailableSeats(),schedule.getRoom().getMovie().getTitle());
	}

}
