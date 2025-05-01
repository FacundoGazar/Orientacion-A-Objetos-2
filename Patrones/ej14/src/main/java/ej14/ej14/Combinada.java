package ej14.ej14;

import java.util.List;
import java.util.ArrayList;

public class Combinada extends Garantia{
	private List<Garantia> listaBienes;
	
	public Combinada(Double liquidez) {
		super(liquidez);
		listaBienes = new ArrayList<Garantia>();
	}
	
	public Double getValor() {
		return this.getListaBienes().stream().mapToDouble(bien -> bien.getValor()).
				sum();
	}
	
	public void addBien(Garantia bien) {
		this.listaBienes.add(bien);
	}
	
	public void removeBien(Garantia bien) {
		this.listaBienes.remove(bien);
	}
	
	public List<Garantia> getListaBienes(){
		return this.listaBienes;
	}
}
