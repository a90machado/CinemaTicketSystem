package io.altar.CinemaTicketSystem.Services;

import javax.ws.rs.Path;

import io.altar.CinemaTicketSystem.Business.ScheduleBusiness;
import io.altar.CinemaTicketSystem.Models.Schedule;
import io.altar.CinemaTicketSystem.ModelsDTO.ScheduleDTO;
import io.altar.CinemaTicketSystem.Repositories.ScheduleRepository;

@Path("schedule")
public class ScheduleServices extends EntityServices<ScheduleBusiness, ScheduleRepository, Schedule, ScheduleDTO>{

}
