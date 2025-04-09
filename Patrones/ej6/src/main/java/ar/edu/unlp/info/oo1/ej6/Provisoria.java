package ar.edu.unlp.info.oo1.ej6;

public class Provisoria extends ExcursionState{
	
	public String obtenerInformacion(Excursion excursion) {
		return "\nCantidad de usuarios faltantes para alcanzar el cupo minimo: "
				+ (excursion.getCupoMin() - excursion.getListaClientes().size());
	}
	
	public void inscribir(Excursion excursion, Cliente unCliente) {
		excursion.getListaClientes().add(unCliente);
		if(excursion.getListaClientes().size() == excursion.getCupoMin()) {
			excursion.setExcursionState(new Definitiva());
		}
	}
}
