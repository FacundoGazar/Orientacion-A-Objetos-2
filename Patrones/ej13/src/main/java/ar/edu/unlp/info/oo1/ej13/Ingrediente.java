package ar.edu.unlp.info.oo1.ej13;

public class Ingrediente {
	private Double precio;
	private String nombre;
	
	public Ingrediente(String nombre, Double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public Double getPrecio() {
		return this.precio;
	}
}
