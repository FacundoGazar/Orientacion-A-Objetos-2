package ar.edu.unlp.info.oo1.ej13;

public class SubteWay {
	private Builder builder;
	
	public SubteWay() {
		builder = new SangucheClasicoBuilder();
	}
	
	public void setBuilder(Builder builder) {
		this.builder = builder;
	}
	
	public Builder getBuilder() {
		return this.builder;
	}
	
	public void construirSanguche() {
		this.getBuilder().reset();
		this.getBuilder().buildPan();
		this.getBuilder().buildAderezo();
		this.getBuilder().buildPrincipal();
		this.getBuilder().buildAdicional();
	}
}
