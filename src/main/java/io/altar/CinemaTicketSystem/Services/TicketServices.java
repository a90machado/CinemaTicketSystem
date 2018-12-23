package io.altar.CinemaTicketSystem.Services;

import javax.ws.rs.Path;

import io.altar.CinemaTicketSystem.Business.TicketBusiness;
import io.altar.CinemaTicketSystem.Models.Ticket;
import io.altar.CinemaTicketSystem.ModelsDTO.TicketDTO;
import io.altar.CinemaTicketSystem.Repositories.TicketsRepository;

@Path("ticket")
public class TicketServices extends EntityServices<TicketBusiness, TicketsRepository, Ticket, TicketDTO> {
}
