package ar.edu.unlp.info.oo1.ej11b;

public class Pantano extends TopografiaComponent{
	
	public void agregarTopografia(TopografiaComponent topografia) {
		
	}
	
	public void eliminarTopografia(TopografiaComponent topografia) {
		
	}
	
	public TopografiaComponent getTopografia() {
		return this;
	}
	
	public Double getProporcionAgua() {
		return 0.7;
	}
	
	public Double getProporcionTierra() {
		return 0.3;
	}
	
	public Boolean isEquals(Agua topografia) {
		return false;
	}
	
	public Boolean isEquals(Tierra topografia) {
		return false;
	}
	
	public Boolean isEquals(Pantano topografia) {
		return true;
	}
	
	@Override
	public Boolean isEquals(TopografiaComponent otraTopografia) {
		return otraTopografia.isEquals(this);
	}
}
