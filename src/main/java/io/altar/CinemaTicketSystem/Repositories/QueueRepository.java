package io.altar.CinemaTicketSystem.Repositories;

import io.altar.CinemaTicketSystem.Models.Queue;


public class QueueRepository extends EntityRepository<Queue>{

	private static final QueueRepository INSTANCE = new QueueRepository();

	public static QueueRepository getInstance() {
		return INSTANCE;
	}

	private QueueRepository() {
	}

	protected Class<Queue> getEntityClass() {
		return Queue.class;
	}

	protected String getAllEntityQueryName() {
		return Queue.GET_ALL_QUEUES_QUERY_NAME;
	}

	protected String deleteAllEntityQueryName() {
		return Queue.DELETE_ALL_QUEUES_QUERY_NAME;
	}
}
