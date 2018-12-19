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
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import io.altar.CinemaTicketSystem.Business.EntityBusiness;
import io.altar.CinemaTicketSystem.Models.BaseEntity;
import io.altar.CinemaTicketSystem.Repositories.EntityRepository;

public abstract class EntityServices<R extends EntityBusiness<S, T>, S extends EntityRepository<T>, T extends BaseEntity> {

	@Inject
	protected R business;
	@Context
	protected UriInfo context;

	@GET
	@Path("healthCheck")
	@Produces(MediaType.TEXT_PLAIN)
	public String healthCheck() {
		return "URI " + context.getRequestUri().toString() + " is OK!";
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<T> getAll() {
		return business.getAll();
	}

	@POST
	@Path("new")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public T create(T entity) {
		return business.create(entity);
	}

	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public T findById(@PathParam("id") long id) {
		return business.findById(id);
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public T update(T entity) {
		return business.update(entity);
	}

	@DELETE
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response delete(@PathParam("id") long id) {
		business.delete(id);
		return Response.ok().build();
	}

}
