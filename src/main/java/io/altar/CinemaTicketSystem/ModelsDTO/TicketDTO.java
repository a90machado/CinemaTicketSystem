package io.altar.CinemaTicketSystem.ModelsDTO;

import io.altar.CinemaTicketSystem.Models.BaseEntity;
import io.altar.CinemaTicketSystem.Models.TypeOfTicket;

public class TicketDTO extends BaseEntity{
	private static final long serialVersionUID = 1L;

	// Attributes
	
	private RoomDTO roomDTO;
	private TypeOfTicket typeOfTicket;
	
	// ________________________________________________________________________________________________

	// Constructor
		
	public TicketDTO(long id, RoomDTO roomDTO,TypeOfTicket typeOfTicket) {
		super();
		this.setId(id);
		this.roomDTO = roomDTO;
		this.typeOfTicket=typeOfTicket;
	}
	// ________________________________________________________________________________________________
	
	// Get and Setters:
	
	public RoomDTO getRoomDTO() {
		return roomDTO;
	}

	public void setRoomDTO(RoomDTO roomDTO) {
		this.roomDTO = roomDTO;
	}

	public TypeOfTicket getTypeOfTicket() {
		return typeOfTicket;
	}

	public void setTypeOfTicket(TypeOfTicket typeOfTicket) {
		this.typeOfTicket = typeOfTicket;
	}
	
}
