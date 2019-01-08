package io.altar.CinemaTicketSystem.Business;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import io.altar.CinemaTicketSystem.Models.ExibitionDay;
import io.altar.CinemaTicketSystem.ModelsDTO.ExibitionDayDTO;
import io.altar.CinemaTicketSystem.Repositories.ExibitionDayRepository;

public class ExibitionDayBusiness {

	@Inject
	protected ExibitionDayRepository exibitionDayRepository;

	@Transactional
	public void delete(long id) {
		exibitionDayRepository.removeByID(id);
	}

	@Transactional
	public ExibitionDay update(ExibitionDay exibitionDay) {
		return exibitionDayRepository.update(exibitionDay);
	}

	@Transactional
	public ExibitionDay create(ExibitionDay exibitionDay) {
		return exibitionDayRepository.save(exibitionDay);
	}

	public List<ExibitionDayDTO> getAll() {
		
		List<ExibitionDay> exibitionDays = exibitionDayRepository.getAll();
		List<ExibitionDayDTO> ExibitionDaysDTO = new ArrayList<ExibitionDayDTO>();
		
		for (ExibitionDay exibitionDay: exibitionDays) {
			ExibitionDaysDTO.add(exibitionDay.turnToDTO(exibitionDay));
		}
		return ExibitionDaysDTO;
	}

	public ExibitionDayDTO findById(long id) {
		return exibitionDayRepository.getById(id).turnToDTO(exibitionDayRepository.getById(id));
	}
	
}
