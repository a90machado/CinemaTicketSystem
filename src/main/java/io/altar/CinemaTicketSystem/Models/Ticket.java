//This creates the attributes for ticket and have the methods to get and edit the attributes
package io.altar.CinemaTicketSystem.Models;

public class Ticket extends BaseEntity {
	
	private static final long serialVersionUID = 1L;

	// Attributes
	private Movie movie;
	private Room room;
	private String typeOfTicket;

	// Constructor
	public Ticket(Movie movie, Room room, String typeOfTicket) {
		this.movie = movie;
		this.room = room;
		this.typeOfTicket = typeOfTicket;
	}

	// Methods

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

	public String getTypeOfTicket() {
		return typeOfTicket;
	}

	public void setTypeOfTicket(String typeOfTicket) {
		this.typeOfTicket = typeOfTicket;
	}
}