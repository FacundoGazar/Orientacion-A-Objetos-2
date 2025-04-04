package ar.edu.unlp.info.oo1.ej2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PasanteTest {
	
	@Test
	public void testPasanteSinExamen() {
		Empleado e0 = new Pasante(0);
		assertEquals(22600, e0.sueldo());
 	}
	
	@Test
	public void testPasanteConExamen() {
		Empleado e1 = new Pasante(4);
		assertEquals(31000, e1.sueldo());
 	}
}
