package io.altar.CinemaTicketSystem.Services;

import javax.ws.rs.Path;
import io.altar.CinemaTicketSystem.Business.RoomBusiness;
import io.altar.CinemaTicketSystem.Models.Room;
import io.altar.CinemaTicketSystem.Repositories.RoomsRepository;

@Path("room")
public class RoomServices extends EntityServices<RoomBusiness, RoomsRepository, Room>{
	
}
