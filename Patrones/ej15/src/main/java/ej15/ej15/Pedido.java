package ej15.ej15;

import java.time.LocalDate;

public class Pedido {
	private Persona persona;
	private LocalDate fechaDePedido;

	public Pedido(Persona persona) {
		this.persona = persona;
		this.fechaDePedido = java.time.LocalDate.now();
	}
}
