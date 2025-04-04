package ar.edu.unlp.info.oo1.ej2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TemporarioTest {
	
	@Test
	public void testTemporarioSinTrabajoSinHijosSinPareja() {
		Empleado e0 = new Temporario(false,0,0);
		assertEquals(22600, e0.sueldo());
	}
	
	@Test
	public void testTemporarioConTrabajoSinHijosSinPareja() {
		Empleado e1 = new Temporario(false,0,10);
		assertEquals(25990, e1.sueldo());
	}
	
	@Test
	public void testTemporarioConTrabajoConHijosSinPareja() {
		Empleado e2 = new Temporario(false,4,10);
		assertEquals(34390, e2.sueldo());
	}
	
	@Test
	public void testTemporarioConTrabajoConHijosConPareja() {
		Empleado e3 = new Temporario(true,4,10);
		assertEquals(39640, e3.sueldo());
	}
}
