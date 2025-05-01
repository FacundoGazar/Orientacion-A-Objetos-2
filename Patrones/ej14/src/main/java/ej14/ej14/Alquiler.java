package ej14.ej14;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler extends Garantia{
	private LocalDate comienzoContrato;
	private LocalDate finContrato;
	private Double costoMensual;
	
	public Alquiler(Double liquidez, LocalDate comienzoContrato, LocalDate finContrato, Double costoMensual) {
		super(liquidez);
		this.comienzoContrato = comienzoContrato;
		this.finContrato = finContrato;
		this.costoMensual = costoMensual;
	}
	
	public Double getValor() {
		return this.getMesesDeContrato() * this.getCostoMensual();
	}
	
	public Integer getMesesDeContrato() {
		return (int) ChronoUnit.MONTHS.between(this.getComienzoContrato(), this.getFinContrato());
	}
	
	public LocalDate getComienzoContrato() {
		return this.comienzoContrato;
	}
	
	public LocalDate getFinContrato() {
		return this.finContrato;
	}
	
	public Double getCostoMensual() {
		return this.costoMensual;
	}
	
	public void addBien(Garantia bien) {
		
	}
	
	public void removeBien(Garantia bien) {
		
	}
}
