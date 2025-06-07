package ej19.ej19;

import java.util.List;
import java.util.ArrayList;

public class HomeWeatherStation implements WeatherData{
	private double temperatura;
	private double presion;
	private double radiacionSolar;
	private List<Double> temperaturas;
	
	public HomeWeatherStation(double temperatura, double presion, double radiacionSolar) {
		this.temperatura = temperatura;
		this.presion = presion;
		this.radiacionSolar = radiacionSolar;
		this.temperaturas = new ArrayList<Double>();
	}
	
	public void addTemperatura(Double temperatura) {
		this.temperaturas.add(temperatura);
	}
	
	public double getTemperatura() {
		return temperatura;
	}
	
	public double getPresion() {
		return presion;
	}
	
	public double getRadiacionSolar() {
		return radiacionSolar;
	}
	
	public List<Double> getTemperaturas() {
		return temperaturas;
	}
	
	public String displayData() {
		return "Temperatura F: " + this.getTemperatura() + 
				" Presion atmosf: " + this.getPresion() +
				" Radiacion Solar: " + this.getRadiacionSolar();
	}
}
