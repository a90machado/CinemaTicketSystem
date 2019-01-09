package io.altar.CinemaTicketSystem.Models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = Queue.GET_ALL_QUEUES_QUERY_NAME, query = "SELECT q FROM Queue q"),
		@NamedQuery(name = Queue.DELETE_ALL_QUEUES_QUERY_NAME, query = "DELETE FROM Queue") })
// ________________________________________________________________________________________________
public class Queue extends BaseEntity {

	private static final long serialVersionUID = 1L;

	// Attributes
	@ManyToOne(cascade = CascadeType.ALL)
	private Room room;
	@ElementCollection
	private List<Boolean> seatsPerQueue = new ArrayList<Boolean>();
	
	// ________________________________________________________________________________________________

	// NamedQuerys
	public static final String GET_ALL_QUEUES_QUERY_NAME = "getAllQueues";
	public static final String DELETE_ALL_QUEUES_QUERY_NAME = "deleteAllQueues";

	// ________________________________________________________________________________________________

	// Constructor
	public Queue() {
	}	

	public Queue(Room room) {
		super();
		this.room = room;
		this.setSeatsPerQueue();
	}

	// ________________________________________________________________________________________________

	// Gets and Setters:
	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}
	
	public List<Boolean> getSeatsPerQueue() {
		return seatsPerQueue;
	}

	public void setSeatsPerQueue(List<Boolean> seatsPerQueue) {
		this.seatsPerQueue = seatsPerQueue;
	}

	// ________________________________________________________________________________________________

	// Extra Methods	

	public void setSeatsPerQueue() {
		for (int i = 0; i < this.room.getNumberOfSeatsPerQueue(); i++) {
			this.seatsPerQueue.add(false);
		}
	}

}
