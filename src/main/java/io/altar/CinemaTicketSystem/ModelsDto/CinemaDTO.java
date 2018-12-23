package io.altar.CinemaTicketSystem.ModelsDto;

import java.util.ArrayList;
import java.util.List;

import io.altar.CinemaTicketSystem.Models.BaseEntity;
import io.altar.CinemaTicketSystem.Models.Cinema;
import io.altar.CinemaTicketSystem.Models.Room;
import io.altar.CinemaTicketSystem.Models.Schedule;

public class CinemaDTO extends BaseEntity{
	private static final long serialVersionUID = 1L;
	
	// Attributes
		private String name;
		private int timeOpen; // Minutes
		private int timeClose; // Minutes
		private int pause; // Minutes
		private List<RoomDTO> rooms = new ArrayList<RoomDTO>();

	// ________________________________________________________________________________________________
	
	// Constructor
		public CinemaDTO(String name, int timeOpen, int timeClose, int pause, List<RoomDTO> rooms) {
			super();
			this.name = name;
			this.timeOpen = timeOpen;
			this.timeClose = timeClose;
			this.pause = pause;
			this.rooms = rooms;
		}
	// ________________________________________________________________________________________________

	// Get and setters

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getTimeOpen() {
			return timeOpen;
		}

		public void setTimeOpen(int timeOpen) {
			this.timeOpen = timeOpen;
		}

		public int getTimeClose() {
			return timeClose;
		}

		public void setTimeClose(int timeClose) {
			this.timeClose = timeClose;
		}

		public int getPause() {
			return pause;
		}

		public void setPause(int pause) {
			this.pause = pause;
		}

		public List<RoomDTO> getRooms() {
			return rooms;
		}

		public void setRooms(List<RoomDTO> rooms) {
			this.rooms = rooms;
		}
		// ________________________________________________________________________________________________

		// Extra Methods
		public void addRoomDTO(RoomDTO roomDTO) {
			this.rooms.add(roomDTO);
		}
		
}
