package ar.edu.unlp.info.oo1.ej6;

public class Cliente {
	private String nombre;
	private String apellido;
	private String email;
	
	public Cliente(String nombre, String apellido, String email) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}

	public String getEmail() {
		return email;
	}
	
}
