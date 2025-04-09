package ar.edu.unlp.info.oo1.ej6;

import static org.junit.jupiter.api.Assertions.*;
/*
Escriba un test para inscribir a un usuario en la excursión “Dos días en kayak bajando el Paraná”, 
con cupo mínimo de 1 persona y cupo máximo 2, con dos personas ya inscriptas. 
Implemente todos los mensajes que considere necesarios.
 */

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExcursionTest {
	private Excursion excursion;
	private Cliente c1;
	private Cliente c2;
	private Cliente c3;

	@BeforeEach
	public void setUp() throws Exception {
		this.excursion = new Excursion("Dos días en kayak bajando el Paraná", LocalDate.of(2025, 4, 9), LocalDate.of(2025, 4, 30), 
									   "Mi casa", 51480.04, 1, 2);
		this.c1 = new Cliente("Olivia", "Rodrigo", "liv@gmail.com");
		this.c2 = new Cliente("Mora", "Quita", "moraquita@gmail.com");
		this.c3 = new Cliente("Pol", "Macarni", "teamojohn@gmail.com");
		this.excursion.inscribir(c1);
		this.excursion.inscribir(c2);
	}

	@Test
	public void testInscribirEsperaSize() {
		this.excursion.inscribir(c3);
		assertEquals(1,this.excursion.getListaDeEspera().size());
	}
	
	@Test
	public void testInscribirClientesSize() {
		this.excursion.inscribir(c3);
		assertEquals(2,this.excursion.getListaClientes().size());
	}
	
	@Test
	public void testInscribirClientesContieneUno() {
		this.excursion.inscribir(c3);
		assertTrue(this.excursion.getListaClientes().contains(c1));
	}
	
	@Test
	public void testInscribirClientesContieneDos() {
		this.excursion.inscribir(c3);
		assertTrue(this.excursion.getListaClientes().contains(c2));
	}
	
	@Test
	public void testInscribirClientesContieneTres() {
		this.excursion.inscribir(c3);
		assertFalse(this.excursion.getListaClientes().contains(c3));
	}
	
	@Test
	public void testInscribirClientesEsperaContieneTres() {
		this.excursion.inscribir(c3);
		assertTrue(this.excursion.getListaDeEspera().contains(c3));
	}
	
	@Test
	public void testInscribirClientesTaLleno() {
		this.excursion.inscribir(c3);
		assertTrue(this.excursion.getExcursionState() instanceof Lleno);
	}

}
