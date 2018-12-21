package io.altar.CinemaTicketSystem.Services;

import javax.ws.rs.Path;

import io.altar.CinemaTicketSystem.Business.CinemaBusiness;
import io.altar.CinemaTicketSystem.Models.Cinema;
import io.altar.CinemaTicketSystem.Repositories.CinemaRepository;

@Path("cinema")
public class CinemaServices extends EntityServices<CinemaBusiness, CinemaRepository, Cinema> {

}
