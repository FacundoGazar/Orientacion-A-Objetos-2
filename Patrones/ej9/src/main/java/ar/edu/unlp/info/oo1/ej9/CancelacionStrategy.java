package ar.edu.unlp.info.oo1.ej9;

import java.time.LocalDate;

public interface CancelacionStrategy {
	public Double cancelar(LocalDate fechaInicio, LocalDate fechaCancelacion);
}
