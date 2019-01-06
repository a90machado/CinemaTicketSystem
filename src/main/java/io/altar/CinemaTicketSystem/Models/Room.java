package io.altar.CinemaTicketSystem.Models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

import io.altar.CinemaTicketSystem.ModelsDTO.RoomDTO;

@Entity
@NamedQueries({ @NamedQuery(name = Room.GET_ALL_ROOMS_QUERY_NAME, query = "SELECT r FROM Room r"),
		@NamedQuery(name = Room.DELETE_ALL_ROOMS_QUERY_NAME, query = "DELETE FROM Room") })
// ________________________________________________________________________________________________

public class Room extends BaseEntity {
	private static final long serialVersionUID = 1L;

	// Attributes:
	@ManyToOne(cascade = CascadeType.ALL)
	private Movie movie;
	@ManyToOne(cascade = CascadeType.ALL)
	private Cinema cinema;
	private int numberOfQueues;
	private int numberOfSeatsPerQueue;
	@OneToMany(fetch = FetchType.LAZY, mappedBy="room")
	private List<Queue> structure = new ArrayList<Queue>();
	private int totalSeats;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "room", cascade = CascadeType.ALL)
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
	

	public int getNumberOfQueues() {
		return numberOfQueues;
	}

	public void setNumberOfQueues(int numberOfQueues) {
		this.numberOfQueues = numberOfQueues;
	}

	public int getNumberOfSeatsPerQueue() {
		return numberOfSeatsPerQueue;
	}

	public void setNumberOfSeatsPerQueue(int numberOfSeatsPerQueue) {
		this.numberOfSeatsPerQueue = numberOfSeatsPerQueue;
	}

	public List<Queue> getStructure() {
		return structure;
	}

	public void setStructure(List<Queue> structure) {
		this.structure = structure;
	}

	// ________________________________________________________________________________________________
	// Extra Methods

	public void chooseSeat(Boolean structure[][], int queue, int seat){
		structure[queue][seat] = true;
	}

	public void createSchedule(Cinema cinema, Movie movie) {
		int openTime;
		int numberOfSessions;
		int sessionBegin = cinema.getTimeOpen();
		int sessionEnd = cinema.getTimeOpen()+ movie.getDuration() + cinema.getPause();

		if (cinema.getTimeClose() < cinema.getTimeOpen()) {
			openTime = ((24 * 60) - cinema.getTimeOpen()) + cinema.getTimeClose();
		} else {
			openTime = cinema.getTimeClose() - cinema.getTimeOpen();
		}

		numberOfSessions = (int) (openTime / (movie.getDuration() + cinema.getPause()));

		for (int i = 1; i <= numberOfSessions; i++) {
			if(sessionBegin>=24*60) {
				sessionBegin=sessionBegin-(24*60);
			}
			if(sessionEnd>=24*60) {
				sessionEnd=sessionEnd-(24*60);
			}
			Schedule newSchedule = new Schedule(sessionBegin, sessionEnd, this, this.getTotalSeats());
			schedules.add(newSchedule);
			sessionBegin = sessionEnd;
			sessionEnd = sessionEnd + (movie.getDuration() + cinema.getPause());
		}

	}
	
	public RoomDTO turnToDTO(Room room) {

		return new RoomDTO(room.getId(),room.getCinema().turnToDTO(cinema),room.getTotalSeats(), room.getMovie().turnToDTO(room.getMovie()));
		}

	// ________________________________________________________________________________________________
}
