package io.altar.CinemaTicketSystem.Business;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;


import io.altar.CinemaTicketSystem.Models.TypeOfTicket;
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
		typeOfTicket=typeOfTicketRepository.save(typeOfTicket);
		//////AQUI//////
		return typeOfTicket;
	}

	public List<TypeOfTicket> getAll() {
		List<TypeOfTicket> typeOfTicket = typeOfTicketRepository.getAll();		
		return typeOfTicket;
	}

	public TypeOfTicket findById(long id) {
		return typeOfTicketRepository.getById(id);
	}
	
}
