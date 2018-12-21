package io.altar.CinemaTicketSystem.Models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

@Entity
@NamedQueries({ @NamedQuery(name = Cinema.GET_ALL_CINEMAS_QUERY_NAME, query = "SELECT c FROM Cinema c"),
		@NamedQuery(name = Cinema.DELETE_ALL_CINEMAS_QUERY_NAME, query = "DELETE FROM Cinema") })

public class Cinema extends BaseEntity{
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	private int pause; //Minutes
	private int timeOpen; //Minutes
	private int timeClose; //Minutes
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="cinema")
	private List<Room> rooms = new ArrayList<Room>();
	
	public static final String GET_ALL_CINEMAS_QUERY_NAME = "getAllCinemas";
	public static final String DELETE_ALL_CINEMAS_QUERY_NAME = "deleteAllCinemas";
	
	public Cinema() {}
	
	public void addRooms() {
		Room r = new Room();
		this.schedules.add(s);
	}
	
	

}
