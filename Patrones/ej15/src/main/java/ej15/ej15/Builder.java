package ej15.ej15;

public abstract class Builder {
	private Equipo equipo;
	
	public void reset() {
		this.equipo = new Equipo();
	}
	
	public Equipo getResultado() {
		return this.equipo;
	}
	
	public abstract void buildProcesador();
	public abstract void buildMemoriaRAM();
	public abstract void buildDisco();
	public abstract void buildTarjetaGrafica();
	public abstract void buildGabinete();
}
