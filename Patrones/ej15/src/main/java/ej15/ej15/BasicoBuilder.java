package ej15.ej15;

public class BasicoBuilder extends Builder{
	
	//ACA DEBERIA HACER ...addComponente(catalogo.getComponente("Procesador Basico")) PERO NO IMPLEMENTE LA CLASE CATALOGO NI CREE LAS INSTANCIAS DE TODOS LOS COMPONENTES
		//PORQUE EN EL ENUNCIADO DICE QUE SE CUENTA CON ESAS CLASES PERO BUENO ESO FUNCIONA CUANDO LO HACES EN PAPEL, NO EN ECPLISE IDE muchas gracias por leer.
	public void buildProcesador() {
		this.getResultado().addComponente(new Componente("Procesador", "Procesador Basico", 100.0, 10.0));
	}
	
	public void buildMemoriaRAM() {
		this.getResultado().addComponente(new Componente("Memoria RAM", "8 GB", 150.0, 5.0));
	}
	
	public void buildDisco() {
		this.getResultado().addComponente(new Componente("Disco", "HDD 500 GB", 40.0, 8.0));
	}
	
	public void buildTarjetaGrafica() {
		this.getResultado().addComponente(new Componente("Tarjeta Grafica", "No posee (integrada)", 0.0, 0.0));
	}
	
	public void buildGabinete() {
		this.getResultado().addComponente(new Componente("Gabinete", "Gabinete estandar (ya viene con fuente)", 80.0, 3.0));
	}
}