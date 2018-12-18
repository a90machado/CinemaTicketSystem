//This creates the attributes for ticket and have the methods to get and edit the attributes
package io.altar.CinemaTicketSystem.Models;

public class Ticket extends BaseEntity {

	// Attributes
	private String title;
	private Movie movie;
	private Room room;
	private String session;
	private int duration;
	private String typeOfTicket;

	// Constructor
	public Ticket(String nameOfTheMovie, Movie movie, Room room, String session, int duration, String typeOfTicket) {
		super();
		this.title = nameOfTheMovie;
		this.movie = movie;
		this.room = room;
		this.session = session;
		this.duration = duration;
		this.typeOfTicket = typeOfTicket;
	}

	// Methods
	public String getNameOfTheMovie() {
		return title;
	}

	public void setNameOfTheMovie(String nameOfTheMovie) {
		this.title = nameOfTheMovie;
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

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getTypeOfTicket() {
		return typeOfTicket;
	}

	public void setTypeOfTicket(String typeOfTicket) {
		this.typeOfTicket = typeOfTicket;
	}

}