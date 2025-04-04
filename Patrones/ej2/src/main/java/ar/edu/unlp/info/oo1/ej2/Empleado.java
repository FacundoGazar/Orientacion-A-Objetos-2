package ar.edu.unlp.info.oo1.ej2;

public abstract class Empleado {
	
	public double sueldo() {
		return this.calcularSueldoBasico() +
				this.calcularAdicional() +
				this.calcularDescuento();
	}
	
	public double calcularDescuento() {
		return (this.calcularSueldoBasico() * 0.13) + (this.calcularAdicional() * 0.05);
	}
	
	public abstract double calcularSueldoBasico();
	public abstract double calcularAdicional();
}
