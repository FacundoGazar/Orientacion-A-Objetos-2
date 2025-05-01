package ar.edu.unlp.info.oo1.ej13;

public class SangucheSinTaccBuilder extends Builder{
	public void buildPan() {
		this.getResultado().agregarIngrediente(new Ingrediente("Pan chipa", 150.0));
	}
	
	public void buildAderezo() {
		this.getResultado().agregarIngrediente(new Ingrediente("Salsa Tartara", 18.0));
	}
	
	public void buildPrincipal() {
		this.getResultado().agregarIngrediente(new Ingrediente("Carne de pollo", 250.0));
	}
	
	public void buildAdicional() {
		this.getResultado().agregarIngrediente(new Ingrediente("Verduras grilladas", 200.0));
	}
}
