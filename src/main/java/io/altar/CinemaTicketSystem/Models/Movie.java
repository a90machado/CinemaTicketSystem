package io.altar.CinemaTicketSystem.Models;

import java.util.Date;

public class Movie extends BaseEntity{	
	
	//Attributes
	private String title;
	private int minimumAge;
	private int duration;
	private Date releaseDate;
	private Date endDate;
	private String director;
	private String cast;
	private String synopsis;
	
	//Constructor
	public Movie(String title, int minimumAge, int duration, Date releaseDate, Date endDate, String director,
			String cast, String synopsis) {		
		this.title = title;
		this.minimumAge = minimumAge;
		this.duration = duration;
		this.releaseDate = releaseDate;
		this.endDate = endDate;
		this.director = director;
		this.cast = cast;
		this.synopsis = synopsis;
	}

	// Getters and Setters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getMinimumAge() {
		return minimumAge;
	}

	public void setMinimumAge(int minimumAge) {
		this.minimumAge = minimumAge;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getCast() {
		return cast;
	}

	public void setCast(String cast) {
		this.cast = cast;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}	
}