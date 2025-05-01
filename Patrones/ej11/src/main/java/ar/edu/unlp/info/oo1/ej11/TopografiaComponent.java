package ar.edu.unlp.info.oo1.ej11;

public abstract class TopografiaComponent {
	
	public abstract void agregarTopografia(TopografiaComponent topografia);
	public abstract void eliminarTopografia(TopografiaComponent topografia);
	public abstract Double getProporcionAgua();
	public abstract Double getProporcionTierra();
	public abstract Boolean isEquals(Agua topografia);
	public abstract Boolean isEquals(Tierra topografia);
	
	public abstract Boolean isEquals(TopografiaComponent topografia);
	
	public Boolean isEquals(Mixta topografia) {
		return false;
	}
}
