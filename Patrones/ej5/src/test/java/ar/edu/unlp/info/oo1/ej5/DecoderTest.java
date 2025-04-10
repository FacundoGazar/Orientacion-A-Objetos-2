package ar.edu.unlp.info.oo1.ej5;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DecoderTest {
	Decoder decoder;
	Movie p1;
	Movie p2;
	Movie p3;
	Movie p4;
	Movie p5;
	Movie p6;
	Movie p7;
	Movie p8;
	Movie p9;
	Movie p10;
	
	@BeforeEach
	void setUp() throws Exception {
		p1 = new Movie("An American Girl: Grace Stirs Up Success", 2015, 10.0);
		p2 = new Movie("Sour Prom", 2021, 9.0);
		p3 = new Movie("Olivia Rodrigo: Driving Home 2 U", 2022, 9.70);
		p4 = new Movie("Olivia Rodrigo: Guts World Tour", 2024, 10.0);
		p5 = new Movie("Bizaardvark", 2016, 5.0);
		p6 = new Movie("New Girl", 2017, 6.4);
		p7 = new Movie("High School Musical: The Musical: The Series", 2019, 7.43);
		p8 = new Movie("The Disney Family Singalong", 2020, 8.11);
		p9 = new Movie("Ladies & Gentlemen... 50 Years of SNL Music", 2025, 10.0);
		p10 = new Movie("Mora y los metegoles en el mundo de los cielos", 2020, 10.0);
		
		p1.addSimilarMovie(p2);
		p1.addSimilarMovie(p3);
		p1.addSimilarMovie(p4);
		p2.addSimilarMovie(p5);
		p3.addSimilarMovie(p6);
		p4.addSimilarMovie(p7);
		p4.addSimilarMovie(p3);
		p5.addSimilarMovie(p10);
		p5.addSimilarMovie(p3);
		p4.addSimilarMovie(p9);
		p4.addSimilarMovie(p2);
		p7.addSimilarMovie(p6);
		p7.addSimilarMovie(p8);
		p8.addSimilarMovie(p9);
		p9.addSimilarMovie(p10);
		p10.addSimilarMovie(p6);
		p10.addSimilarMovie(p1);
		p8.addSimilarMovie(p2);
		
		decoder = new Decoder();
		
		decoder.addMovie(p1);
		decoder.addMovie(p2);
		decoder.addMovie(p3);
		decoder.addMovie(p4);
		decoder.addMovie(p5);
		decoder.addMovie(p6);
		decoder.addMovie(p7);
		decoder.addMovie(p8);
		decoder.addMovie(p9);
		decoder.addMovie(p10);
		
		decoder.watchMovie(p1);
		decoder.watchMovie(p7);
		decoder.watchMovie(p10);
	}
	
	@Test
	public void testSimilarMovies() {
		decoder.setDecoderStrategy(new SimilarStrategy());
		List<Movie> similar = decoder.getSuggestion();
		
		assertTrue(similar.contains(p9));
		assertTrue(similar.contains(p4));
		assertTrue(similar.contains(p3));
	}
	
	@Test
	public void testBestRatedMovies() {
		decoder.setDecoderStrategy(new RatingStrategy());
		List<Movie> bestRated = decoder.getSuggestion();
		
		assertTrue(bestRated.contains(p9));
		assertTrue(bestRated.contains(p4));
		assertTrue(bestRated.contains(p3));
	}
	
	@Test
	public void testNewestMovies() {
		decoder.setDecoderStrategy(new NewStrategy());
		List<Movie> newestMovie = decoder.getSuggestion();
		
		assertTrue(newestMovie.contains(p9));
		assertTrue(newestMovie.contains(p4));
		assertTrue(newestMovie.contains(p3));
	}
}
