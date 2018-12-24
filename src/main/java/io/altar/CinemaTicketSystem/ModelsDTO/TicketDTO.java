package io.altar.CinemaTicketSystem.ModelsDTO;

public class TicketDTO {
	private static final long serialVersionUID = 1L;

	// Attributes
	
	private RoomDTO roomDTO;
	private String typeOfTicket;
	private double price;
	
	// ________________________________________________________________________________________________

	// Constructor
	
	public TicketDTO(RoomDTO roomDTO, String typeOfTicket, double price) {
		super();
		this.roomDTO = roomDTO;
		this.typeOfTicket = typeOfTicket;
		this.price = price;
	}
	// ________________________________________________________________________________________________
	
	// Get and Setters:
	
	public RoomDTO getRoomDTO() {
		return roomDTO;
	}

	public void setRoomDTO(RoomDTO roomDTO) {
		this.roomDTO = roomDTO;
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
