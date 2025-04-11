package ar.edu.unlp.info.oo1.ej9;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Moderada implements CancelacionStrategy{
	public Double cancelar(LocalDate fechaInicio, LocalDate fechaCancelacion) {
        long dias = ChronoUnit.DAYS.between(fechaCancelacion, fechaInicio);

        if (dias < 0) {
            throw new IllegalArgumentException("La fecha de cancelación no puede ser posterior a la fecha de inicio con esta politica");
        } else if (dias >= 7) {
            return 1.0;
        } else if (dias >= 2) {
            return 0.5;
        } else {
            return 0.0; // Supongo que no hay reembolso si lo decis el dia anterior ponele
        }
    }
}
