package ej19.ej19;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestWeatherStation {
    private HomeWeatherStation homeWeatherStation;
    private CelsiusAdapter celsiusAdapter;

    @BeforeEach
    public void setUp() {
        // Temperatura actual: 86°F, presión 1008, radiación 200
        homeWeatherStation = new HomeWeatherStation(86.0, 1008.0, 200.0);
        
        // Nuevas temperaturas históricas
        homeWeatherStation.addTemperatura(80.6);  // ≈ 27.0°C
        homeWeatherStation.addTemperatura(87.8);  // ≈ 31.0°C
        homeWeatherStation.addTemperatura(91.4);  // ≈ 33.0°C

        celsiusAdapter = new CelsiusAdapter(homeWeatherStation);
    }

    @Test
    public void testHomeWeatherStationDisplayData() {
        String expected = "Temperatura F: 86.0 Presion atmosf: 1008.0 Radiacion Solar: 200.0";
        assertEquals(expected, homeWeatherStation.displayData());
    }

    @Test
    public void testCelsiusAdapterDisplayData() {
        // 86°F = 30.0°C
        String expected = "Temperatura C: 30.0 Presion atmosf: 1008.0 Radiacion Solar: 200.0";
        assertEquals(expected, celsiusAdapter.displayData());
    }

    @Test
    public void testCelsiusWithPromedioDecorator() {
        WeatherData decorated = new TempPromedioDecorator(celsiusAdapter);
        // (27 + 31 + 33) / 3 = 30.33...
        String expected = "Temperatura C: 30.0 Presion atmosf: 1008.0 Radiacion Solar: 200.0; Promedio: 30,3";
        assertEquals(expected, decorated.displayData());
    }

    @Test
    public void testHomeWeatherStationWithPromedioDecorator() {
        WeatherData decorated = new TempPromedioDecorator(homeWeatherStation);
        // (80.6 + 87.8 + 91.4) / 3 = 86.6
        String expected = "Temperatura F: 86.0 Presion atmosf: 1008.0 Radiacion Solar: 200.0; Promedio: 86,6";
        assertEquals(expected, decorated.displayData());
    }

    @Test
    public void testCelsiusWithPromMinMaxDecorators() {
        WeatherData decorated = new TempPromedioDecorator(celsiusAdapter);
        decorated = new TempMinDecorator(decorated);
        decorated = new TempMaxDecorator(decorated);
        String expected = "Temperatura C: 30.0 Presion atmosf: 1008.0 Radiacion Solar: 200.0; Promedio: 30,3; Minimo: 27,0; Maximo: 33,0";
        assertEquals(expected, decorated.displayData());
    }

    @Test
    public void testCelsiusWithMinMaxDecorators() {
        WeatherData decorated = new TempMinDecorator(celsiusAdapter);
        decorated = new TempMaxDecorator(decorated);
        String expected = "Temperatura C: 30.0 Presion atmosf: 1008.0 Radiacion Solar: 200.0; Minimo: 27,0; Maximo: 33,0";
        assertEquals(expected, decorated.displayData());
    }

    @Test
    public void testCelsiusWithMinMaxPromDecorators() {
        WeatherData decorated = new TempMinDecorator(celsiusAdapter);
        decorated = new TempMaxDecorator(decorated);
        decorated = new TempPromedioDecorator(decorated);
        String expected = "Temperatura C: 30.0 Presion atmosf: 1008.0 Radiacion Solar: 200.0; Minimo: 27,0; Maximo: 33,0; Promedio: 30,3";
        assertEquals(expected, decorated.displayData());
    }
}
