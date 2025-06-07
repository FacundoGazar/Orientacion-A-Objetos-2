package ej19.ej19;

public class TempPromedioDecorator extends WeatherDecorator{
	public TempPromedioDecorator(WeatherData component) {
		super(component);
	}
	
	public String displayData() {
		double promedio = this.getTemperaturas().stream()
				.mapToDouble(Double::doubleValue)
				.average()
				.orElse(0.0);
		
		return super.displayData() + "; Promedio: " + String.format("%.1f", promedio);
	}
}
