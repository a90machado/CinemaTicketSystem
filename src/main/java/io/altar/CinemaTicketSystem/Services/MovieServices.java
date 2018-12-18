package io.altar.CinemaTicketSystem.Services;

import javax.ws.rs.Path;

import io.altar.CinemaTicketSystem.Business.MovieBusiness;
import io.altar.CinemaTicketSystem.Models.Movie;
import io.altar.CinemaTicketSystem.Repositories.MoviesRepository;

@Path("movie")
public class MovieServices extends EntityServices<MovieBusiness, MoviesRepository, Movie>{
}
