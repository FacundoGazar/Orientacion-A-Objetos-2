package ar.edu.unlp.info.oo1.ej9;

import java.time.LocalDate;

public class Flexible implements CancelacionStrategy{
	public Double cancelar(LocalDate fechaInicio, LocalDate fechaCancelacion) {
		if(!fechaInicio.isBefore(fechaCancelacion)){
			return 1.0;
		}
		else {
			throw new IllegalArgumentException("La fecha de cancelación no puede ser posterior a la fecha de inicio con esta politica");
		}
	}
}
