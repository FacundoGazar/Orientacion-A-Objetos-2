package ar.edu.unlp.info.oo1.ej11;

public class Tierra extends TopografiaComponent{
	
	public void agregarTopografia(TopografiaComponent topografia) {
		
	}
	
	public void eliminarTopografia(TopografiaComponent topografia) {
		
	}
	
	public Double getProporcionAgua() {
		return 0.0;
	}
	
	public Double getProporcionTierra() {
		return 1.0;
	}
	
	public Boolean isEquals(Agua topografia) {
		return false;
	}
	
	public Boolean isEquals(Tierra topografia) {
		return true;
	}
	
	@Override
	public Boolean isEquals(TopografiaComponent otraTopografia) {
		return otraTopografia.isEquals(this);
	}
}
