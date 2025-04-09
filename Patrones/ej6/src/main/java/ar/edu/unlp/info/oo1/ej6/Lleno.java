package ar.edu.unlp.info.oo1.ej6;

public class Lleno extends ExcursionState{
	
	public void inscribir(Excursion excursion, Cliente unCliente) {
		excursion.getListaDeEspera().add(unCliente);
	}
	
	public String obtenerInformacion(Excursion excursion) {
		return "";
	}
}
