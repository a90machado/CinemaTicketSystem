package io.altar.CinemaTicketSystem.ModelsDTO;

import io.altar.CinemaTicketSystem.Models.BaseEntity;

public class TicketDTO extends BaseEntity {
	
	private RoomDTO room;
	private String typeOfTicket;
	private double price;
	
	public TicketDTO(long id, RoomDTO room, String typeOfTicket, double price) {
		this.setId(id);
		this.room = room;
		this.typeOfTicket = typeOfTicket;
		this.price = price;
	}

	public RoomDTO getRoom() {
		return room;
	}

	public void setRoom(RoomDTO room) {
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
	
	

}
