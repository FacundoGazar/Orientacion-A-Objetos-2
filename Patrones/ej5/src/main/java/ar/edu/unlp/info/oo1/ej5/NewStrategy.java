package ar.edu.unlp.info.oo1.ej5;

import java.util.List;
import java.util.stream.Collectors;

public class NewStrategy extends DecoderStrategy{
	
	public List<Movie> orderList(Decoder decoder){
		return decoder.getMovies().stream()
				.sorted((m2, m1) -> m1.getDate().compareTo(m2.getDate()))
				.collect(Collectors.toList());
	}
}
