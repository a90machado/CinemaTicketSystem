package io.altar.CinemaTicketSystem.Models;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = Ticket.GET_ALL_TICKETS_QUERY_NAME, query = "SELECT t FROM Ticket t"),
		@NamedQuery(name = Ticket.DELETE_ALL_TICKETS_QUERY_NAME, query = "DELETE FROM Ticket") })
// ________________________________________________________________________________________________

public class Ticket extends BaseEntity {
	private static final long serialVersionUID = 1L;

	// Attributes
	private Room room;
	private String typeOfTicket;
	private double price;

	// ________________________________________________________________________________________________

	// Named Query:
	public static final String GET_ALL_TICKETS_QUERY_NAME = "getAllTickets";
	public static final String DELETE_ALL_TICKETS_QUERY_NAME = "deleteAllTickets";

	// ________________________________________________________________________________________________

	// Constructor
	public Ticket() {
	}

	// ________________________________________________________________________________________________

	// Gets and Setters:
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// ________________________________________________________________________________________________

}