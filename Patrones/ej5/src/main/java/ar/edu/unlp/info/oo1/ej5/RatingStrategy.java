package ar.edu.unlp.info.oo1.ej5;

import java.util.List;
import java.util.Comparator;

public class RatingStrategy extends DecoderStrategy{
	
	public List<Movie> orderList(Decoder decoder){
		return decoder.getMovies().stream()
				.sorted(Comparator.comparing(Movie::getRating).reversed().thenComparing(Movie::getDate))
				.toList();
	}
}
