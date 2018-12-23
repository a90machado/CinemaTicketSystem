package io.altar.CinemaTicketSystem.ModelsDTO;

import io.altar.CinemaTicketSystem.Models.BaseEntity;

public class CinemaDTO extends BaseEntity {
	
	private String name;
	private int timeOpen;
	private int timeClose;
	private int pause;
	
	public CinemaDTO (long id, String name, int timeOpen, int timeClose, int pause) {
		this.setId(id);
		this.name = name;
		this.timeClose = timeClose;
		this.timeOpen = timeOpen;
		this.pause = pause;
	}

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
	
	
	

}
