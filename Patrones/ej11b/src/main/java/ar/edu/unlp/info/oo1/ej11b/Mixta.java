package ar.edu.unlp.info.oo1.ej11b;

import java.util.List;
import java.util.ArrayList;

public class Mixta extends TopografiaComponent{
	private List<TopografiaComponent> topografias;
	
	public Mixta() {
		this.topografias = new ArrayList<TopografiaComponent>();
	}
	
	public void agregarTopografia(TopografiaComponent topografia) {
		if (this.getComponentes().size() < 4) {
			this.topografias.add(topografia);
		}
	}
	
	public void eliminarTopografia(TopografiaComponent topografia) {
		this.topografias.remove(topografia);
	}
	
	public List<TopografiaComponent> getComponentes(){
		return this.topografias;
	}
	
	public Double getProporcionAgua() {
		double aux = this.getComponentes().stream().
				mapToDouble(componente -> componente.getProporcionAgua()).
				sum();
		
		return aux / this.getComponentes().size();
	}
	
	public Double getProporcionTierra() {
		double aux = this.getComponentes().stream().
				mapToDouble(componente -> componente.getProporcionTierra()).
				sum();
		
		return aux / this.getComponentes().size();
	}
	
	public Boolean isEquals(Agua topografia) {
		return false;
	}
	
	public Boolean isEquals(Tierra topografia) {
		return false;
	}
	
	public Boolean isEquals(Pantano topografia) {
		return false;
	}
	
	@Override
	public Boolean isEquals(Mixta topografia) {
		TopografiaComponent auxComponenteUno;
		TopografiaComponent auxComponenteDos;
		
		for(int i = 0; i<this.getComponentes().size(); i++) {
			auxComponenteUno = this.getComponentes().get(i);
			auxComponenteDos = topografia.getComponentes().get(i);
			if(!auxComponenteUno.isEquals(auxComponenteDos)) {
				return false;
			}
		}
		return true;
	}
	
	@Override
	public Boolean isEquals(TopografiaComponent otraTopografia) {
		return otraTopografia.isEquals(this);
	}
}
