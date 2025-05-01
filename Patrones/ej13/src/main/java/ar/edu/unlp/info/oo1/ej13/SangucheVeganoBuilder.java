package ar.edu.unlp.info.oo1.ej13;

public class SangucheVeganoBuilder extends Builder{
	
	public void buildPan() {
		this.getResultado().agregarIngrediente(new Ingrediente("Pan integral", 100.0));
	}
	
	public void buildAderezo() {
		this.getResultado().agregarIngrediente(new Ingrediente("Salsa criolla", 20.0));
	}
	
	public void buildPrincipal() {
		this.getResultado().agregarIngrediente(new Ingrediente("Milanesa de girgolas", 500.0));
	}
	
	public void buildAdicional() {
		
	}
}
