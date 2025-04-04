package ar.edu.unlp.info.oo1.ej2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PlantaTest {
	
	@Test
	public void testPlantaSinHijosSinParejaSinAnios() {
		Empleado e0 = new Planta(false,0,0);
		assertEquals(56500, e0.sueldo());
	}
	
	@Test
	public void testPlantaConHijosSinParejaSinAnios() {
		Empleado e1 = new Planta(false,4,0);
		assertEquals(64900, e1.sueldo());
	}
	
	@Test
	public void testPlantaConHijosConParejaSinAnios() {
		Empleado e2 = new Planta(true,4,0);
		assertEquals(70150, e2.sueldo());
	}
	
	@Test
	public void testPlantaConHijosConParejaConAnios() {
		Empleado e2 = new Planta(true,4,10);
		assertEquals(91150, e2.sueldo());
	}
}
