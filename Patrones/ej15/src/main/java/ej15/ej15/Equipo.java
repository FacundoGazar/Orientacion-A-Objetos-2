package ej15.ej15;

import java.util.List;
import java.util.ArrayList;

public class Equipo {
	private List<Componente> componentes;
	
	public Equipo() {
		this.componentes = new ArrayList<Componente>();
	}
	
	public void addComponente(Componente componente) {
		this.componentes.add(componente);
	}
	
	public Double getPresupuesto() {
		return this.componentes.stream().mapToDouble(componente -> componente.getPrecio()).
				sum();
	}
	
	public Double getConsumo() {
		return this.componentes.stream().mapToDouble(componente -> componente.getConsumo()).
					sum();
	}
	
	public Double getPrecioFinal() {
		Double presupuesto = this.getPresupuesto();
		
		return presupuesto + (presupuesto * 0.21);
	}
}
