package io.altar.CinemaTicketSystem.ModelsDTO;

public class CinemaDTO {
private static final long serialVersionUID = 1L;
	
	// Attributes
		private String name;
		private int timeOpen; // Minutes
		private int timeClose; // Minutes
		private int pause; // Minutes

	// ________________________________________________________________________________________________
	
	// Constructor
		public CinemaDTO(String name, int timeOpen, int timeClose, int pause) {
			super();
			this.name = name;
			this.timeOpen = timeOpen;
			this.timeClose = timeClose;
			this.pause = pause;
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

		// ________________________________________________________________________________________________

}
