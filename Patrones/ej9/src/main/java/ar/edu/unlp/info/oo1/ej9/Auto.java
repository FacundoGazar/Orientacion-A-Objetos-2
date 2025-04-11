package ar.edu.unlp.info.oo1.ej9;

import java.time.LocalDate;

public class Auto {
	private Double costoPorDia;
	private String marca;
	private CancelacionStrategy cancelacionStrategy;
	
	public Auto(Double costoPorDia, String marca) {
		this.costoPorDia = costoPorDia;
		this.marca = marca;
		this.cancelacionStrategy = new Flexible();
	}

	public Double getCostoPorDia() {
		return costoPorDia;
	}

	public Double getPorcentajeDeRembolso(LocalDate fechaInicio, LocalDate fechaCancelacion) {
		return this.getCancelacionStrategy().cancelar(fechaInicio, fechaCancelacion);
	}

	public CancelacionStrategy getCancelacionStrategy() {
		return cancelacionStrategy;
	}

	public void setCancelacionStrategy(CancelacionStrategy cancelacionStrategy) {
		this.cancelacionStrategy = cancelacionStrategy;
	}
	
}
