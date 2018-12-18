package io.altar.CinemaTicketSystem.Models;

public class Movie extends BaseEntity{	
	
	private String title;
	private String minimumAge;
	private String duration;	
	private String director;
	private String cast;
	private String synopsis;
	
	public Movie(String title, String minimumAge, String duration, String director, String cast, String synopsis) {		
		this.title = title;
		this.minimumAge = minimumAge;
		this.duration = duration;
		this.director = director;
		this.cast = cast;
		this.synopsis = synopsis;
	}
	
	
	

}
