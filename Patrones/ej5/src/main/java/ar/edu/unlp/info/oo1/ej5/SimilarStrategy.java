package ar.edu.unlp.info.oo1.ej5;

import java.util.List;
import java.util.Comparator;

public class SimilarStrategy extends DecoderStrategy{
	
	public List<Movie> orderList(Decoder decoder) {
	    return decoder.getWatchedMovies().stream()
	        .flatMap(m -> m.getSimilar().stream())
	        .distinct()
	        .sorted(Comparator.comparing(Movie::getDate).reversed())
	        .toList();
	}

}
