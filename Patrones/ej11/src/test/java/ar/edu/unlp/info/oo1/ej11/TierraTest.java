package ar.edu.unlp.info.oo1.ej11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TierraTest {
	TopografiaComponent topografiaTierra;
	
	@BeforeEach
	public void setUp() throws Exception{
		topografiaTierra = new Tierra();
	}
	
	@Test
	public void calcularProporcionDeAgua() {
		assertEquals(0, topografiaTierra.getProporcionAgua());
	}
	
	@Test
	public void calcularProporcionDeTierra() {
		assertEquals(1, topografiaTierra.getProporcionTierra());
	}
	
	@Test
	public void verificarIgualdades() {
		assertFalse(topografiaTierra.isEquals(new Agua()));
		assertTrue(topografiaTierra.isEquals(new Tierra()));
		assertFalse(topografiaTierra.isEquals(new Mixta()));
	}
}
