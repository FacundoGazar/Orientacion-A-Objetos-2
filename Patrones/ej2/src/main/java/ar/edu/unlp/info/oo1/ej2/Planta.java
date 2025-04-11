package ar.edu.unlp.info.oo1.ej2;

public class Planta extends EmpleadoTemporarioOPlanta{
	private int aniosDeAntiguedad;
	
	public Planta(boolean esCasado, int cantHijo, int aniosDeAntiguedad) {
		super(esCasado, cantHijo);
		this.aniosDeAntiguedad = aniosDeAntiguedad;
	}
	
	public double calcularSueldoBasico() {
		return 50000;
	}
	
	public double calcularAdicional() {
		int total = 0;
		
		for (int i = 0; i<this.getAniosDeAntiguedad(); i++) {
			total += 2000;
		}
		
		return super.calcularAdicional() + total;
	}
	
	public int getAniosDeAntiguedad() {
		return this.aniosDeAntiguedad;
	}
}
