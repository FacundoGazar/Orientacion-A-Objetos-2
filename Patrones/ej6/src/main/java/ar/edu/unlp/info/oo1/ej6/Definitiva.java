package ar.edu.unlp.info.oo1.ej6;

import java.util.stream.Collectors;

public class Definitiva extends ExcursionState{
	
	@Override
	public String obtenerInformacion(Excursion excursion) {
		String emails = excursion.getListaClientes().stream()
		    .map(Cliente::getEmail)
		    .collect(Collectors.joining(", "));

		return "Cantidad de usuarios faltantes para alcanzar el cupo maximo: "
			+ (excursion.getCupoMax() - excursion.getListaClientes().size())
			+ "\nEmails de los clientes inscriptos: " + emails;
	}

	
	public void inscribir(Excursion excursion, Cliente unCliente) {
		excursion.getListaClientes().add(unCliente);
		if(excursion.getListaClientes().size() == excursion.getCupoMax()) {
			excursion.setExcursionState(new Lleno());
		}
	}
}
