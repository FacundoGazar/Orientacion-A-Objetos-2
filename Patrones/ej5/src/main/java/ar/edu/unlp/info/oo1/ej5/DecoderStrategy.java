package ar.edu.unlp.info.oo1.ej5;

import java.util.List;
import java.util.stream.Collectors;

public abstract class DecoderStrategy {
	
	public List<Movie> suggestion(Decoder decoder){
		return this.orderList(decoder).stream()
				.filter(movie -> !decoder.getWatchedMovies().contains(movie))
				.limit(3).collect(Collectors.toList());
	}
	
	public abstract List<Movie> orderList(Decoder decoder);
}
