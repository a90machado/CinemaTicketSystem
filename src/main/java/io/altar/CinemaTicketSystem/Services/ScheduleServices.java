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
import javax.ws.rs.core.Response;

import io.altar.CinemaTicketSystem.Business.RoomBusiness;
import io.altar.CinemaTicketSystem.Business.ScheduleBusiness;
import io.altar.CinemaTicketSystem.Models.Room;
import io.altar.CinemaTicketSystem.Models.Schedule;
import io.altar.CinemaTicketSystem.ModelsDTO.ScheduleDTO;
import io.altar.CinemaTicketSystem.Repositories.ScheduleRepository;

@Path("schedule")
public class ScheduleServices{
	
	@Inject
	ScheduleBusiness scheduleBusiness;
	
	@POST
	@Path("new")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void create(Schedule schedule) {
		scheduleBusiness.create(schedule);
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<ScheduleDTO> getAll() {
		return scheduleBusiness.getAll();
	}
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public ScheduleDTO findById(@PathParam("id") long id) {
		return scheduleBusiness.findById(id);
	}
	@DELETE
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response delete(@PathParam("id") long id) {
		scheduleBusiness.delete(id);
		return Response.ok().build();
	}
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public void update(Schedule schedule) {
		scheduleBusiness.update(schedule);
	}
}
