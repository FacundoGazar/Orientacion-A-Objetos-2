package ej15.ej15;

public class GamerBuilder extends Builder{
	
	//ACA DEBERIA HACER ...addComponente(catalogo.getComponente("Procesador Gamer. Hay que agregar un pad termico y un cooler")) PERO NO IMPLEMENTE LA CLASE CATALOGO NI CREE LAS INSTANCIAS DE TODOS LOS COMPONENTES
	//PORQUE EN EL ENUNCIADO DICE QUE SE CUENTA CON ESAS CLASES PERO BUENO ESO FUNCIONA CUANDO LO HACES EN PAPEL, NO EN ECPLISE IDE muchas gracias por leer.
	public void buildProcesador() {
		this.getResultado().addComponente(new Componente("Procesador", "Procesador Gamer. Hay que agregar un pad termico y un cooler", 300.0, 30.0));
	}
	
	public void buildMemoriaRAM() {
		this.getResultado().addComponente(new Componente("Memoria RAM", "32 GB + 32 GB", 350.0, 8.0));
	}
	
	public void buildDisco() {
		this.getResultado().addComponente(new Componente("Disco", "SDD 500 GB + SSD 1 TB", 60.0, 10.0));
	}
	
	public void buildTarjetaGrafica() {
		this.getResultado().addComponente(new Componente("Tarjeta Grafica", "RTX 4090", 2.0, 2.0));
	}
	
	public void buildGabinete() {
		this.getResultado().addComponente(new Componente("Gabinete", "Gabinete gamer. Fuente "+ this.getResultado().getConsumo() +"w", 100.0, 5.0));
	}
}
