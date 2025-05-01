package ar.edu.unlp.info.oo1.ej11b;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AguaTest {
	TopografiaComponent topografiaAgua;
	
	@BeforeEach
	public void setUp() throws Exception{
		topografiaAgua = new Agua();
	}
	
	@Test
	public void calcularProporcionDeAgua() {
		assertEquals(1, topografiaAgua.getProporcionAgua());
	}
	
	@Test
	public void calcularProporcionDeTierra() {
		assertEquals(0, topografiaAgua.getProporcionTierra());
	}
	
	@Test
	public void verificarIgualdades() {
		assertTrue(topografiaAgua.isEquals(new Agua()));
		assertFalse(topografiaAgua.isEquals(new Tierra()));
		assertFalse(topografiaAgua.isEquals(new Mixta()));
	}
}
