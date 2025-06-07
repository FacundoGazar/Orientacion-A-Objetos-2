package ej19.ej19;

public class TempMaxDecorator extends WeatherDecorator{
	public TempMaxDecorator(WeatherData component) {
		super(component);
	}
	
	@Override
	public String displayData() {
		double tempMax = this.getTemperaturas().stream()
			    .max(Double::compare)
			    .orElse(0.0);
		
		return super.displayData() + "; Maximo: " + String.format("%.1f", tempMax);
	}
}
