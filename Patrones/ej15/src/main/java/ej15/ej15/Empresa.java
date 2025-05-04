package ej15.ej15;

import java.util.List;
import java.util.ArrayList;

public class Empresa {
	private List<Pedido> listaPedidos;
	private Builder builder;
	
	public Empresa() {
		this.listaPedidos = new ArrayList<Pedido>();
	}
	
	public void setBuilder(Builder builder) {
		this.builder = builder;
	}
	
	private Builder getBuilder() {
		return this.builder;
	}
	
	public void construirEquipo(Persona persona) {
		Pedido pedido = new Pedido(persona);
		this.listaPedidos.add(pedido);
		this.getBuilder().reset();
		this.getBuilder().buildProcesador();
		this.getBuilder().buildMemoriaRAM();
		this.getBuilder().buildDisco();
		this.getBuilder().buildTarjetaGrafica();
		this.getBuilder().buildGabinete();
	}
}
