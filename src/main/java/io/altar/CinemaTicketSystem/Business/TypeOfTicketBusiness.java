package io.altar.CinemaTicketSystem.Business;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import io.altar.CinemaTicketSystem.Models.TypeOfTicket;
import io.altar.CinemaTicketSystem.ModelsDTO.TypeOfTicketDTO;
import io.altar.CinemaTicketSystem.Repositories.TypeOfTicketRepository;

public class TypeOfTicketBusiness {

	@Inject
	protected TypeOfTicketRepository typeOfTicketRepository;

	@Transactional
	public void delete(long id) {
		typeOfTicketRepository.removeByID(id);
	}

	@Transactional
	public TypeOfTicket update(TypeOfTicket typeOfTicket) {
		return typeOfTicketRepository.update(typeOfTicket);
	}

	@Transactional
	public TypeOfTicket create(TypeOfTicket typeOfTicket) {
		typeOfTicketRepository.save(typeOfTicket);
		return typeOfTicket;
	}

	public List<TypeOfTicketDTO> getAll() {
		
		List<TypeOfTicket> typeOfTickets = typeOfTicketRepository.getAll();		
		List<TypeOfTicketDTO> typeOfTicketDTO = new ArrayList<TypeOfTicketDTO>();
		
		for (TypeOfTicket typeOfTicket: typeOfTickets) {
			typeOfTicketDTO.add(typeOfTicket.turnToDTO(typeOfTicket));
		}
		return typeOfTicketDTO;
	}

	public TypeOfTicketDTO findById(long id) {
		return typeOfTicketRepository.getById(id).turnToDTO(typeOfTicketRepository.getById(id));
	}
	
	public List<TypeOfTicketDTO> getByCinema(long id){
		List<TypeOfTicketDTO> typeOfTicketsDto = this.getAll();
		List<TypeOfTicketDTO> typeOfTicketsDTO = new ArrayList<TypeOfTicketDTO>();
		
		for (TypeOfTicketDTO typeOfTicketDto: typeOfTicketsDto) {
			if(typeOfTicketDto.getCinemaDto().getId()==id) {
			typeOfTicketsDTO.add(typeOfTicketDto);
			}
		}
		return typeOfTicketsDTO;	
	}
	
}
