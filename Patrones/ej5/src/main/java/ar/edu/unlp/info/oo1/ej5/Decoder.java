package ar.edu.unlp.info.oo1.ej5;

import java.util.ArrayList;
import java.util.List;

public class Decoder {
	private DecoderStrategy decoderStrategy;
	private List<Movie> movies;
	private List<Movie> watchedMovies;
	
	public Decoder(DecoderStrategy decoderStrategy) {
		this.decoderStrategy = decoderStrategy;
		this.movies = new ArrayList<Movie>();
		this.watchedMovies = new ArrayList<Movie>();
	}
	
	public Decoder() {
		this.decoderStrategy = new NewStrategy();
		this.movies = new ArrayList<Movie>();
		this.watchedMovies = new ArrayList<Movie>();
	}
	
	public List<Movie> getSuggestion() {
		return this.getStrategy().suggestion(this);
	}
	
	public void addMovie(Movie movie) {
		this.getMovies().add(movie);
	}
	
	public void watchMovie(Movie movie) {
		this.getWatchedMovies().add(movie);
	}
	
	public DecoderStrategy getStrategy() {
		return this.decoderStrategy;
	}
	
	public List<Movie> getMovies(){
		return this.movies;
	}
	
	public List<Movie> getWatchedMovies(){
		return this.watchedMovies;
	}
	
	public void setDecoderStrategy(DecoderStrategy decoderStrategy) {
		this.decoderStrategy = decoderStrategy;
	}
}
