package ar.edu.unlp.info.oo1.ej9;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Auto auto = new Auto(500.0, "Tito");
		
		//no es necesario porque ya se crea con esa estrategia pero bueno se la seteo igual.
		auto.setCancelacionStrategy(new Flexible());
		
		Reserva reserva = new Reserva(10, LocalDate.now().plusDays(10), auto);
		
		System.out.println("Reembolso con politica flexible: $"+ reserva.montoARembolsar(LocalDate.now()));
		
		auto.setCancelacionStrategy(new Moderada());
		
		System.out.println("Reembolso con politica flexible: $"+ reserva.montoARembolsar(LocalDate.now()));
	}

}
