//This creates the id for all entities and have the functions to get the id's created
package io.altar.CinemaTicketSystem.Models;

import java.io.Serializable;

public class BaseEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	private long id;

	public BaseEntity() {
	}

	public long getId() {
		return id;
	}

}
