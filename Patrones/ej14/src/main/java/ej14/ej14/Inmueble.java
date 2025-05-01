package ej14.ej14;

public class Inmueble extends Garantia{
	private String direccion;
	private Double superficie;
	private Double costoPorMetroCuadrado;
	
	public Inmueble(Double liquidez, String direccion, Double superficie, Double costoPorMetroCuadrado) {
		super(liquidez);
		this.direccion = direccion;
		this.superficie = superficie;
		this.costoPorMetroCuadrado = costoPorMetroCuadrado;
	}
	
	public Double getValor() {
		return this.getCostoPorMetroCuadrado() * this.getSuperficie();
	}
	
	public Double getSuperficie() {
		return this.superficie;
	}
	
	public Double getCostoPorMetroCuadrado() {
		return this.costoPorMetroCuadrado;
	}
	
	public void addBien(Garantia bien) {
		
	}
	
	public void removeBien(Garantia bien) {
		
	}
}
