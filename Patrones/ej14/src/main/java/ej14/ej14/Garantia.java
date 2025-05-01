package ej14.ej14;

public abstract class Garantia {
	private Double liquidez;
	
	public Garantia(Double liquidez) {
		this.liquidez = liquidez;
	}
	
	public Double getLiquidez() {
		return this.liquidez;
	}
	
	public Double getValorPrendario() {
		return this.getValor() * this.getLiquidez();
	}
	
	public abstract Double getValor();
	public abstract void addBien(Garantia bien);
	public abstract void removeBien(Garantia bien);
}
