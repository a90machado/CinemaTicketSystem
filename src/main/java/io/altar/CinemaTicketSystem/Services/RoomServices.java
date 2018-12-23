package io.altar.CinemaTicketSystem.Services;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.altar.CinemaTicketSystem.Business.RoomBusiness;
import io.altar.CinemaTicketSystem.Models.Room;
import io.altar.CinemaTicketSystem.ModelsDto.RoomDTO;
import io.altar.CinemaTicketSystem.Repositories.RoomsRepository;

@Path("room")
public class RoomServices extends EntityServices<RoomBusiness, RoomsRepository, Room>{
	
	@Inject
	RoomBusiness roomBusiness;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<RoomDTO> consultRooms() {
		return roomBusiness.consultRooms();
	}
}
