package ar.edu.unlp.info.oo1.ej2;

public abstract class EmpleadoTemporarioOPlanta extends Empleado{
	private boolean esCasado;
	private int cantHijo;
	
	public EmpleadoTemporarioOPlanta(boolean esCasado, int cantHijo) {
		this.esCasado = esCasado;
		this.cantHijo = cantHijo;
	}
	
	public double calcularAdicional() {
		int total = 0;
		
		if(this.getEsCasado()) {
			total += 5000;
		}
		
		for(int i=0; i<this.getCantHijo(); i++) {
			total += 2000;
		}
		
		return total;
	}
	
	public boolean getEsCasado() {
		return this.esCasado;
	}
	
	public int getCantHijo() {
		return this.cantHijo;
	}
	
	public abstract double calcularSueldoBasico();
}
