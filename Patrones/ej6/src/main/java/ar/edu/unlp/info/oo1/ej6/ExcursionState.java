package ar.edu.unlp.info.oo1.ej6;

public abstract class ExcursionState {
	
	public abstract String obtenerInformacion(Excursion excursion);
	
	public abstract void inscribir(Excursion excursion, Cliente unCliente);
}
