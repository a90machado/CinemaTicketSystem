package io.altar.CinemaTicketSystem.Services;

import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import io.altar.CinemaTicketSystem.Business.MovieBusiness;
import io.altar.CinemaTicketSystem.Models.Movie;

@Path("/movie")
public class MovieServices {

	@Inject
	MovieBusiness movieBusiness;

	@POST
	@Path("/add")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Movie addMovie(Movie movie) {
		return movieBusiness.saveMovie(movie);
	}

	@POST
	@Path("/update")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Movie updateProduct(Movie movie) {
		return movieBusiness.updateMovie(movie);
	}

	@GET
	@Path("/getAll")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Movie> getAllProducts() {
		return movieBusiness.getAllMovies();
	}

	@GET
	@Path("/getById/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Movie getProductById(@PathParam("id") long id) {
		return movieBusiness.getMovieById(id);
	}

	@DELETE
	@Path("/deleteAll")
	@Produces(MediaType.APPLICATION_JSON)
	public int removeAllProducts() {
		return movieBusiness.removeAllMovies();

	}

	@DELETE
	@Path("/deleteById/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response removeProductById(@PathParam("id") long id) {
		movieBusiness.removeMovieById(id);
		return Response.ok().build();
	}

}
