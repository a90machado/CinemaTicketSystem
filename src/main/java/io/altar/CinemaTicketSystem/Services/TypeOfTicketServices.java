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

import io.altar.CinemaTicketSystem.Business.TypeOfTicketBusiness;
import io.altar.CinemaTicketSystem.Models.TypeOfTicket;

@Path("typeofticket")
public class TypeOfTicketServices {

	@Inject
	TypeOfTicketBusiness typeOfTicketBusiness;	
	
	@POST
	@Path("new")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public void create(TypeOfTicket typeOfTicket) {
		typeOfTicketBusiness.create(typeOfTicket);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<TypeOfTicket> getAll() {
		return typeOfTicketBusiness.getAll();
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public TypeOfTicket findById(@PathParam("id") long id) {
		return typeOfTicketBusiness.findById(id);
	}
	
	@DELETE
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response delete(@PathParam("id") long id) {
		typeOfTicketBusiness.delete(id);
		return Response.ok().build();
	}
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public void update(TypeOfTicket typeOfTicket) {
		typeOfTicketBusiness.update(typeOfTicket);
	}
}
