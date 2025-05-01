package ar.edu.unlp.info.oo1.ej11;

public class Agua extends TopografiaComponent{
	
	public void agregarTopografia(TopografiaComponent topografia) {
		
	}
	
	public void eliminarTopografia(TopografiaComponent topografia) {
		
	}
	
	public TopografiaComponent getTopografia() {
		return this;
	}
	
	public Double getProporcionAgua() {
		return 1.0;
	}
	
	public Double getProporcionTierra() {
		return 0.0;
	}
	
	public Boolean isEquals(Agua topografia) {
		return true;
	}
	
	public Boolean isEquals(Tierra topografia) {
		return false;
	}
	
	@Override
	public Boolean isEquals(TopografiaComponent otraTopografia) {
		return otraTopografia.isEquals(this);
	}
}
