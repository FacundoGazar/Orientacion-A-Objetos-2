package ar.edu.unlp.info.oo1.ej2;

public class Pasante extends Empleado{
	private int examenesRendidos;
	
	public Pasante(int examenesRendidos) {
		this.examenesRendidos = examenesRendidos;
	}
	
	public double calcularSueldoBasico() {
		return 20000;
	}
	
	public double calcularAdicional() {
		int total = 0;
		for (int i=0; i<this.getExamenesRendidos(); i++) {
			total += 2000;
		}
		
		return total;
	}
	
	public int getExamenesRendidos() {
		return this.examenesRendidos;
	}
}
