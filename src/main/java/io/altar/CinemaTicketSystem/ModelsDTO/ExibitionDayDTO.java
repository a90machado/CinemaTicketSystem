package io.altar.CinemaTicketSystem.ModelsDTO;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;

import io.altar.CinemaTicketSystem.Models.BaseEntity;

public class ExibitionDayDTO extends BaseEntity {

	private static final long serialVersionUID = 1L;

	// Attributes
	@ManyToOne(cascade = CascadeType.ALL)
	private RoomDTO roomDto;
	private int day;
	private String dayOfWeek;

	// ________________________________________________________________________________________________

	// Constructor
	public ExibitionDayDTO(long id, RoomDTO roomDto, int day, String dayOfWeek) {
		super();
		this.setId(id);
		this.roomDto = roomDto;
		this.day = day;
		this.dayOfWeek = dayOfWeek;
	}
	// ________________________________________________________________________________________________

	// Get and setters
	public RoomDTO getRoomDto() {
		return roomDto;
	}

	public void setRoomDto(RoomDTO roomDto) {
		this.roomDto = roomDto;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

}
