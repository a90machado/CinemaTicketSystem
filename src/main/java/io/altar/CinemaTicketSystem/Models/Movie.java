package io.altar.CinemaTicketSystem.Models;

public class Movie extends BaseEntity{	
	
	private String title;
	private int minimumAge;
	private int duration; 		
	private String director;
	private String cast;
	private String synopsis;
	
	public Movie(String title, int minimumAge, int duration, String director, String cast, String synopsis) {		
		this.title = title;
		this.minimumAge = minimumAge;
		this.duration = duration;
		this.director = director;
		this.cast = cast;
		this.synopsis = synopsis;
	}

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
