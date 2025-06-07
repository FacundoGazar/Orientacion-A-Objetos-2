package ej19.ej19;

public class TempMinDecorator extends WeatherDecorator{
	public TempMinDecorator(WeatherData component) {
		super(component);
	}
	
	@Override
	public String displayData() {
		double tempMin = this.getTemperaturas().stream()
			    .min(Double::compare)
			    .orElse(9999.0);
		
		return super.displayData() + "; Minimo: " + String.format("%.1f", tempMin);
	}
}
