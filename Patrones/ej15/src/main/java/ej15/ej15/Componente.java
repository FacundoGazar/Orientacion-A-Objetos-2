package ej15.ej15;

public class Componente {
	private String nombre;
	private String descripcion;
	private Double precio;
	private Double consumo;
	
	public Componente(String nombre, String descripcion, Double precio, Double consumo) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.consumo = consumo;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}
	
	public Double getPrecio() {
		return this.precio;
	}
	
	public Double getConsumo() {
		return this.consumo;
	}
}
