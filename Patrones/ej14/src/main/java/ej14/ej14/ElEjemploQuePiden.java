package ej14.ej14;

import java.time.LocalDate;

public class ElEjemploQuePiden {

	public static void main(String[] args) {
		Garantia auto = new Auto(0.7, "Toyota", 10.0, 500.0, 3);
		
		//EL VALOR PRENDARIO DEBERIA SER DE 255,15
		System.out.println(auto.getValorPrendario());
		
		Garantia alquiler = new Alquiler(0.9, LocalDate.of(2025, 01, 01), LocalDate.of(2026, 01, 05), 700.0);
	
		//EL VALOR PRENDARIO DEBERIA SER DE 7560
		System.out.println(alquiler.getValorPrendario());
		
		Garantia combinada = new Combinada(0.5);
		
		combinada.addBien(auto);
		combinada.addBien(alquiler);
		
		//EL VALOR PRENDARIO DEBERIA SER DE 4382.25
		System.out.println(combinada.getValorPrendario());
	}

}
