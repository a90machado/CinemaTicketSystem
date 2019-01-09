package io.altar.CinemaTicketSystem.Models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import io.altar.CinemaTicketSystem.ModelsDTO.ExibitionDayDTO;

@Entity
@NamedQueries({
		@NamedQuery(name = ExibitionDay.GET_ALL_EXIBITIONDAYS_QUERY_NAME, query = "SELECT e FROM ExibitionDay e"),
		@NamedQuery(name = ExibitionDay.DELETE_ALL_EXIBITIONDAYS_QUERY_NAME, query = "DELETE FROM ExibitionDay") })
// ________________________________________________________________________________________________

public class ExibitionDay extends BaseEntity {

	private static final long serialVersionUID = 1L;

	// Attributes
	@ManyToOne(cascade = CascadeType.ALL)
	private Room room;
	private int day;
	private int month;
	private int year;
	private String dayOfWeek;

	// ________________________________________________________________________________________________

	// NamedQuerys
	public static final String GET_ALL_EXIBITIONDAYS_QUERY_NAME = "getAllExibitionDays";
	public static final String DELETE_ALL_EXIBITIONDAYS_QUERY_NAME = "deleteExibitionDays";

	// ________________________________________________________________________________________________

	// Constructor
	public ExibitionDay() {
	}
	
	public ExibitionDay(Room room, int day, int month, int year, String dayOfWeek) {
		super();
		this.room = room;
		this.day = day;
		this.month = month;
		this.year = year;
		this.dayOfWeek = dayOfWeek;
	}

	// ________________________________________________________________________________________________

	// Gets and Setters:
	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}	

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	// ________________________________________________________________________________________________

	// Extra Methods

	public ExibitionDayDTO turnToDTO(ExibitionDay exibitionDay) {
		return new ExibitionDayDTO(exibitionDay.getId(),exibitionDay.getRoom().turnToDTO(exibitionDay.getRoom()),exibitionDay.getDay(), exibitionDay.getMonth(),exibitionDay.getYear(),exibitionDay.getDayOfWeek());
	}
}
