package ar.edu.unlp.info.oo1.ej13;

public class SangucheVegetarianoBuilder extends Builder{
	
	public void buildPan() {
		this.getResultado().agregarIngrediente(new Ingrediente("Pan con semillas", 120.0));
	}
	
	public void buildAderezo() {
		
	}
	
	public void buildPrincipal() {
		this.getResultado().agregarIngrediente(new Ingrediente("Provoleta grillada", 200.0));
	}
	
	public void buildAdicional() {
		this.getResultado().agregarIngrediente(new Ingrediente("Berenjenas al escabeche", 100.0));
	}
}
