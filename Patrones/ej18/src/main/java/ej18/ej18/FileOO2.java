package ej18.ej18;

import java.time.LocalDate;
import java.util.List;

public class FileOO2 implements FileComponent{
	private String nombre;
	private String extension;
	private Double tamano;
	private LocalDate fechaCreacion;
	private LocalDate fechaModificacion;
	private List<String> permisos;
	
	public FileOO2(String nombre, String extension, Double tamano, List<String> permisos) {
		this.nombre = nombre;
		this.extension = extension;
		this.tamano = tamano;
		this.fechaCreacion = LocalDate.now();
		this.fechaModificacion = LocalDate.now();
		this.permisos = permisos;
	}
	
	public String prettyPrint() {
		return this.nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getExtension() {
		return extension;
	}

	public Double getTamano() {
		return tamano;
	}

	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}

	public LocalDate getFechaModificacion() {
		return fechaModificacion;
	}

	public List<String> getPermisos() {
		return permisos;
	}
	
}
