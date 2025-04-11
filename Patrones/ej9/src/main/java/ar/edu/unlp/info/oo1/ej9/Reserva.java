package ar.edu.unlp.info.oo1.ej9;

import java.time.LocalDate;

public class Reserva {
	private Integer cantidadDias;
	private LocalDate fechaInicio;
	private Auto auto;
	
	public Reserva(Integer cantidadDias, LocalDate date, Auto auto) {
		this.cantidadDias = cantidadDias;
		this.fechaInicio = date;
		this.auto = auto;
	}
	
	public Double montoAPagar() {
		return this.getCantidadDias() * this.getAuto().getCostoPorDia();
	}
	
	public Double montoARembolsar(LocalDate fechaCancelacion) {
		return this.montoAPagar() * this.getAuto().getPorcentajeDeRembolso(this.getFechaInicio(), fechaCancelacion);
	}

	public Integer getCantidadDias() {
		return cantidadDias;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public Auto getAuto() {
		return auto;
	}

}
