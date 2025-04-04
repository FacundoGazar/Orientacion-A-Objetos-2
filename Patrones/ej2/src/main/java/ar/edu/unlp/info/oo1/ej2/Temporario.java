package ar.edu.unlp.info.oo1.ej2;

public class Temporario extends EmpleadoTemporarioOPlanta{
	public double cantHorasTrabajadas;
	
	public Temporario(boolean esCasado, int cantHijo, double cantHorasTrabajadas) {
		super(esCasado, cantHijo);
		this.cantHorasTrabajadas = cantHorasTrabajadas;
	}
	
	public double calcularSueldoBasico() {
		return 20000 + (this.getCantHorasTrabajadas() * 300);
	}
	
	public double getCantHorasTrabajadas() {
		return this.cantHorasTrabajadas;
	}
}
