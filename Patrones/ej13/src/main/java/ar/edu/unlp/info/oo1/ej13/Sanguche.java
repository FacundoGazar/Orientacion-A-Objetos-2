package ar.edu.unlp.info.oo1.ej13;

import java.util.List;
import java.util.ArrayList;

public class Sanguche {
	private List<Ingrediente> ingredientes;
	
	public Sanguche() {
		this.ingredientes = new ArrayList<Ingrediente>();
	}
	
	public void agregarIngrediente(Ingrediente ingrediente) {
		this.ingredientes.add(ingrediente);
	}
	
	public Double calcularPrecio() {
		return this.ingredientes.stream().
				mapToDouble(ingrediente -> ingrediente.getPrecio()).
				sum();
	}
}
