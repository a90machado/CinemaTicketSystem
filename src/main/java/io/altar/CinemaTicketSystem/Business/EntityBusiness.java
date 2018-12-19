package io.altar.CinemaTicketSystem.Business;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import io.altar.CinemaTicketSystem.Models.BaseEntity;
import io.altar.CinemaTicketSystem.Repositories.EntityRepository;

public abstract class EntityBusiness<T extends EntityRepository<R>, R extends BaseEntity> {

	@Inject
	protected T repository;

	@Transactional
	public void delete(long id) {
		repository.removeByID(id);
	}

	@Transactional
	public R update(R entity) {
		return repository.update(entity);
	}

	@Transactional
	public R create(R entity) {
		return repository.save(entity);
	}

	public List<R> getAll() {
		return repository.getAll();
	}

	public R findById(long id) {
		return repository.getById(id);
	}
}
