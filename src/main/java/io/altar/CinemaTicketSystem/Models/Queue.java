package io.altar.CinemaTicketSystem.Models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import io.altar.CinemaTicketSystem.ModelsDTO.QueueDTO;

@Entity
@NamedQueries({ @NamedQuery(name = Queue.GET_ALL_QUEUES_QUERY_NAME, query = "SELECT q FROM Queue q"),
	@NamedQuery(name = Queue.DELETE_ALL_QUEUES_QUERY_NAME, query = "DELETE FROM Queue") })
//________________________________________________________________________________________________
public class Queue extends BaseEntity{
	private static final long serialVersionUID = 1L;
	// ________________________________________________________________________________________________

		// NamedQuerys
		public static final String GET_ALL_QUEUES_QUERY_NAME = "getAllQueues";
		public static final String DELETE_ALL_QUEUES_QUERY_NAME = "deleteAllQueues";

		// ________________________________________________________________________________________________
		
	// Constructor
	public Queue(){}

	//Attributes
	@ManyToOne(cascade = CascadeType.ALL)
	private Room room;
	
	@ElementCollection
	private List<Boolean> seats = new ArrayList<Boolean>();

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public List<Boolean> getSeats() {
		return seats;
	}

	public void setSeats(List<Boolean> seats) {
		this.seats = seats;
	}
	
	public void setSeats(){
		for (int i = 0; i < this.room.getNumberOfSeatsPerQueue(); i++) {
			this.seats.add(false);
		}
	}
	
	public QueueDTO turnToDTO(Queue queue) {

		return new QueueDTO(queue.getId(),queue.getRoom().turnToDTO(queue.getRoom()),queue.getSeats());
		}

	
}
