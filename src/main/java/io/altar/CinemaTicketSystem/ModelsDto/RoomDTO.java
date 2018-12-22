package io.altar.CinemaTicketSystem.ModelsDto;

import java.util.ArrayList;
import java.util.List;

import io.altar.CinemaTicketSystem.Models.Room;
import io.altar.CinemaTicketSystem.Models.Schedule;

public class RoomDTO {
	private static final long serialVersionUID = 1L;
	
	// Attributes
	
	private String cinemaName;
	private int totalSeats;
	private List<ScheduleDTO> schedules = new ArrayList<ScheduleDTO>();
	
	// ________________________________________________________________________________________________
	
	// Constructor
	
	public RoomDTO(String cinemaName, int totalSeats, List<ScheduleDTO> schedules) {
		super();
		this.cinemaName = cinemaName;
		this.totalSeats = totalSeats;
		this.schedules = schedules;
	}
	// ________________________________________________________________________________________________
	
	// Get and setters

	public String getCinemaName() {
		return cinemaName;
	}

	public void setCinemaName(String cinemaName) {
		this.cinemaName = cinemaName;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public List<ScheduleDTO> getSchedules() {
		return schedules;
	}

	public void setSchedules(List<ScheduleDTO> schedules) {
		this.schedules = schedules;
	}
	
}
