package ar.edu.unlp.info.oo1.ej5;

import java.util.*;
import java.util.ArrayList;

public class Movie {
	private String title;
	private Integer date;
	private Double rating;
	private List<Movie> similarMovies;
	
	public Movie(String title, Integer date, Double rating) {
		this.title = title;
		this.date = date;
		this.rating = rating;
		this.similarMovies = new ArrayList<Movie>();
	}
	
	public void addSimilarMovie(Movie movie) {
		if(!this.getSimilar().contains(movie)){
			this.getSimilar().add(movie);
			movie.addSimilarMovie(this);
		}
	}
	
	public Integer getDate() {
		return this.date;
	}
	
	public Double getRating() {
		return this.rating;
	}
	
	public List<Movie> getSimilar(){
		return this.similarMovies;
	}	
}
