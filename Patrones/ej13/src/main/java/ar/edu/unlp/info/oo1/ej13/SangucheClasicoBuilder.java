package ar.edu.unlp.info.oo1.ej13;

public class SangucheClasicoBuilder extends Builder{
	
	public void buildPan() {
		this.getResultado().agregarIngrediente(new Ingrediente("Pan brioche", 100.0));
	}
	
	public void buildAderezo() {
		this.getResultado().agregarIngrediente(new Ingrediente("Mayonesa", 20.0));
	}
	
	public void buildPrincipal() {
		this.getResultado().agregarIngrediente(new Ingrediente("Carne de ternera", 300.0));
	}
	
	public void buildAdicional() {
		this.getResultado().agregarIngrediente(new Ingrediente("Tomate", 80.0));
	}
}
