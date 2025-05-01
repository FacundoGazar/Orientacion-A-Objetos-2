package ar.edu.unlp.info.oo1.ej11b;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MixtaTest {
	TopografiaComponent topografiaMixtaUno;
	TopografiaComponent topografiaMixtaDos;
	TopografiaComponent aux;
	
	@BeforeEach
	public void setUp() throws Exception{
		topografiaMixtaUno = new Mixta();
		topografiaMixtaDos = new Mixta();
		aux = new Mixta();
		
		topografiaMixtaUno.agregarTopografia(new Agua());
		topografiaMixtaUno.agregarTopografia(new Tierra());
		topografiaMixtaUno.agregarTopografia(new Tierra());
		topografiaMixtaUno.agregarTopografia(new Agua());
		
		aux.agregarTopografia(new Agua());
		aux.agregarTopografia(new Tierra());
		aux.agregarTopografia(new Tierra());
		aux.agregarTopografia(new Agua());
		
		topografiaMixtaDos.agregarTopografia(new Agua());
		topografiaMixtaDos.agregarTopografia(new Tierra());
		topografiaMixtaDos.agregarTopografia(new Tierra());
		topografiaMixtaDos.agregarTopografia(aux);
		
		
	}
	
	@Test
	public void calcularProporcionDeAgua() {
		assertEquals(0.5, topografiaMixtaUno.getProporcionAgua());
		assertEquals(0.375, topografiaMixtaDos.getProporcionAgua());
	}
	
	@Test
	public void calcularProporcionDeTierra() {
		assertEquals(0.5, topografiaMixtaUno.getProporcionTierra());
		assertEquals(0.375, topografiaMixtaDos.getProporcionAgua());
	}
	
	@Test
	public void verificarIgualdades() {
		TopografiaComponent auxFalso = new Mixta();
		TopografiaComponent auxVerdaderoUno = new Mixta();
		
		auxFalso.agregarTopografia(new Agua());
		auxFalso.agregarTopografia(new Tierra());
		auxFalso.agregarTopografia(new Agua());
		auxFalso.agregarTopografia(new Tierra());
		
		auxVerdaderoUno.agregarTopografia(new Agua());
		auxVerdaderoUno.agregarTopografia(new Tierra());
		auxVerdaderoUno.agregarTopografia(new Tierra());
		auxVerdaderoUno.agregarTopografia(new Agua());
	
		TopografiaComponent auxVerdaderoDos = new Mixta();
		TopografiaComponent aux = new Mixta();
		
		aux.agregarTopografia(new Agua());
		aux.agregarTopografia(new Tierra());
		aux.agregarTopografia(new Tierra());
		aux.agregarTopografia(new Agua());
		
		auxVerdaderoDos.agregarTopografia(new Agua());
		auxVerdaderoDos.agregarTopografia(new Tierra());
		auxVerdaderoDos.agregarTopografia(new Tierra());
		auxVerdaderoDos.agregarTopografia(aux);
		
		assertFalse(topografiaMixtaUno.isEquals(new Agua()));
		assertFalse(topografiaMixtaDos.isEquals(new Agua()));
		assertFalse(topografiaMixtaUno.isEquals(new Tierra()));
		assertFalse(topografiaMixtaDos.isEquals(new Tierra()));
		assertFalse(topografiaMixtaUno.isEquals(auxFalso));
		assertTrue(topografiaMixtaUno.isEquals(auxVerdaderoUno));
		assertFalse(topografiaMixtaDos.isEquals(auxFalso));
		assertTrue(topografiaMixtaDos.isEquals(auxVerdaderoDos));
	}
}
