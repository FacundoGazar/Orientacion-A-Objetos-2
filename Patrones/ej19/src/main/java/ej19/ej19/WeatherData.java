package ej19.ej19;

import java.util.List;

public interface WeatherData {
	public double getTemperatura();
	public double getPresion();
	public double getRadiacionSolar();
	public List<Double> getTemperaturas();
	public String displayData();
}
