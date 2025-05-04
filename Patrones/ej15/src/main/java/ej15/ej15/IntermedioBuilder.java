package ej15.ej15;

public class IntermedioBuilder extends Builder{
	
	//ACA DEBERIA HACER ...addComponente(catalogo.getComponente("Procesador Intermedio")) PERO NO IMPLEMENTE LA CLASE CATALOGO NI CREE LAS INSTANCIAS DE TODOS LOS COMPONENTES
	//PORQUE EN EL ENUNCIADO DICE QUE SE CUENTA CON ESAS CLASES PERO BUENO ESO FUNCIONA CUANDO LO HACES EN PAPEL, NO EN ECPLISE IDE muchas gracias por leer.
	public void buildProcesador() {
		this.getResultado().addComponente(new Componente("Procesador", "Procesador Intermedio", 200.0, 120.0));
	}
	
	public void buildMemoriaRAM() {
		this.getResultado().addComponente(new Componente("Memoria RAM", "16 GB", 250.0, 6.0));
	}
	
	public void buildDisco() {
		this.getResultado().addComponente(new Componente("Disco", "SDD 500 GB", 50.0, 9.0));
	}
	
	public void buildTarjetaGrafica() {
		this.getResultado().addComponente(new Componente("Tarjeta Grafica", "GTX 1650", 1.0, 1.0));
	}
	
	public void buildGabinete() {
		this.getResultado().addComponente(new Componente("Gabinete", "Gabinete intermedio. Fuente 800 w", 90.0, 4.0));
	}
}
