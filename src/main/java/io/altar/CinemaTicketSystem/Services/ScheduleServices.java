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

import io.altar.CinemaTicketSystem.Business.RoomBusiness;
import io.altar.CinemaTicketSystem.Business.ScheduleBusiness;
import io.altar.CinemaTicketSystem.Models.Room;
import io.altar.CinemaTicketSystem.Models.Schedule;
import io.altar.CinemaTicketSystem.Repositories.ScheduleRepository;

@Path("schedule")
public class ScheduleServices{
	
	@Inject
	ScheduleBusiness scheduleBusiness;
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void create(Schedule schedule) {
		scheduleBusiness.create(schedule);
	}
	@GET
	@Path("/")
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
	public String delete(@PathParam("id") long id) {
		scheduleBusiness.delete(id);
		return "Schedule deleted";
	}
	@PUT
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public void update(Schedule schedule) {
		scheduleBusiness.update(schedule);
	}
}
