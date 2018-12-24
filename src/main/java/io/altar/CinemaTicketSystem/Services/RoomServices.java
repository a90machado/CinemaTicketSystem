package io.altar.CinemaTicketSystem.Services;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.altar.CinemaTicketSystem.Business.MovieBusiness;
import io.altar.CinemaTicketSystem.Business.RoomBusiness;
import io.altar.CinemaTicketSystem.Models.Movie;
import io.altar.CinemaTicketSystem.Models.Room;
import io.altar.CinemaTicketSystem.Repositories.RoomsRepository;

@Path("room")
public class RoomServices {
	
	@Inject
	RoomBusiness roomBusiness;
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void create(Room room) {
		roomBusiness.create(room);
	}
	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public List<RoomDTO> getAll() {
		return roomBusiness.getAll();
	}
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public RoomDTO findById(@PathParam("id") long id) {
		return roomBusiness.findById(id);
	}
	@DELETE
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public String delete(@PathParam("id") long id) {
		roomBusiness.delete(id);
		return "Room deleted";
	}
	@PUT
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public void update(Room room) {
		roomBusiness.update(room);
	}
}
