package ar.edu.unlp.info.oo1.ej13;

public class ElScriptQuePiden {

	public static void main(String[] args) {
		SubteWay director = new SubteWay();
		
		director.construirSanguche();
		
		//DEBERIA IMPRIMIR 500 PORQUE ES EL SANGUCHE CLASICO (POR DEFAULT)
		System.out.println(director.getBuilder().getResultado().calcularPrecio());
		
		//DEBERIA IMPRIMIR 420 PORQUE ES EL SANGUCHE VEGETARIANO
		director.setBuilder(new SangucheVegetarianoBuilder());
		director.construirSanguche();
		System.out.println(director.getBuilder().getResultado().calcularPrecio());
		
		//DEBERIA IMPRIMIR 620 PORQUE ES EL SANGUCHE VEGANO
		director.setBuilder(new SangucheVeganoBuilder());
		director.construirSanguche();
		System.out.println(director.getBuilder().getResultado().calcularPrecio());
		
		//DEBERIA IMPRIMIR 618 PORQUE ES EL SANGUCHE SIN TACC
		director.setBuilder(new SangucheSinTaccBuilder());
		director.construirSanguche();
		System.out.println(director.getBuilder().getResultado().calcularPrecio());

	}

}
