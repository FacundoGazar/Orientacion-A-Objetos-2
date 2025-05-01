package ej14.ej14;

public class Auto extends Garantia{
	private String modelo;
	private Double km;
	private Double costoNuevo;
	private Integer aniosDeAntiguedad;
	
	public Auto(Double liquidez, String modelo, Double km, Double costoNuevo, Integer aniosDeAntiguedad) {
		super(liquidez);
		this.modelo = modelo;
		this.km = km;
		this.costoNuevo = costoNuevo;
		this.aniosDeAntiguedad = aniosDeAntiguedad;
	}
	
	public Double getValor() {
		Double aux = this.getCostoNuevo();
		for(int i = 0; i<this.getAniosDeAntiguedad(); i++) {
			aux = aux - (aux * 0.1);
		}
		
		return aux;
	}
	
	public Integer getAniosDeAntiguedad() {
		return this.aniosDeAntiguedad;
	}
	
	public Double getCostoNuevo() {
		return this.costoNuevo;
	}
	
	public void addBien(Garantia bien) {
		
	}
	
	public void removeBien(Garantia bien) {
		
	}
}
