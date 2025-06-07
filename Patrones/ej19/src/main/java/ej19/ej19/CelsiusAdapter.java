package ej19.ej19;

import java.util.List;
import java.util.stream.Collectors;

public class CelsiusAdapter implements WeatherData{
	private HomeWeatherStation homeWeatherStation;
	
	public CelsiusAdapter(HomeWeatherStation homeWeatherStation) {
		this.homeWeatherStation = homeWeatherStation;
	}
	
	public double getTemperatura() {
		return this.pasarACelsius(this.homeWeatherStation.getTemperatura());
	}
	
	public double pasarACelsius(double temperatura) {
		return (temperatura - 32) / 1.8;
	}
	
	public double getPresion() {
		return this.homeWeatherStation.getPresion();
	}
	
	public double getRadiacionSolar() {
		return this.homeWeatherStation.getRadiacionSolar();
	}
	
	public List<Double> getTemperaturas() {
		return this.homeWeatherStation.getTemperaturas().stream()
				.map(temperatura -> this.pasarACelsius(temperatura))
				.collect(Collectors.toList());
	}
	
	public String displayData() {
		return "Temperatura C: " + this.getTemperatura() + 
				" Presion atmosf: " + this.getPresion() +
				" Radiacion Solar: " + this.getRadiacionSolar();
	}
}
