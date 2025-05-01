package ar.edu.unlp.info.oo1.ej13;

public abstract class Builder {
	private Sanguche sanguche;
	
	public void reset() {
		this.sanguche = new Sanguche();
	}
	
	public Sanguche getResultado() {
		return this.sanguche;
	}
	
	public abstract void buildPan();
	public abstract void buildAderezo();
	public abstract void buildPrincipal();
	public abstract void buildAdicional();
}
