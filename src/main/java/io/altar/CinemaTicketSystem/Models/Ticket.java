//This creates the attributes for ticket and have the methods to get and edit the attributes
package io.altar.CinemaTicketSystem.Models;

public class Ticket extends BaseEntity {

	// Attributes
	private static final long serialVersionUID = 1L;
	private String nameOfTheMovie;
	private Movie movie;
	private Room room;
	private String session;
	private String duration;
	private int minutes;
	private String typeOfTicket;
	
	//Constructor
	public Ticket(String nameOfTheMovie, Movie movie, Room room, String session, String duration, int minutes,
			String typeOfTicket) {
		super();
		this.nameOfTheMovie = nameOfTheMovie;
		this.movie = movie;
		this.room = room;
		this.session = session;
		this.duration = duration;
		this.minutes = minutes;
		this.typeOfTicket = typeOfTicket;
	}
	//Methods
	public String getNameOfTheMovie() {
		return nameOfTheMovie;
	}

	public void setNameOfTheMovie(String nameOfTheMovie) {
		this.nameOfTheMovie = nameOfTheMovie;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public String getTypeOfTicket() {
		return typeOfTicket;
	}

	public void setTypeOfTicket(String typeOfTicket) {
		this.typeOfTicket = typeOfTicket;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}