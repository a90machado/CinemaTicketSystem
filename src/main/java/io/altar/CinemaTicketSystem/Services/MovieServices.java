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

import io.altar.CinemaTicketSystem.Business.CinemaBusiness;
import io.altar.CinemaTicketSystem.Business.MovieBusiness;
import io.altar.CinemaTicketSystem.Models.Cinema;
import io.altar.CinemaTicketSystem.Models.Movie;
import io.altar.CinemaTicketSystem.Repositories.MoviesRepository;

@Path("movie")
public class MovieServices {
	
		@Inject
		MovieBusiness movieBusiness;
		
		@POST
		@Consumes(MediaType.APPLICATION_JSON)
		@Produces(MediaType.APPLICATION_JSON)
		public void create(Movie movie) {
			movieBusiness.create(movie);
		}
		@GET
		@Path("/")
		@Produces(MediaType.APPLICATION_JSON)
		public List<MovieDTO> getAll() {
			return movieBusiness.getAll();
		}
		@GET
		@Path("/{id}")
		@Produces(MediaType.APPLICATION_JSON)
		public MovieDTO findById(@PathParam("id") long id) {
			return movieBusiness.findById(id);
		}
		@DELETE
		@Path("/{id}")
		@Produces(MediaType.APPLICATION_JSON)
		public String delete(@PathParam("id") long id) {
			movieBusiness.delete(id);
			return "Movie deleted";
		}
		@PUT
		@Path("/")
		@Produces(MediaType.APPLICATION_JSON)
		public void update(Movie movie) {
			movieBusiness.update(movie);
		}
}
